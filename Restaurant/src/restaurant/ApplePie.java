
package restaurant;

/**
 * This class creates an ApplePie Dessert object.
 */
public class ApplePie extends Dessert implements Food{
    
    private int numSlices;
    
    /**
     * The constructor takes in the number of pie slices.
     * @param n number of pie slices
     */
    public ApplePie(int n){
        super(0);
        numSlices = n;
    }
    
    /**
     * This method calculates the price based on the number of pie slices.
     * @return 
     */
    public double calcPrice(){
        return super.calcPrice() + numSlices-1*2.5;
    }
    
    /**
     * The accessor method returns the number of pie slices.
     * @return 
     */
    public int getNumSlice(){ return numSlices; }
    
    /**
     * This method converts the ApplePie object to a String format.
     * @return 
     */
    public String toString(){
        return "Apple Pie Slices: " + numSlices; 
    }
}
