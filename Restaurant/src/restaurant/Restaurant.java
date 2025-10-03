
package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

    /**
     * The main method asks for user input to order their meal.
     * @param args 
     */
    public static void main(String[] args) {
        Menu A = new Menu();
        System.out.println(A);
        Scanner Bob = new Scanner(System.in);
        Scanner Tom = new Scanner(System.in);
        System.out.println("");
        ArrayList<Food> items = new ArrayList<> ();
        int answer = 0;
        do{
        System.out.println("What would you like to order? (Sandwich (1), Pizza (2), Dessert (3)): ");
        int x = Bob.nextInt();
        switch (x){
            case 1: System.out.println("What number sandwich would you like?");
                int y = Bob.nextInt();
                if(y==1){
                    System.out.println("What type of cheese would you like? (Cheddar (1), American (2), Swiss (3), Provolone (4): ");
                    int ch = Bob.nextInt();
                    String cheese = "";
                    if(ch == 1){
                        cheese = "Cheddar";
                    }
                    else if(ch == 2){
                        cheese = "American";
                    }
                    else if(ch == 3){
                        cheese = "Swiss";
                    }
                    else if(ch == 4){
                        cheese = "Provolone";
                    }
                    System.out.println("What topping would you like? (Lettuce (1), Tomato (2), Onion (3), Pickle (4)): ");
                    int topping = Bob.nextInt();
                    String top = "";
                    if(topping == 1){
                        top = "Lettuce";
                    }
                    else if(topping == 2){
                        top = "Tomato";
                    }
                    else if(topping == 3){
                        top = "Onion";
                    }
                    else if(topping == 4){
                        top = "Pickle";
                    }
                    System.out.println("What type of sauce would you like? (Ketchup (1), Mustard (2), BBQ (3)): ");
                    int sauce = Bob.nextInt();
                    String sType = "";
                    if(sauce ==1){
                        sType = "Ketchup";
                    }
                    else if(sauce ==2){
                        sType = "Mustard";
                    }
                    else if(sauce ==3){
                        sType = "BBQ";
                    }
                    Sandwich bur = new Burger(cheese, top, sType);
                    System.out.println("Would you like any extra sauce or toppings? (Yes (1), No (2)): ");
                    int extra = Bob.nextInt();
                    ArrayList<String> B1 = new ArrayList<>();
                    while(extra == 1){
                        System.out.println("Enter topping or sauce: ");
                        String str = Tom.nextLine();
                        B1.add(str);
                        System.out.println("Would you like any other extra sauce or toppings? (Yes (1), No (2)): ");
                        extra = Bob.nextInt();
                    }
                    
                    bur.addExtras(B1);
                    System.out.println(bur);
                    items.add(bur);
                }
                else if(y==2){
                    System.out.println("What type of meat would you like? (Ham (1), Turkey (2), Salomi (3), Steak (4)):");
                    int m = Bob.nextInt();
                    String meat = "";
                    if(m == 1){
                        meat = "Ham";
                    }
                    else if(m == 2){
                        meat = "Turkey";
                    }
                    else if(m == 3){
                        meat = "Salami";
                    }
                    else if(m == 4){
                        meat = "Steak";
                    }
                     System.out.println("What type of bread would you like? (White (1), Whole (2), Rye (3), Bun (4)):");
                    int b = Bob.nextInt();
                    String bread = "";
                    if(b == 1){
                        bread = "White";
                    }
                    else if(b == 2){
                        bread = "Whole";
                    }
                    else if(b == 3){
                        bread = "Rye";
                    }
                    else if(b == 4){
                        bread = "Bun";
                    }
                    System.out.println("What type of cheese would you like? (Cheddar (1), American (2), Swiss (3), Provolone (4)): ");
                    int ch = Bob.nextInt();
                    String cheese = "";
                    if(ch == 1){
                        cheese = "Cheddar";
                    }
                    else if(ch == 2){
                        cheese = "American";
                    }
                    else if(ch == 3){
                        cheese = "Swiss";
                    }
                    else if(ch == 4){
                        cheese = "Provolone";
                    }
                    System.out.println("What topping would you like? (Lettuce (1), Tomato (2), Onion (3), Pickle (4)): ");
                    int topping = Bob.nextInt();
                    String top = "";
                    if(topping == 1){
                        top = "Lettuce";
                    }
                    else if(topping == 2){
                        top = "Tomato";
                    }
                    else if(topping == 3){
                        top = "Onion";
                    }
                    else if(topping == 4){
                        top = "Pickle";
                    }
                    System.out.println("What type of sauce would you like? (Ketchup (1), Mustard (2), BBQ (3), Mayo (4)): ");
                    int sauce = Bob.nextInt();
                    String sType = "";
                    if(sauce ==1){
                        sType = "Ketchup";
                    }
                    else if(sauce ==2){
                        sType = "Mustard";
                    }
                    else if(sauce ==3){
                        sType = "BBQ";
                    }
                    else if(sauce == 4){
                        sType = "Mayo";
                    }
                    Sandwich sw = new Sandwich (meat, top, sType, bread, cheese);
                    items.add(sw);
                    System.out.println("Would you like any extra sauce or toppings? (Yes (1), No (2)): ");
                    int extra = Bob.nextInt();
                    ArrayList<String> S1 = new ArrayList<>();
                    while(extra == 1){
                        System.out.println("Enter topping or sauce: ");
                        String str = Tom.nextLine();
                        S1.add(str);
                        System.out.println("Would you like any other extra sauce or toppings? (Yes (1), No (2)): ");
                        extra = Bob.nextInt();
                    }
                    sw.addExtras(S1);
                    System.out.println(sw);
                }
                break;
                
            case 2: System.out.println("Would you like a pizza (1), calzone (2), or pizza dippers (3)? ");
                int p1 = Bob.nextInt();
                if (p1 == 1){
                    System.out.println("What size pizza would you like? (8, 12, 16)");
                    int size = Bob.nextInt();
                    ArrayList<String> toppings = new ArrayList<> ();
                    System.out.println("Would you like any toppings? (Yes (1), No (2)): ");
                    int a = Bob.nextInt();
                    while(a == 1){
                        System.out.println("Enter a topping: ");
                        String top = Tom.nextLine();
                        toppings.add(top);
                        System.out.println("Would you like another topping? (Yes (1), No (2)): ");
                        a = Bob.nextInt();
                    }
                    Food pizza = new Pizza(size, toppings);
                    System.out.println(pizza);
                    items.add(pizza);
                }
                else if(p1 == 2){
                    System.out.println("What type of bread would you like? ");
                    String br = Tom.nextLine();
                    ArrayList<String> toppings = new ArrayList<> ();
                    System.out.println("Would you like any toppings? (Yes (1), No (2)): ");
                    int a = Bob.nextInt();
                    while(a == 1){
                        System.out.println("Enter a topping: ");
                        String top = Tom.nextLine();
                        toppings.add(top);
                        System.out.println("Would you like another topping? (Yes (1), No (2)): ");
                        a = Bob.nextInt();
                    }
                    Pizza cal = new Calzone(toppings, br);
                    System.out.println(cal);
                    items.add(cal);
                }
                else if(p1 == 3){
                    System.out.println("How many pizza dippers would you like?");
                    int num = Bob.nextInt();
                    Pizza dip = new PizzaDipper(num);
                    System.out.println(dip);
                    items.add(dip);
                }
            break;
            
            case 3: System.out.println("What number dessert would you like? ");
                int d = Bob.nextInt();
                if(d == 1){
                    System.out.println("How many scoops of ice cream would you like?");
                    int n = Bob.nextInt();
                    ArrayList<String> extraTop = new ArrayList<>();
                    System.out.println("Would you like an extra topping? (Yes (1), No (2)):");
                    int t = Bob.nextInt();
                    while(t == 1){
                        System.out.println("Enter the topping: ");
                        String extra = Tom.nextLine();
                        extraTop.add(extra);
                        System.out.println(extraTop);
                        System.out.println("Would you like another topping? (Yes (1), No (2)): ");
                        t = Bob.nextInt();
                    }
                    Dessert iceCream = new IceCreamSundae (n, extraTop);
                    System.out.println(extraTop);
                    System.out.println(iceCream);
                    items.add(iceCream);
                }
                else if(d ==2){
                    System.out.println("How many slices of cake would you like? ");
                    int s = Bob.nextInt();
                    Dessert cake = new ChocolateCake(s);
                    System.out.println(cake);
                    items.add(cake);
                }
                else if(d==3){
                    System.out.println("How many slices of pie would you like? ");
                    int p = Bob.nextInt();
                    Dessert pie = new ApplePie(p);
                    items.add(pie);
                    System.out.println(pie);
                }
                break;
                default: System.out.println("Error"); break;                
        }
    
            System.out.println("");
            System.out.println("Would you like another item? (Yes (1), No (2): ");
            answer = Bob.nextInt();
    }while(answer == 1);
        
        System.out.println("");
        printOrder(items);
        totalPrice(items);
        
  }
    
    /**
     * This method calculates the total price of the order.
     * @param list 
     */
    public static void totalPrice(ArrayList<Food> list){
        double cost = 0;
        for(int i = 0; i < list.size(); i++){
            cost += list.get(i).calcPrice();
        }
        System.out.println("Total Cost: $" + cost);
    }
    
    /**
     * This method prints out the order. 
     * @param list 
     */
    public static void printOrder(ArrayList<Food> list){
        for(int i = 0; i < list.size(); i++){
            int item = i+1;
            System.out.println("Item #" + item);
            System.out.println(list.get(i));
        }
    }
}
