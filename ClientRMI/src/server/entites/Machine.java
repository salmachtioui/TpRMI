/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.entites;

import java.io.Serializable;

public class Machine implements Serializable{

   
    private int id;
    private String ref;
    private String marque;
    private int prix;
    private Salle salle;

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

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Machine( String ref, String marque, Salle salle) {
        this.ref = ref;
        this.marque = marque;
        this.salle = salle;
    }

    public Machine(int id, String ref, String marque, int prix, Salle salle) {
        this.id = id;
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.salle = salle;
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

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", ref=" + ref + ", marque=" + marque + ", prix=" + prix + '}';
    }

}
