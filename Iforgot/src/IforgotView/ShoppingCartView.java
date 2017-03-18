/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IforgotView;

import java.io.Serializable;

/**
 *
 * @author josecovarrubias
 */
public class ShoppingCartView implements Serializable{
    
    public ShoppingCartView(){
        
    }
    public String ShoppingCartName(String lista){
         System.out.println("Your list name is: "+ lista);
         return lista;
}  
    public String ShoppingCartItem(String cosa){
         System.out.println("You added the following item/items:\n "+cosa);
         return cosa;
        }
    public int ShoppingCartQuantity(int cuanto){
        System.out.println("You are getting: "+cuanto);
        return cuanto;
    }

}
