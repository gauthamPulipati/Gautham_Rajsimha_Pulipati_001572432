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
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<>();
    }
    
    public void addPerson(Person person){
        this.personList.add(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
}
