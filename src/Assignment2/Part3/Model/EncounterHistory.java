/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.Part3.Model;

import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterList;

    public EncounterHistory(){
        this.encounterList = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }
    
    public void addEncounter(Encounter encounter){
        this.encounterList.add(encounter);
    }
    
}
