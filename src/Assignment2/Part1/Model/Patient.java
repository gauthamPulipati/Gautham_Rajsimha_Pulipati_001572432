/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.Part1.Model;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class Patient {
    private double age;
    VitalSigns vs;
    
    public Patient(double age){
        this.age = age;
        vs=new VitalSigns();
    }
    
    public VitalSigns getVs() {
        return vs;
    }

    public double getAge() {
        return age;
    }
    
    public boolean isPatientNormal(){
        int flag=0;
        if(age==0){
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
}
