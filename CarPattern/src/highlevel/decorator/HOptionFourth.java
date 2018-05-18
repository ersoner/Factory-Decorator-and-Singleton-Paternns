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
public class HOptionFourth implements HighLevelDecorator{
    
    HighLevelDecorator highLevelDecorator;
    
    public HOptionFourth(HighLevelDecorator hd) {
        highLevelDecorator = hd;
    }
    
    @Override
    public String property() {
        return highLevelDecorator.property()+" ,Geri Görüş Kamerası";
    }

    @Override
    public double price() {
        return 1.150 + highLevelDecorator.price();
    }
    
}
