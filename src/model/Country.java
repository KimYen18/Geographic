/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author A
 */
public class Country extends EastAsiaCountries implements Comparable<Country>{
    private String countryTerrain;

    public Country() {
    }

    public Country(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public Country(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public void display() {
        System.out.printf("%-10s%-25s%-20.0f%-25s\n", this.countryCode,
                this.countryName, this.totalArea, this.countryTerrain);
    }

    @Override
    public int compareTo(Country o) {
        return this.getCountryName().compareTo(o.getCountryName());
    }

    
    
    
}