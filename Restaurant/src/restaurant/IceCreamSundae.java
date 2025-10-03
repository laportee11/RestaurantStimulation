
package restaurant;

import java.util.ArrayList;

/**
 * This class creates an IceCreamSundae Dessert object.
 */
public class IceCreamSundae extends Dessert implements Food {
    
    private ArrayList<String> extraToppings;
    
    /**
     * The constructor creates an ice cream sundae with the scoops of ice cream and toppings.
     * @param s number of ice cream scoops
     * @param D ArrayList of the ice cream toppings
     */
    public IceCreamSundae(int s, ArrayList<String> D){
        super(s);
        extraToppings = D;
    }
    
    /**
     * The accessor method returns the list of extra toppings.
     * @return 
     */
    public ArrayList<String> getExtraToppings(){ return extraToppings; }
    
    /**
     * This method calculates the specific price for an IceCreamSundae Dessert.
     * @return 
     */
    public double calcPrice(){
       return super.calcPrice() + this.getNumScoops() * 0.75 + this.extraToppings.size() * 0.25;
    }
    
    /**
     * This method converts the IceCreamSundae object to a String.
     * @return 
     */
    public String toString(){
        return "Ice Cream Sundae: " + this.getNumScoops() + " Scoops of Ice Cream with " + extraToppings;
    }
}
