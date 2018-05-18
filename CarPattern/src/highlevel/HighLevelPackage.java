/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highlevel;

import carpattern.IPackage;

/**
 *
 * @author SoNeR
 */
public class HighLevelPackage implements IPackage, HighLevelDecorator{
    String _model;
    Integer _year;
    
    @Override
    public String property() {
        return "Aracınız HihLevel Pakete Sahip";
    }

    @Override
    public double price() {
        return 100.000;
    }
    
     public HighLevelPackage(String model, Integer year){
        this._model = model;
        this._year = year;
    }
    
}
