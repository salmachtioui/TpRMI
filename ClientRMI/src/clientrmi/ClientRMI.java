/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.dao.IDao;
import server.entites.Machine;
import server.entites.Salle;

/**
 *
 * @author hp
 */
public class ClientRMI {

   
    public static void main(String[] args) {
        try {
            
            IDao<Salle> dao1 = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/dao1");
            IDao<Machine> dao = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/dao");
             dao.create(new Machine("AB55","Sony",4000));
            dao.create(new Machine("AB66","Apple",4000));
            dao.create(new Machine("AB77","Acces",4000));
            for(Machine m : dao.findAll())
                System.out.println(m);
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
