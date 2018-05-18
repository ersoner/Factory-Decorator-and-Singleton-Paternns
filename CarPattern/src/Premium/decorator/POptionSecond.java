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
public class POptionSecond implements PremiumDecorator{
    
    PremiumDecorator premiumDecorator;
    
    public POptionSecond(PremiumDecorator pd) {
        premiumDecorator = pd;
    }
    
    @Override
    public String property() {
        return premiumDecorator.property()+", Sürüş Paketi: Adaptif Cruise Control&Şerit Takip Sistemi&Güvenli Mesafe Uyarı Sistemi&Aktif Acil Fren Destek Sistemi&Otomatik Uzun/Kısa Farlar";
    }

    @Override
    public double price() {
        return 3.900 + premiumDecorator.price();
    }
    
}
