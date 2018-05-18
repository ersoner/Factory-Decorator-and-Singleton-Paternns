/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Premium.decorator;

import Premium.PremiumDecorator;

/**
 *
 * @author SoNeR
 */
public class POptionFifth implements PremiumDecorator{
    
    PremiumDecorator premiumDecorator;
    
    public POptionFifth(PremiumDecorator pd) {
        premiumDecorator = pd;
    }
    
    @Override
    public String property() {
        return premiumDecorator.property()+", Head Up Display";
    }

    @Override
    public double price() {
        return 1.900 + premiumDecorator.price();
    }
    
}
