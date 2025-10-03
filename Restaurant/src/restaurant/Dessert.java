package restaurant;

/**
 * This abstract class sets up methods for all Dessert objects.
 */
public abstract class Dessert implements Food{
    
    private int numScoops;
    
    /**
     * The construct sets up a Dessert object with a certain number of ice cream scoops.
     * @param s number of ice cream scoops
     */
    public Dessert(int s){
        numScoops = s;
    }
    
    /**
     * The accessor method returns the number of ice cream scoops in the Dessert.
     * @return 
     */
    public int getNumScoops(){ return numScoops; }
    
    /**
     * This method sets the price for a Dessert.
     * @return 
     */
    public double calcPrice(){
        return 4.35;
    }
    
    /**
     * This method will be used with all Dessert objects to convert them to a String.
     * @return 
     */
    public abstract String toString();
    
}
