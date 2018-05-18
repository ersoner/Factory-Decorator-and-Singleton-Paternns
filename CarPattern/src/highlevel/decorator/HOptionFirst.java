/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highlevel.decorator;

import highlevel.HighLevelDecorator;

/**
 *
 * @author SoNeR
 */
public class HOptionFirst implements HighLevelDecorator{
    
    HighLevelDecorator highLevelDecorator;
    
    public HOptionFirst(HighLevelDecorator hd) {
        highLevelDecorator = hd;
    }
    
    @Override
    public String property() {
        return highLevelDecorator.property()+" ,17'' Alüminyum Alaşımlı Jantlar";
    }

    @Override
    public double price() {
        return 1.700 + highLevelDecorator.price();
    }
    
}
