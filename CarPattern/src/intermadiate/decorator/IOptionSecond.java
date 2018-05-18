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
public class IOptionSecond implements IntermadiateDecorator{
    IntermadiateDecorator intermadiateDecorator;

    public IOptionSecond(IntermadiateDecorator id) {
        intermadiateDecorator = id;
    }
    
   
    @Override
    public String property() {
        return intermadiateDecorator.property()+" ,Metalik Renk";
    }

    @Override
    public double price() {
        return 1.350 + intermadiateDecorator.price();
    }
    
    
    
}
