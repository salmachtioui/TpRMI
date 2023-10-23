/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import server.dao.IDao;
import server.dao.MachineServiceRMI;
import server.entites.Machine;
import server.entites.Salle;
import server.util.HibernateUtil;

/**
 *
 * @author hp
 */
public class MachineService extends UnicastRemoteObject implements IDao<Machine> ,MachineServiceRMI {

    public MachineService() throws RemoteException {
        super();
    }


    @Override
    public boolean create(Machine o) throws RemoteException {
        Session session = null;
        Transaction tx = null;
        boolean etat=false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            etat=true;
            return true;
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return etat;
        
    }

    @Override
    public boolean update(Machine o) throws RemoteException {
         Session session = null;
        Transaction tx = null;
        boolean etat=false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            etat=true;
            return true;
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return etat;
    }

    @Override
    public boolean delete(Machine o) throws RemoteException {
         Session session = null;
        Transaction tx = null;
        boolean etat=false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            etat=true;
            return true;
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return etat;
    }

    @Override
    public boolean findBy(int id) throws RemoteException {
        Machine machine = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            machine = (Machine) session.get(Machine.class, id);
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return true;
    }

@Override
  public List<Machine> getMachineBySalle(Salle salle) throws RemoteException {
    Session session = null;
    Transaction tx = null;

    List<Machine> machines = new ArrayList<>(); // Initialiser une liste vide.

    try {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();

        salle = (Salle) (session.createCriteria(Salle.class)
            .add(Restrictions.eq("code", salle.getCode()))
            .uniqueResult());

        if (salle != null) {
            machines = salle.getMachines();
            System.out.println("Les machines de la salle " + salle.getCode() + " sont :");
            for (Machine machine : machines) {
                System.out.println(machine);
            }
        } else {
            System.out.println("La salle " + salle.getCode() + " n'existe pas ou ne contient aucune machine.");
        }

        tx.commit();
    } catch (HibernateException e) {
        if (tx != null)
            tx.rollback();
        // Gérez l'exception HibernateException selon vos besoins
    } finally {
        if (session != null)
            session.close();
    }

    return machines; // Retournez la liste des machines.
}


    
    @Override
    public List<Machine> findAll() throws RemoteException {
        List<Machine> machines = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            machines = session.getNamedQuery("findAll").list();
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return machines;
    }

    
    
}
