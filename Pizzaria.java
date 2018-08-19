// older version
/**
 * Pizzaria class: for making Pizzas!
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
public class Pizzaria {
    
  public static void main(String[] args) {
      //make some Pizzas and test their methods.
      Pizza pizza1 = new Pizza();
      Pizza pizza2 = new Pizza("small", 1, 1, false);
      //make more Pizzas!!!
      
      String whatspizza1 = pizza1.getDescription();
      System.out.println(whatspizza1);
      
      //test more Pizzas!!
      
      Pizza orderOne = new Pizza();
      double cost1 = orderOne.calCost();
      System.out.printf("\n" + "pizzaOne: size = " + orderOne.getSize() + ", meat toppings = " + orderOne.getMeat() + ", veg toppings = " + orderOne.getVeg() + ", " + 
              "isVegan = " + orderOne.isVegan() + ", your total = $" + "%.2f", cost1);
                        
      System.out.println("\n" + orderOne.getDescription());                    
                        
      Pizza orderTwo = new Pizza("small", 2, 4, false);
      double cost2 = orderTwo.calCost();
      System.out.printf("\n" + "pizzaTwo: size = " + orderTwo.getSize() + ", meat toppings = " + orderTwo.getMeat() + ", veg toppings = "  + orderTwo.getVeg() + ", " +
             "isVegan = " + orderTwo.isVegan() + ", your total = $" + "%.2f", cost2);
                        
      System.out.println("\n" + orderTwo.getDescription());                     
                        
      Pizza orderThree = new Pizza("large", 2, 4, true);
      double cost3 = orderThree.calCost();
      System.out.printf("\n" + "pizzaThree: size = " + orderThree.getSize() + ", meat toppings = "  + orderThree.getMeat() + ", veg toppings = "  + orderThree.getVeg() + ", " +
                         "isVegan = " + orderThree.isVegan() + ", your total = $"  + "%.2f", cost3);
                        
      System.out.printf("\n" + orderThree.getDescription());
      System.out.println();
                        
      Pizza orderFour = new Pizza("large", 1, 1, false);
      double cost4 = orderFour.calCost();
      System.out.printf("\n" + "pizzaFour: size = " + orderFour.getSize() + ", meat toppings = "  + orderFour.getMeat() + ", veg toppings = "  + orderFour.getVeg() + ", " +
                        "isVegan = " + orderFour.isVegan() + ", your total = $" + "%.2f", cost4 );  
                        
      System.out.println("\n" + orderFour.getDescription());     
    }
}
