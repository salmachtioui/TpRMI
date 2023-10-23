/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.entites;

import java.io.Serializable;
import java.util.List;

;

/**
 *
 * @author hp
 */


public class Salle implements Serializable {
  
    private int id;
    private String code;
   
    private List<Machine> machines;

    public Salle() {
    }

    public Salle(String code, List<Machine> machines) {
        this.code = code;
        this.machines = machines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public Salle(int id, String code) {
        this.id = id;
        this.code = code;
    }

    public Salle(String code) {
        this.code = code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
    
}
