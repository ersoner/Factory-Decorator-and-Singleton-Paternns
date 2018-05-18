/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpattern;

import Premium.PremiumPackage;
import highlevel.HighLevelPackage;
import intermadiate.IntermadiatePackage;

/**
 *
 * @author SoNeR
 */
public class CarFactory {
    
    //singleton
    private static CarFactory instance = new CarFactory();

    public static CarFactory getInstance() {
        return instance;
    }
    
    //factory
    public IPackage createCar(String level, String model, Integer year){
        
        switch(level){
            case "intermadiate":
                return new IntermadiatePackage(model,year);
            case "highlevel":
                return new HighLevelPackage(model,year);
            case "premium":
                return new PremiumPackage(model,year); 
            default:
                return null;
        }
    }
}
