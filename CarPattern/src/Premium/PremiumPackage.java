/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Premium;

import carpattern.IPackage;

/**
 *
 * @author SoNeR
 */
public class PremiumPackage implements IPackage, PremiumDecorator {
    
    String _model;
    Integer _year;
    
    @Override
    public String property() {
        return "Aracınız Premium Pakete Sahip";
    }

    @Override
    public double price() {
        return 150.000;
    }
    
    public PremiumPackage(String model, Integer year){
        this._model = model;
        this._year = year;
    }
}
