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
    
    public void start(){
    ShoppingCartView startApp = new ShoppingCartView();
        startApp.newOrOldCart();
    }
//       @Override
    public boolean doAction(String selection){// throws HowToMoveException {
        
        selection = selection.toUpperCase(); 
        
        switch (selection){
            case "NEW":
                this.newlist();
                break;
            case "OLD":
                this.oldlist();
                break;
//            default:
//               ErrorView.display("try again");
//                break;
               
        }
        return false;
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
