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
public class Patient extends Person {
    private EncounterHistory encounterHistory;
    
    public Patient(){
        this.encounterHistory = new EncounterHistory();
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }
    
    public void newVitalSign(Encounter encounter){
        this.encounterHistory.addEncounter(encounter);
    }
    
    public boolean check(VitalSigns vs){
        int flag=0;
        if(age == 0){
            if(!(vs.getRespiratotyRate()>=30 && vs.getRespiratotyRate()<=50)){
                flag = 1;
                return false;
            }
            if(!(vs.getHeartRate()>=120 && vs.getHeartRate()<=160)){
                return false;
            }
            if(!(vs.getSystolicBP()>=50 && vs.getSystolicBP()<=70)){
                return false;
            }
            if(!(vs.getWeight_kg()>=2 && vs.getWeight_kg()<=3)){
                return false;
            }
            if(!(vs.getWeight_pd()>=4.5 && vs.getWeight_pd()<=7)){
                return false;
            }
        }
        else if(age<1){
            if(!(vs.getRespiratotyRate()>=20 && vs.getRespiratotyRate()<=30)){
                flag = 1;
                return false;
            }
            if(!(vs.getHeartRate()>=80 && vs.getHeartRate()<=140)){
                return false;
            }
            if(!(vs.getSystolicBP()>=70 && vs.getSystolicBP()<=100)){
                return false;
            }
            if(!(vs.getWeight_kg()>=4 && vs.getWeight_kg()<=10)){
                return false;
            }
            if(!(vs.getWeight_pd()>=9 && vs.getWeight_pd()<=22)){
                return false;
            }
        }
        else if(age<3){
            if(!(vs.getRespiratotyRate()>=20 && vs.getRespiratotyRate()<=30)){
                flag = 1;
                return false;
            }
            if(!(vs.getHeartRate()>=80 && vs.getHeartRate()<=130)){
                return false;
            }
            if(!(vs.getSystolicBP()>=80 && vs.getSystolicBP()<=110)){
                return false;
            }
            if(!(vs.getWeight_kg()>=10 && vs.getWeight_kg()<=14)){
                return false;
            }
            if(!(vs.getWeight_pd()>=22 && vs.getWeight_pd()<=31)){
                return false;
            }
        }
        else if(age<=5){
            if(!(vs.getRespiratotyRate()>=20 && vs.getRespiratotyRate()<=30)){
                flag = 1;
                return false;
            }
            if(!(vs.getHeartRate()>=80 && vs.getHeartRate()<=120)){
                return false;
            }
            if(!(vs.getSystolicBP()>=80 && vs.getSystolicBP()<=110)){
                return false;
            }
            if(!(vs.getWeight_kg()>=14 && vs.getWeight_kg()<=18)){
                return false;
            }
            if(!(vs.getWeight_pd()>=31 && vs.getWeight_pd()<=40)){
                return false;
            }
        }
        else if(age<12){
            if(!(vs.getRespiratotyRate()>=20 && vs.getRespiratotyRate()<=30)){
                flag = 1;
                return false;
            }
            if(!(vs.getHeartRate()>=70 && vs.getHeartRate()<=110)){
                return false;
            }
            if(!(vs.getSystolicBP()>=80 && vs.getSystolicBP()<=120)){
                return false;
            }
            if(!(vs.getWeight_kg()>=20 && vs.getWeight_kg()<=42)){
                return false;
            }
            if(!(vs.getWeight_pd()>=41 && vs.getWeight_pd()<=92)){
                return false;
            }
        }
        else{
            if(!(vs.getRespiratotyRate()>=12 && vs.getRespiratotyRate()<=20)){
                flag = 1;
                return false;
            }
            if(!(vs.getHeartRate()>=55 && vs.getHeartRate()<=105)){
                return false;
            }
            if(!(vs.getSystolicBP()>=110 && vs.getSystolicBP()<=120)){
                return false;
            }
            if(!(vs.getWeight_kg()>50)){
                return false;
            }
            if(!(vs.getWeight_pd()>110)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isPatientNormal(){
        ArrayList<Encounter> encList = encounterHistory.getEncounterList();
        if(encList.isEmpty()){
            return false;
        }
        Encounter enc= encList.get(encList.size()-1);
        VitalSigns vs=enc.getVs();
        
        return check(vs);
    }
    
    
    private boolean checkRespiratory(VitalSigns current, double age){
        if(age==0){
            if(current.getRespiratotyRate()>=30 && current.getRespiratotyRate()<=50) return true;
            else return false;
        }
        else if(age<1){
            if(current.getRespiratotyRate()>=20 && current.getRespiratotyRate()<=30) return true;
            else return false;
        }
        else if(age<3){
            if(current.getRespiratotyRate()>=20 && current.getRespiratotyRate()<=30) return true;
            else return false;
        }
        else if(age<=5){
            if(current.getRespiratotyRate()>=20 && current.getRespiratotyRate()<=30) return true;
            else return false;
        }
        else if(age<12){
            if(current.getRespiratotyRate()>=20 && current.getRespiratotyRate()<=30) return true;
            else return false;
        }
        else{
            if(current.getRespiratotyRate()>=12 && current.getRespiratotyRate()<=20) return true;
            else return false;
        }
    }
    
    private boolean checkHeart(VitalSigns current, double age){
        if(age==0){
            if(current.getHeartRate()>=120 && current.getHeartRate()<=160) return true;
            else return false;
        }
        else if(age<1){
            if(current.getHeartRate()>=80 && current.getHeartRate()<=140) return true;
            else return false;
        }
        else if(age<3){
            if(current.getHeartRate()>=80 && current.getHeartRate()<=130) return true;
            else return false;
        }
        else if(age<=5){
            if(current.getHeartRate()>=80 && current.getHeartRate()<=120) return true;
            else return false;
        }
        else if(age<12){
            if(current.getHeartRate()>=70 && current.getHeartRate()<=110) return true;
            else return false;
        }
        else{
            if(current.getHeartRate()>=55 && current.getHeartRate()<=105) return true;
            else return false;
        }
        
    }
    
    private boolean systolicBP(VitalSigns current, double age){
        if(age==0){
            if(current.getSystolicBP()>=50 && current.getSystolicBP()<=70) return true;
            else return false;
        }
        else if(age<1){
            if(current.getSystolicBP()>=70 && current.getSystolicBP()<=100) return true;
            else return false;
        }
        else if(age<3){
            if(current.getSystolicBP()>=80 && current.getSystolicBP()<=110) return true;
            else return false;
        }
        else if(age<=5){
            if(current.getSystolicBP()>=80 && current.getSystolicBP()<=110) return true;
            else return false;
        }
        else if(age<12){
            if(current.getSystolicBP()>=80 && current.getSystolicBP()<=120) return true;
            else return false;
        }
        else{
            if(current.getSystolicBP()>=110 && current.getSystolicBP()<=120) return true;
            else return false;
        }
    }
    
    private boolean weightKG(VitalSigns current, double age){
        if(age==0){
            if(current.getWeight_kg()>=2 && current.getWeight_kg()<=3) return true;
            else return false;
        }
        else if(age<1){
            if(current.getWeight_kg()>=4 && current.getWeight_kg()<=10) return true;
            else return false;
        }
        else if(age<3){
            if(current.getWeight_kg()>=10 && current.getWeight_kg()<=14) return true;
            else return false;
        }
        else if(age<=5){
            if(current.getWeight_kg()>=14 && current.getWeight_kg()<=18) return true;
            else return false;
        }
        else if(age<12){
            if(current.getWeight_kg()>=20 && current.getWeight_kg()<=42) return true;
            else return false;
        }
        else{
            if(current.getWeight_kg()>50) return true;
            else return false;
        }
    }
    
    private boolean weightPD(VitalSigns current, double age){
        if(age==0){
            if(current.getWeight_pd()>=2 && current.getWeight_pd()<=3) return true;
            else return false;
        }
        else if(age<1){
            if(current.getWeight_pd()>=4 && current.getWeight_pd()<=10) return true;
            else return false;
        }
        else if(age<3){
            if(current.getWeight_pd()>=10 && current.getWeight_pd()<=14) return true;
            else return false;
        }
        else if(age<=5){
            if(current.getWeight_pd()>=14 && current.getWeight_pd()<=18) return true;
            else return false;
        }
        else if(age<12){
            if(current.getWeight_pd()>=20 && current.getWeight_pd()<=42) return true;
            else return false;
        }
        else{
            if(current.getWeight_pd()>50) return true;
            else return false;
        }
    }
    
    
    public boolean isThisVitalSignNormal(String attr){
        
        ArrayList<Encounter> encList = encounterHistory.getEncounterList();
        if(encList.isEmpty()){
            return false;
        }
        Encounter enc= encList.get(encList.size()-1);
        VitalSigns vs=enc.getVs();
        
        if("Respiratory Rate".equals(attr)){
            return checkRespiratory(vs, this.age);
        }
        else if("Heart Rate".equals(attr)){
            return checkHeart(vs, this.age);
        }
        else if("Systolic Blood Pressure".equals(attr)){
            return systolicBP(vs, this.age);
        }
        else if("Weight in kilos".equals(attr)){
            return weightKG(vs, this.age);
        }
        else if("Weight in pounds".equals(attr)){
            return weightPD(vs, this.age);
        }
        else{
            java.lang.System.out.println("Not a valid attribute");
            return false;
        }
    }
    
    public VitalSigns getCurrentVitalSign(){
        return encounterHistory.getEncounterList().get(encounterHistory.getEncounterList().size()-1).getVs();
    }

    public boolean isPatientNormal(VitalSigns vs) {
        return check(vs);
    }
}
