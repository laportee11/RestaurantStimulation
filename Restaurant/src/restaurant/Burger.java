
package restaurant;


public class Burger extends Sandwich implements Food{
    private String cheese;
    private String topping;
    private String sauce;
    
    /**
     * The constructor sets up a Burger object containing the components of a sandwich.
     * @param c cheese
     * @param t topping
     * @param s sauce
     */
    public Burger( String c, String t, String s){
        super("beef patty", t, s,"bun", c);
        cheese = c;
        topping = t;
        sauce = s;
    }
    
}

