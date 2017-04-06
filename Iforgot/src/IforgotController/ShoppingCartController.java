/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IforgotController;

import IforgotModel.ShoppingCartModel;
import IforgotView.ShoppingCartView;
import java.io.Serializable;

/**
 *
 * @author josecovarrubias
 */
public class ShoppingCartController implements Serializable{
    

    public ShoppingCartController() {

        ShoppingCartModel loadCart = new ShoppingCartModel();
        ShoppingCartView ViewMycartName = new ShoppingCartView(); 

            loadCart.setShoppingListName(ViewMycartName.namingCart());
            String lista=loadCart.getShoppingListName().toUpperCase();

            loadCart.setItem(ViewMycartName.addingStuff());
            String cosa=loadCart.getItem().toUpperCase();

            loadCart.setHowMany(ViewMycartName.numOfItems());
            int cuanto= loadCart.getHowMany();

            ViewMycartName.ShoppingCartName(lista);
            ViewMycartName.ShoppingCartItem(cosa);
            ViewMycartName.ShoppingCartQuantity(cuanto);
        }
    
}