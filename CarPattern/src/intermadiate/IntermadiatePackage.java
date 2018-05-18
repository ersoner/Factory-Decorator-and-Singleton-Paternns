/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermadiate;

import carpattern.IPackage;

/**
 *
 * @author SoNeR
 */
public class IntermadiatePackage implements IPackage, IntermadiateDecorator {
    String _model;
    Integer _year;
    
    
    @Override
    public String property() {
        return "Aracınız Intermadiate Pakete Sahip";
    }

    @Override
    public double price() {
        return 70.000;
    }
    
    public IntermadiatePackage(String model, Integer year){
        this._model = model;
        this._year = year;
    }
}
