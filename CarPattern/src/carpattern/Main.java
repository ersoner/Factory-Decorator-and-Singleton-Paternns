/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpattern;

import Premium.PremiumPackage;
import Premium.decorator.POptionFifth;
import Premium.decorator.POptionFirst;
import Premium.decorator.POptionSecond;
import highlevel.HighLevelPackage;
import highlevel.decorator.HOptionFirst;
import highlevel.decorator.HOptionThird;
import intermadiate.IntermadiatePackage;
import intermadiate.decorator.IOptionFirst;
import intermadiate.decorator.IOptionSecond;

/**
 *
 * @author SoNeR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CarFactory car = CarFactory.getInstance();
        
        IntermadiatePackage ip = (IntermadiatePackage) car.createCar("intermadiate", "megane", 2018);
        IOptionFirst iof = new IOptionFirst(ip);
        IOptionSecond ios = new IOptionSecond(iof);
        System.out.println("Fiyat: "+ios.price());
        System.out.println(ios.property());
        
        HighLevelPackage highLevelPackage = (HighLevelPackage) car.createCar("highlevel", "megane", 2018);
        HOptionFirst  hof = new HOptionFirst(highLevelPackage);
        HOptionThird hot = new HOptionThird(hof);
        System.out.println("Fiyat: "+hof.price());
        System.out.println(hot.property());
        
        PremiumPackage premiumPackage = (PremiumPackage) car.createCar("premium", "megane", 2018);
        POptionFirst pof = new POptionFirst(premiumPackage);
        POptionSecond pos = new POptionSecond(pof);
        POptionFifth poff = new POptionFifth(pof);
        System.out.println("Fiyat: "+pof.price());
        System.out.println(poff.property());
    }
    
}
