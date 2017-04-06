/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppController;

import IforgotController.ShoppingCartController;
import IforgotView.ShoppingCartView;

/**
 *
 * @author josecovarrubias
 */
public class ApplicationController {
    // This function will use the view model to solve the logic 
    // of what the controll model should do at the begining of the app.  
    public String start(){
    ShoppingCartView startApp = new ShoppingCartView();
        String selection = startApp.newOrOldCart().toUpperCase();
        
        switch (selection){
            case "NEW":
                this.newlist();
                break;
            case "OLD":
                this.oldlist();
                break;
            default:
                System.out.println("not valid");
                break;
        }
        return selection;
    }
    
    public void newlist(){
            ShoppingCartController firstCart = new ShoppingCartController();
            firstCart.newShoppingCart();
    }
    
    public void oldlist(){
            ShoppingCartController oldCart = new ShoppingCartController();
            oldCart.oldShoppingCart();
    }
    
}
