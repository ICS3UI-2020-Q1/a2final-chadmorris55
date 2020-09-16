import java.util.Scanner;

/**
 *This program will tell the user how much their pizza costs based on the diameter in cm, and also gives a cool little comment
 * @Chad 
 */
public class Main {
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    //constants stored here
    final double LABOUR_COST = 0.75;
    final double POWER_COST = 0.99;
    final double EXTRA_COST = LABOUR_COST + POWER_COST;
    final double COST_PER_CM = 0.50;
    final double TAX_RATE = 0.13;
    final double ONE_LOW = 1;
    final double ONE_HIGH = 20;
    final double TWO_LOW = 20;
    final double TWO_HIGH = 40;
    final double THREE_LOW = 40;

    //Asks user for size of the pizza in cm and records it 
    System.out.println("What is the size of the pizza (in cm):");
    int pizzaSize = input.nextInt();

    //calculates the subtotal, tax, and final cost of the pizza 
    double subTotal = (pizzaSize * COST_PER_CM) + EXTRA_COST;
    double pizzaTax = subTotal * TAX_RATE;
    double endCost = subTotal + pizzaTax;

    //Prints all info out for the user
    System.out.println("Subtotal: $" + subTotal);
    System.out.println("Taxes: $" + pizzaTax);
    System.out.println("Total: $" + endCost);

    //deterines what cool lttle comment is added at the end 
    if (pizzaSize >= ONE_LOW && pizzaSize < ONE_HIGH){
      System.out.println("We are going to make you a cute little pizza!");
    } else if (pizzaSize >= TWO_LOW && pizzaSize < TWO_HIGH){
      System.out.println("This will be delicious!");
    } else if (pizzaSize >= THREE_LOW){
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }


  }
}
