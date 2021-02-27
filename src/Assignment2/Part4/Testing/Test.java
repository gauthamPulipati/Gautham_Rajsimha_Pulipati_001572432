/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.Part4.Testing;

/**
 *
 * @author gauthamrajsimhapulipati
 */

import Assignment2.Part4.Model.*;

public class Test {
    public static void main(String[] args){
        
        System1 sys= new System1();
        PersonDirectory pd = new PersonDirectory();
        PatientDirectory ppd= new PatientDirectory();
        for(int i=0;i<20;i++){
            Person p = new Patient();
            p.setFirstName(String.valueOf(i+1)+" person");
            p.setLastName(String.valueOf(i+1)+" lname");
            p.setDateOfBirth("random");
            p.setAge(i*2);
            pd.addPerson(p);
            if(i%2==0){
                Patient pt=(Patient) p;
                ppd.addPatient(pt);
            }
        }
        int a=16, b=80, c=115, d=55, e=100, ten=10;
        
        for(Patient pat:ppd.getPatientList()){
         
            for(int i=1;i<=10;i++){
                Encounter enc = new Encounter();
                VitalSigns vs = enc.getVs();
                vs.setRespiratotyRate(a+(i*ten));
                vs.setHeartRate(130);
                vs.setSystolicBP(c+(ten*i));
                vs.setWeight_kg(d+(ten*i));
                vs.setWeight_pd(e+(ten*i));
            
                pat.newVitalSign(enc);
            }
        }
        int i=1;
        for(Patient pat:ppd.getPatientList()){
            System.out.println((i)+" Patient status "+pat.isPatientNormal());
            System.out.println((i++)+" Patient heart "+pat.isThisVitalSignNormal("Heart Rate"));
        }
        
        PersonDirectory perD = sys.getPersonDirectory();
        
        City city = new City();
        sys.setCity(city);
        Community com1 = new Community("Community 1");
        Community com2 = new Community("Community 2");
        
        city.addCommunities(com1);
        com1.addCity(city);
        city.addCommunities(com2);
        com2.addCity(city);
        
        for(int j=0;j<2;j++){
            House h = new House();
            h.setHouseNo(j+1);
            h.setHouseName("House "+String.valueOf(j+1));
            h.setStreet("random");
            com1.setHouses(h);
            h.addCommunity(com1);
            for(int k=0;k<5;k++){
                h.addPerson(perD.getPersonList().get((j+1)*k));
                perD.getPersonList().get((j+1)*k).setHouse(h);
            }
        }
        for(int j=0;j<5;j++){
            House h = new House();
            h.setHouseNo(j+1);
            h.setHouseName("House "+String.valueOf(j+1));
            h.setStreet("random2");
            com2.setHouses(h);
            h.addCommunity(com2);
            for(int k=0;k<2;k++){
                h.addPerson(perD.getPersonList().get((j+1)*k));
                perD.getPersonList().get((j+1)*k).setHouse(h);
            }
        }
        
        //for community 2
        
        
    }
}
