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
public class POptionSixth implements PremiumDecorator{
    
    PremiumDecorator premiumDecorator;
    
    public POptionSixth(PremiumDecorator pd) {
        premiumDecorator = pd;
    }
    
    @Override
    public String property() {
        return premiumDecorator.property()+", Elektrikli Açılır Panoramik Cam Tavan";
    }

    @Override
    public double price() {
        return 5.250 + premiumDecorator.price();
    }
    
}
