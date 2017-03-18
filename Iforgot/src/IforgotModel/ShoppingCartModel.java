/*
 */
package IforgotModel;

/**
 *
 * @author josecovarrubias
 */
public class ShoppingCartModel implements java.io.Serializable{
    
    private String shoppingListName;
    private String item;
    private int howMany;
    

    public ShoppingCartModel() {

    }

    public String getShoppingListName() {
        return shoppingListName;
    }

    public void setShoppingListName(String shoppingListName) {
        this.shoppingListName = shoppingListName;
    }
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }
    
    @Override
    public String toString() {
        return "ShoppingCartModel {" + "item = " + item + ", howMany = "
              + howMany + ", shoppingListName = " + shoppingListName + '}';
    }
  
}
