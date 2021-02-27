/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.Part3.Testing;

/**
 *
 * @author gauthamrajsimhapulipati
 */

import Assignment2.Part3.Model.*;
import java.util.*;


public class TestModel {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        
        PersonDirectory perD = new PersonDirectory();
        PatientDirectory patD = new PatientDirectory();
        
        while(true){
            System.out.println("Press -1 to exit or Enter the age of the new person ");
            double nn= sc.nextDouble();
            if(nn==-1){
                break;
            }
            Person p = new Patient();
            p.setAge(nn);
            System.out.println("Enter the First name ");
            p.setFirstName(sc1.nextLine());
            System.out.println("Enter the last name");
            p.setLastName(sc1.nextLine());
            System.out.println("Enter the Date of Birth");
            p.setDateOfBirth(sc1.nextLine());
            System.out.println("Enter 1 if this person is a patient or enter any number to go the next session");
            nn=sc.nextInt();
            if(nn==1){
                Patient pt=(Patient) p;
                while(true){
                    System.out.println("Press 1 to enter vital signs of this patient or any other number to go to enter new person session");
                    int kk=sc.nextInt();
                    if(kk!=1){
                        patD.addPatient(pt);
                        break;
                    }
                    Encounter enc=new Encounter();
                    System.out.println("Enter the Respiratory rate, heart rate, Systolic Blood pressure, weight in kilos and pounds in this order");
                    VitalSigns vs=enc.getVs();
                    vs.setRespiratotyRate(sc.nextDouble());
                    vs.setHeartRate(sc.nextDouble());
                    vs.setSystolicBP(sc.nextDouble());
                    vs.setWeight_kg(sc.nextDouble());
                    vs.setWeight_pd(sc.nextDouble());
                    pt.newVitalSign(enc);
                }
                
            }
            perD.addPerson(p);
        }
        System1 sys= new System1();
        sys.setPatientDirectory(patD);
        sys.setPersonDirectory(perD);
        
        // output
        
        PersonDirectory personD= sys.getPersonDirectory();
        
        for(Person p1:personD.getPersonList()){
            System.out.println("Person name :"+p1.getFirstName()+" "+p1.getLastName());
        }
        
        PatientDirectory patientD= sys.getPatientDirectory();
        
        for(Patient p2:patientD.getPatientList()){
            System.out.println("Patient name :"+p2.getFirstName()+" "+p2.getLastName());
            System.out.println("Current vital sign results :"+p2.isPatientNormal());
            for(Encounter enc:p2.getEncounterHistory().getEncounterList()){
                System.out.println("Vital signs list status history :"+p2.isPatientNormal(enc.getVs()));
            }
            System.out.println("Enter attrubute name to know the status: ");
            String sr=sc1.nextLine();
            System.out.println(sr+"status "+p2.isThisVitalSignNormal(sr));
        }
        
    }
}
