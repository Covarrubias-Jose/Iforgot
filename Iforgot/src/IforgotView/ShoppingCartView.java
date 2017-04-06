/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IforgotView;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 */
public class ShoppingCartView implements Serializable{
    
    public ShoppingCartView(){
        
    }
    public String namingCart(){
        System.out.println("Name your list: ");
        Scanner nameList = new Scanner(System.in);
        String nameListIs = nameList.nextLine();
        return nameListIs;
    }
    public String addingStuff(){
        System.out.println("what item to add? ");
        Scanner nameItem = new Scanner(System.in);
        String nameItemIs = nameItem.nextLine();
        return nameItemIs;
    }
    public int numOfItems(){
        System.out.println("How many? ");
        Scanner itemNum = new Scanner(System.in);
        int itemNumIs = itemNum.nextInt();
        return itemNumIs;
    }
    public String ShoppingCartName(String lista){
         System.out.println("Your list name is: "+ lista);
         return lista;
}  
    public String ShoppingCartItem(String cosa){
         System.out.println("You added item/items: "+cosa);
         return cosa;
        }
    public int ShoppingCartQuantity(int cuanto){
        System.out.println("You are getting: "+cuanto);
        return cuanto;
    }

}
