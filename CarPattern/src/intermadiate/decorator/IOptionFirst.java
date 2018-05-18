/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermadiate.decorator;

import intermadiate.IntermadiateDecorator;
import intermadiate.IntermadiatePackage;

/**
 *
 * @author SoNeR
 */
public class IOptionFirst implements IntermadiateDecorator{
    IntermadiateDecorator intermadiateDecorator;

    public IOptionFirst(IntermadiateDecorator id) {
        intermadiateDecorator = id;
    }
    
    @Override
    public String property() {
        return intermadiateDecorator.property()+" ,Görüş Paketi: Sis Farı + Arka Park Sensörü";
    }

    @Override
    public double price() {
        return 1.1 + intermadiateDecorator.price();
    }
    
    
    
}
