
package restaurant;

/**
 * This class creates a ChocolateCake Dessert object.
 */
public class ChocolateCake extends Dessert implements Food{
    
    private int numSlicesCake;
    
    /**
     * The constructor sets up a ChocolateCake object with a certain number of slices.
     * @param n number of slices
     */
    public ChocolateCake(int n){
        super(1);
        numSlicesCake = n;
    }
    
    /**
     * The accessor method returns the number of cake slices.
     * @return 
     */
    public int getNumSlicesCake(){ return numSlicesCake; }
    
    /**
     * This method calculates the specific price for the cake based on the number of slices.
     * @return 
     */
    public double calcPrice(){
        return super.calcPrice() + numSlicesCake-1*3.50;
    }
    
    /**
     * This method converts the ChocolateCake object to a string.
     * @return 
     */
    public String toString(){
        return "Chocolate Cake: " + numSlicesCake + " Slices";
    }
}
