/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.Part4.Model;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class Encounter {
    private VitalSigns vs;
    
    public Encounter(){
        this.vs = new VitalSigns();
    }

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }
}
