/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.Part4.Model;

import java.util.ArrayList;

/**
 *
 * @author gauthamrajsimhapulipati
 */
public class Community {
    
    private String communityName;
    ArrayList<House> houses;
    private City city;
    
    public Community(String communityName){
        this.communityName = communityName;
        this.houses = new ArrayList<>();
    }
    
    public void addCity(City city){
        this.city=city;
    }

    public City getCity() {
        return city;
    }

    public String getCommunityName() {
        return communityName;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(House house) {
        this.houses.add(house);
    }
    
}
