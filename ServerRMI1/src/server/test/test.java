/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.test;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.dao.IDao;
import server.entites.Machine;
import server.entites.Salle;
import server.services.MachineService;
import server.services.SalleService;





public class test {
    public static void main(String[] args) {
        try {
            IDao<Machine> dao=new MachineService();
            IDao<Salle> dao1=new SalleService();
             dao1.create(new Salle("A555"));
            dao1.create(new Salle("A666"));
            dao1.create(new Salle("A777"));
            dao.create(new Machine("AB55","Sony",4000,1));
            dao.create(new Machine("AB66","Apple",4000,2));
            dao.create(new Machine("AB77","Acces",4000,3));
            for(Machine m : dao.findAll())
                System.out.println(m);
        } catch (RemoteException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
