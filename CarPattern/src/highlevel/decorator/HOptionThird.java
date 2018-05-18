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
public class HOptionThird implements HighLevelDecorator{
    
    HighLevelDecorator highLevelDecorator;
    
    public HOptionThird(HighLevelDecorator hd) {
        highLevelDecorator = hd;
    }
    
    @Override
    public String property() {
        return highLevelDecorator.property()+" ,High-tech Paket: R Link 2.0 & 7’’ Dokunmatik Ekran";
    }

    @Override
    public double price() {
        return 5.000 + highLevelDecorator.price();
    }
    
}
