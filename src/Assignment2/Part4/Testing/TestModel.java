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
import java.util.*;

public class TestModel {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        
        System1 sys=new System1();
        
        PersonDirectory perD = new PersonDirectory();
        PatientDirectory patD = new PatientDirectory();
        City city = new City();
        
        sys.setPersonDirectory(perD);
        sys.setPatientDirectory(patD);
        sys.setCity(city);
        
        System.out.println("Enter the city name, state and country in the same order");
        city.setCityName(sc1.nextLine());
        city.setState(sc1.nextLine());
        city.setCountry(sc1.nextLine());
        
        // creating communities, houses each, people in every house, where one is a patient
        
        while(true){
            System.out.println("Press -1 to exit or any other number to enter start a new community ");
            int nn=sc.nextInt();
            if(nn==-1){
                break;
            }
            System.out.println("Enter the community name");
            Community com= new Community(sc1.nextLine());
            com.addCity(city);
            city.addCommunities(com);
            
            while(true){
                System.out.println("Press 1 to enter a house in this community or any number to go to add new community session");
                int nn1=sc.nextInt();
                if(nn1!=1){
                    break;
                }
                House house = new House();
                house.addCommunity(com);
                System.out.println("Enter the house no ");
                house.setHouseNo(sc.nextInt());
                System.out.println("Enter the house name");
                house.setHouseName(sc1.nextLine());
                System.out.println("Enter the Street in which this house is");
                house.setStreet(sc1.nextLine());
                com.setHouses(house);
                while(true){
                    System.out.println("Press 1 to enter a person in this house or any number to go to new house in this community");
                    int nn2= sc.nextInt();
                    if(nn2!=1){
                        break;
                    }
                    Person p = new Patient();
                    System.out.println("Enter the person's first name");
                    p.setFirstName(sc1.nextLine());
                    System.out.println("Enter the person's last name");
                    p.setLastName(sc1.nextLine());
                    System.out.println("Enter the person's age");
                    p.setAge(sc.nextInt());
                    System.out.println("Enter the person's Date of Birth");
                    p.setDateOfBirth(sc1.nextLine());
                    perD.addPerson(p);
                    p.setHouse(house);
                    house.addPerson(p);
                }
            }
        }
        
        for(Person p:perD.getPersonList()){
            System.out.println("Person name is :"+p.getFirstName()+" "+p.getLastName());
            System.out.println("Press 1 if this person is a patient");
            int nn3=sc.nextInt();
            if(nn3==1){
                Patient pat=(Patient) p;
                while(true){
                    System.out.println("Press 1 to enter this patient's vital signs");
                    int nn4=sc.nextInt();
                    if(nn4!=1){
                        break;
                    }
                    Encounter enc=new Encounter();
                    System.out.println("Enter Respiratory rate, heart rate, Systolic Blood pressure, weight in kilos and pounds in the same order");
                    VitalSigns vs=enc.getVs();
                    vs.setRespiratotyRate(sc.nextDouble());
                    vs.setHeartRate(sc.nextDouble());
                    vs.setSystolicBP(sc.nextDouble());
                    vs.setWeight_kg(sc.nextDouble());
                    vs.setWeight_pd(sc.nextDouble());
                    pat.newVitalSign(enc);
                }
                patD.addPatient(pat);
            }
        }
        
        for(Community co:city.getCommunities()){
            int count=0;
            for(House ho:co.getHouses()){
                for(Person p:ho.getFamily()){
                    if(patD.getPatientList().contains((Patient)p)){
                        Patient paa=(Patient)p;
                        if(paa.isPatientNormal()==false){
                            count++;
                        }
                    }
                }
            }
            System.out.println("No of abnormal cases in this community "+co.getCommunityName()+" are "+count);
        }
    }
}
