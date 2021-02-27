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

public class Test {
    public static void main(String[] args){
        System1 sys= new System1();
        PersonDirectory pd = new PersonDirectory();
        PatientDirectory ppd= new PatientDirectory();
        for(int i=0;i<10;i++){
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
        
        sys.setPersonDirectory(pd);
        sys.setPatientDirectory(ppd);
        
        int a=16, b=80, c=115, d=55, e=100, ten=10;
        
        for(Patient pat:sys.getPatientDirectory().getPatientList()){
         
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
    }
}
