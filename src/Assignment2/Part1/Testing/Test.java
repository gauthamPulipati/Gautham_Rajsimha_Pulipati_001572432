/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.Part1.Testing;

/**
 *
 * @author gauthamrajsimhapulipati
 */

import java.util.*;
import Assignment2.Part1.Model.Patient;
import Assignment2.Part1.Model.VitalSigns;

public class Test {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        ArrayList<Patient> p = new ArrayList<>();
        
        while(true){
            Patient p1;
            System.out.println("Enter the Patient's age or -1 to exit");
            double nu=sc.nextDouble();
            p1= new Patient(nu);
            if(nu == -1){
                break;
            }
            VitalSigns vs=p1.getVs();
            
            System.out.println("Enter the Patient's Respiratory Rate");
            vs.setRespiratotyRate(sc.nextDouble());
            
            System.out.println("Enter the Patient's Hreat Rate");
            vs.setHeartRate(sc.nextDouble());
            
            System.out.println("Enter the Patient's Systolic Blood Pressure");
            vs.setSystolicBP(sc.nextDouble());
            
            System.out.println("Enter the Patient's Weight in Kilos");
            vs.setWeight_kg(sc.nextDouble());
            
            System.out.println("Enter the Patient's Weight in Pounds");
            vs.setWeight_pd(sc.nextDouble());
            
            p.add(p1);
            //break;
        }
        int i=1;
        for(Patient pp:p){
            
            System.out.println("For "+(i++)+" patient, Vital Signs condition: "+pp.isPatientNormal());
            //break;
        }
    }
}
