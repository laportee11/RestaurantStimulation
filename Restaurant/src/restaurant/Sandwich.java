
package restaurant;

import java.util.ArrayList;

/**
 * This class creates a sandwich object.
 */
public class Sandwich implements Food {
    
    private String bread;
    private String topping;
    private String sauce;
    private String meat;
    private String cheese;
    private ArrayList<String> extras;
    
    /**
     * The constructor creates a sandwich based on the input components.
     * @param m meat type
     * @param t sandwich topping
     * @param s sauce
     * @param b bread type
     * @param c cheese
     */
    public Sandwich(String m, String t, String s, String b, String c){
        meat = m;
        topping = t;
        sauce = s; 
        bread = b;
        cheese = c;
    }
    
    /**
     * The accessor methods return the individual components of the sandwich.
     * @return 
     */
    public String getMeat(){return meat;}
    public String getTopping(){return topping;}
    public String getSauce(){return sauce;}
    public String getBread(){return bread;}
    public ArrayList<String> getExtras(){return extras;}
    
    /**
     * This method adds extra toppings or sauces to the sandwich.
     * @param A ArrayList of extra toppings
     */
    public void addExtras(ArrayList<String> A){
        extras = new ArrayList<>();
        for (int x = 0; x < A.size();x++){
            extras.add(A.get(x));
        }
    }
    
    /**
     * This method calculates the price of a sandwich based on the components.
     * @return 
     */
    public double calcPrice(){
        double price = 10.00;
        if(this instanceof Burger){
            price +=2;
        }
        if(meat.equalsIgnoreCase("steak")){
            price += .75;
        }
        for (int x = 0; x < extras.size(); x++){
            price += .50;
        }
        return price;
    }
    
    /**
     * This method creates a String of the Sandwich object.
     * @return 
     */
     public String toString(){
        if(this instanceof Burger){
            return "Burger: " + bread + ", " + meat + ", " + topping + ", " + sauce + ", " + extras;
        }
        else{
            return "Sandwich: " + bread + ", " + meat + ", " + topping + ", " + sauce + ", " + extras;
        }
    }
 
   
}
