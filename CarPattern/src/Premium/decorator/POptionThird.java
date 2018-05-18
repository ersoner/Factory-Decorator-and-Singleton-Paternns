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
public class POptionThird implements PremiumDecorator{
    
    PremiumDecorator premiumDecorator;
    
    public POptionThird(PremiumDecorator pd) {
        premiumDecorator = pd;
    }
    
    @Override
    public String property() {
        return premiumDecorator.property()+", Eller Serbest Bagaj Sistemi";
    }

    @Override
    public double price() {
        return 0.800 + premiumDecorator.price();
    }
    
}
