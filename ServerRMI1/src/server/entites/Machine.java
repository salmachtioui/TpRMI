/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import server.util.HibernateUtil;

/**
 *
 * @author hp
 */
@Entity
@NamedQuery(name = "findAll", query = "from Machine")
@NamedNativeQuery(name = "findAllNative", query = "Select * from machine", resultClass = Machine.class)
public class Machine implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ref;
    private String marque;
    private int prix;
    private int salle_id;
    @ManyToOne
    @JoinColumn(name = "salle_id", insertable = false, updatable = false)
    private Salle salle;

    public Machine(String ref, String marque, int prix, Salle salle) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.salle = salle;
    }

    public Machine(String ref, String marque, int prix, int salle_id, Salle salle) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.salle_id = salle_id;
        this.salle = salle;
    }

    public int getSalle_id() {
        return salle_id;
    }

    public void setSalle_id(int salle_id) {
        this.salle_id = salle_id;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Machine() {
    }

    public Machine(String ref, String marque, int prix) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Machine(String ref, String marque, int prix, int salle_id) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.salle_id = salle_id;
    }
   

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", ref=" + ref + ", marque=" + marque + ", prix=" + prix + ", salle_id=" + salle_id + ", salle=" + salle + '}';
    }

   

}
