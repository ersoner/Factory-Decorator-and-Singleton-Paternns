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
public class POptionFourth implements PremiumDecorator{
    
    PremiumDecorator premiumDecorator;
    
    public POptionFourth(PremiumDecorator pd) {
        premiumDecorator = pd;
    }
    
    @Override
    public String property() {
        return premiumDecorator.property()+", 18' Alüminyum Alaşımlı Jantlar";
    }

    @Override
    public double price() {
        return 2.250 + premiumDecorator.price();
    }
    
}
