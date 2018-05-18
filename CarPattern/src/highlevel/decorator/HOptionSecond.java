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
public class HOptionSecond implements HighLevelDecorator{
    
    HighLevelDecorator highLevelDecorator;
    
    public HOptionSecond(HighLevelDecorator hd) {
        highLevelDecorator = hd;
    }
    
    @Override
    public String property() {
        return highLevelDecorator.property()+" ,TouchScreen Paket";
    }
    
    @Override
    public double price() {
        return 2.800 + highLevelDecorator.price();
    }
    
}
