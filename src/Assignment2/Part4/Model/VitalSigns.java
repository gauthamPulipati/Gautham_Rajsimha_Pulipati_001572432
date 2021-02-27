/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.Part4.Model;

import java.time.LocalDateTime;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class VitalSigns {
    private double respiratotyRate;
    private double heartRate;
    private double systolicBP;
    private double weight_kg;
    private double weight_pd;
    LocalDateTime time;
    
    public VitalSigns(){
        this.time=LocalDateTime.now();
    }

    public double getRespiratotyRate() {
        return respiratotyRate;
    }

    public void setRespiratotyRate(double respiratotyRate) {
        this.respiratotyRate = respiratotyRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getSystolicBP() {
        return systolicBP;
    }

    public void setSystolicBP(double systolicBP) {
        this.systolicBP = systolicBP;
    }

    public double getWeight_kg() {
        return weight_kg;
    }

    public void setWeight_kg(double weight_kg) {
        this.weight_kg = weight_kg;
    }

    public double getWeight_pd() {
        return weight_pd;
    }

    public void setWeight_pd(double weight_pd) {
        this.weight_pd = weight_pd;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
