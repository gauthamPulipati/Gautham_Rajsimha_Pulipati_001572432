/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.Part2.Testing;

/**
 *
 * @author gauthamrajsimhapulipati
 */

import Assignment2.Part2.Model.Patient;
import Assignment2.Part2.Model.VitalSigns;
import java.util.*;

public class Test {
    static void printVitals(VitalSigns vs){
        System.out.println("Respiratory Rate :"+vs.getRespiratotyRate());
        System.out.println("Heart Rate :"+vs.getHeartRate());
        System.out.println("Systolic Blood Pressure :"+vs.getSystolicBP());
        System.out.println("Weight in Kilos :"+vs.getWeight_kg());
        System.out.println("Weight in Pounds :"+vs.getWeight_pd());
        System.out.println("Time :"+vs.getTime());
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        
        ArrayList <Patient> pp = new ArrayList<>();
        
        while(true){
            System.out.println("Enter the age of the patient or -1 to exit");
            double age=sc.nextDouble();
            if(age==-1){
                break;
            }
            Patient p=new Patient(age);
            
            while(true){
                VitalSigns cur=new VitalSigns();
                System.out.println("Enter the Respiratory Rate");
                cur.setRespiratotyRate(sc.nextDouble());
                System.out.println("Enter the Heart Rate");
                cur.setHeartRate(sc.nextDouble());
                System.out.println("Enter the Systolic Blood Pressure");
                cur.setSystolicBP(sc.nextDouble());
                System.out.println("Enter the Weight in Kilos");
                cur.setWeight_kg(sc.nextDouble());
                System.out.println("Enter the Weight in Pounds");
                cur.setWeight_pd(sc.nextDouble());
                
                cur=p.newVitalSign(cur);
                
                System.out.println("Press 1 to enter new vital sign or any other number to exit the current vital signs section");
                int nn=sc.nextInt();
                if(nn!= 1){
                    break;
                }
            }
            pp.add(p);
        }
        int pno=1;
        for(Patient p : pp){
            System.out.println("Patient no "+(pno++)+" with age "+p.getAge());
            System.out.println("Current vitals :");
            printVitals(p.getCurrent());
            System.out.println("Current Vitals Status : "+p.isPatientNormal(p.getCurrent()));
            System.out.println();
            System.out.println("Enter the attribute name to check the status");
            String ss=sc1.nextLine();
            System.out.println(ss+" check for current vital :"+p.isThisVitalSignNormal(p.getCurrent(),ss));
            ArrayList <VitalSigns> vs_list=p.getVitals();
            int num=1;
            for(VitalSigns vs: vs_list){
                System.out.println("Vital sign "+num+" status : "+p.isPatientNormal(vs));
                System.out.println(ss+" check for  vital no "+num+" :"+p.isThisVitalSignNormal(vs, ss));
                num++;
                
            }
            System.out.println("----------");
        }
    }
}
