/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IforgotController;

import IforgotModel.ShoppingCartModel;
import IforgotView.ShoppingCartView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 */
public class ShoppingCartController implements Serializable{
    

    public ShoppingCartController() {
       
       
        System.out.println("Name your list: ");
        Scanner nameList = new Scanner(System.in);
        String nameListIs = nameList.nextLine();

        System.out.println("what item to add? ");
        Scanner nameItem = new Scanner(System.in);
        String nameItemIs = nameItem.nextLine();

        System.out.println("How many? ");
        Scanner itemNum = new Scanner(System.in);
        int itemNumIs = itemNum.nextInt();

        ShoppingCartModel loadCart = new ShoppingCartModel();

        loadCart.setShoppingListName(nameListIs);
        String lista=loadCart.getShoppingListName().toUpperCase();

        loadCart.setItem(nameItemIs);
        String cosa=loadCart.getItem().toUpperCase();

        loadCart.setHowMany(itemNumIs);
        int cuanto= loadCart.getHowMany();
        
        Map itemsInList = new HashMap();
        itemsInList.put(cosa, cuanto);
        itemsInList.keySet();
        System.out.println("CART "+itemsInList.entrySet());

        ShoppingCartView ViewMycartName = new ShoppingCartView(); 
        
        ViewMycartName.ShoppingCartName(lista);
        ViewMycartName.ShoppingCartItem(cosa);
        ViewMycartName.ShoppingCartQuantity(cuanto);
    }
    
}