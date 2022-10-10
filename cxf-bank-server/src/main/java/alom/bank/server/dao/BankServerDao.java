package alom.bank.server.dao;

import alom.bank.server.model.Account;
import alom.bank.server.model.Client;
import alom.bank.server.payload.ClientInfo;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Getter
@Setter
public class BankServerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public Integer insertClient(Client client) {
        Transaction tx = null;
        try {
            Session session = sessionFactory.getCurrentSession();
            session.save(client);
            tx = session.beginTransaction();
            session.flush();
            return client.getId();
        } catch (HibernateException he) {
            if(tx != null){
                tx.rollback();
            }
            throw he;
        }
    }

    public Client getClient(ClientInfo info) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(Client.class);
        criteria.add(Restrictions.eq("firstName", info.getFirstName().toUpperCase()))
                .add(Restrictions.eq("lastName", info.getLastName().toUpperCase()))
                .add(Restrictions.eq("dateOfBirth", info.getDateOfBirth()));

        Client client = (Client) criteria.list().get(0);

        return client;
    }

    @Transactional
    public Integer insertAccount(Account account) {
        Transaction tx = null;
        try {
            Session session = sessionFactory.getCurrentSession();
            session.save(account);
            tx = session.beginTransaction();
            session.flush();
            return account.getId();
        } catch (HibernateException he) {
            if(tx != null){
                tx.rollback();
            }
            throw he;
        }
    }

    public Client getClientById(Integer clientId) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(Client.class);
        criteria.add(Restrictions.eq("id", clientId));
        if (criteria.list() != null && criteria.list().size() > 0) {
            return (Client) criteria.list().get(0);
        }

        return null;
    }

    public Account getClientAccount(Integer clientId, String type) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(Account.class);
        criteria.add(Restrictions.eq("clientId", clientId))
                .add(Restrictions.eq("type", type));

        if (criteria.list() != null && criteria.list().size() > 0) {
            Account account = (Account) criteria.list().get(0);
            return account;
        }
        return null;
    }

    public Integer getClientAccount(Integer clientId) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(Account.class);
        criteria.add(Restrictions.eq("clientId", clientId));

        if (criteria.list() != null && criteria.list().size() > 0) {
            return criteria.list().size();
        }
        return null;
    }

    public Account getAccountById(Integer accountId) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(Account.class);
        criteria.add(Restrictions.eq("id", accountId));
        if (criteria.list() != null && criteria.list().size() > 0) {
            return (Account) criteria.list().get(0);
        }

        return null;
    }

    @Transactional
    public void updateAccount(Account account) {
        Transaction tx;
        try {
            Session session = sessionFactory.openSession();
            tx = session.beginTransaction();
            session.merge(account);
            tx.commit();
            session.close();
        } catch (Exception e) {
        }
    }

    @Transactional
    public void deleteAccount(Account account) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(account);
        session.getTransaction().commit();
    }

    @Transactional
    public void deleteClient(Client client) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(client);
        session.getTransaction().commit();
    }
}
