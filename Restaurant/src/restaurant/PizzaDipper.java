package restaurant;

import java.util.ArrayList;

/**
* this class defines the Pizza Dippers object.
 */
public class PizzaDipper extends Pizza implements Food{
   private int num;
    
   /**
     * This is the constructor for the Pizza Dippers object
     * @param n the number of pizza dippers being ordered
     * 
     */
    public PizzaDipper(int n){
        super(8);
        num = n;
        super.getToppings().add("cheese");
        super.getToppings().add("tomato sauce");
    }

    /**
     * This method overrides the calcPrice method found in the Pizza class.
     * @return price of the item
     */
    public double calcPrice(){
       double price = super.calcPrice();
       for(int x = 0; x <= num; x++){
           price += .75;
       }
        return price;
    }

     public String toString(){
        return "Pizza Dippers: " + num + " breadsticks with cheese and tomato sauce";
    }

}

