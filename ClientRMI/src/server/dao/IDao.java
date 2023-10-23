/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import server.entites.Machine;
import server.entites.Salle;

/**
 *
 * @author hp
 */
public interface IDao<T> extends Remote {

    boolean create(T o) throws RemoteException;

    boolean update(T o) throws RemoteException;

    boolean delete(T o) throws RemoteException;

    boolean findBy(int id) throws RemoteException;

    List<T> findAll() throws RemoteException;

    public List<Machine> getMachineBySalle(Salle selectedSalle);
}
