
package restaurant;

import java.util.ArrayList;

/**
 *this class defines the pizza object
 */
public class Pizza implements Food{
    private int size;
    private ArrayList<String> toppings;
    
    /**
     * This is the constructor for the Pizza object
     * @param s the size of the pizza
     * @param T the list of toppings for the pizza
     */
    public Pizza(int s, ArrayList<String> T){
        size = s;
        toppings = new ArrayList<>(T.size());
        for(int x = 0; x < T.size(); x++){
            toppings.add(T.get(x));
        }
    }
     /**
     * this is a second constructor for the Pizza object that only takes in a size
     * @param s the size of the pizza
     */
    public Pizza(int s){
        size = s;
        toppings = new ArrayList<>();
    }

    /**
     * size field accessor method
     * @return the size of the pizza
     */
    public int getSize(){return size;}
    /**
     * toppings field accessor method
     * @return the list of toppings on the pizza
     */
    public ArrayList<String> getToppings(){return toppings;}
    
    /**
     * calculates the price of the pizza item
     * @return the price of the pizza item
     */
    public double calcPrice(){
        int price = 10;
        
        if (size == 8)
            price += 1;
        if (size == 12)
            price +=2;
        if (size == 16){
            price +=3;
        }
        if (toppings.size() > 5){
            price +=1;
        }
        for (int x = 0; x < toppings.size(); x++){
            if(toppings.get(x).equalsIgnoreCase("pineapple")||toppings.get(x).equalsIgnoreCase("anchovies"))
                price += 5;
        }
       
        return price;
    }
/**
*this method allows the Pizza object to be properly printed
*@return the string form of the pizza object
*/
    public String toString(){
        return "Pizza: " + size + " inches with " +toppings;
    }
}

