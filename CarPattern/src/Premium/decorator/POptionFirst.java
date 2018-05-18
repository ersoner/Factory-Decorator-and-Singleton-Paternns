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
public class POptionFirst implements PremiumDecorator{
    
    PremiumDecorator premiumDecorator;
    
    public POptionFirst(PremiumDecorator pd) {
        premiumDecorator = pd;
    }
    
    @Override
    public String property() {
        return premiumDecorator.property()+", Kontrol Paketi:Kör nokta uyarı sistemi+ Eller serbest park sistemi + 360 park destek sistemi";
    }

    @Override
    public double price() {
        return 3.350 + premiumDecorator.price();
    }
    
}
