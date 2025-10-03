
package restaurant;

import java.util.ArrayList;

/**
 *This class defines the Calzone object.
 */
public class Calzone extends Pizza implements Food {
    
   private String breadType;
    /**
     * This is the constructor for the Calzone class
     * @param t the toppings for the calzone
     * @param b the type of bread dough for the calzone
     */
    public Calzone(ArrayList<String> t, String b){
        super(12, t);
        breadType = b;
    }
    
    /**
     * This method overrides the calcPrice method found in the pizza superclass
     * @return the price of the item
     */
    public double calcPrice(){
        double price = super.calcPrice();
        if (breadType.equalsIgnoreCase("whole")){
            price +=1.25;
        }
        return price;
    }

    public String toString(){
        return "Calzone: " + breadType + " bread with " + super.getToppings();
    }

}
