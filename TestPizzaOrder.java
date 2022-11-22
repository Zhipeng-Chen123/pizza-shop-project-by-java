//
//I assert that the program I am submittting is the result of my own efforts.
//
//
//variables:
//String readSize = "";
//int beginNum, priceNum, Num1, MenuNum, Num2, CheckNum, IntSize, readToppings, letter1, letter2, WaitNum;
//boolean ifExtraCheese, ifExtraSauce;
//
//
//Processing:
//1. create objects for Scanner class/pizzaInfo/PizzaOrderCheck
//
//2. changing market price: 
//When creating object for the class PizzaOrderCheck, we can enter the inner price system 
//by entering specific integers. We can set item type for changing price by choosing from the list.
//Then, if we do not skip, we can enter new price for that. Later, in the method addPizza, we  
//matching the corresponding integers with item type being changed and use switch to match and set
//the new price we have entered
//
//3.looking at different menus by entering specific integers, or skip
//
//4.choosing between add a pizza or checkout
//
//5.if the user chooses to add a pizza, read in size, number of toppings, extra cheese or extra sauce. 
//Then, calculating the price of each pizza based on the helper class PizzaOrderCheck and make all
//the price of all pizzas in ordering system.
//
//6. if choosing to checkout, add tax to subtotal
//
//7. get payment type information. Store and print in the bill later
//
//8. place order to the restaurant and enter the wait Number being told by the restaurant
//
//9. print bill for all numbered pizzas in arrays of the object with all detailed requirements.
//print subtotal withtout tax, total with tax and card type information.
//indicate the waiting time based on different wait Number entered before
//
//
//output:
//print the order receipt finally
// 
import java.util.Scanner;

public class TestPizzaOrder
{
   public static void main(String[] args)
   {
   String readSize = "";
   int beginNum, priceNum, Num1, MenuNum, Num2, CheckNum, IntSize, readToppings, letter1, letter2, WaitNum;
   boolean ifExtraCheese, ifExtraSauce;  
   
   Scanner scan = new Scanner(System.in);
   pizzaInfo menu = new pizzaInfo();
   PizzaOrderCheck check = new PizzaOrderCheck(); 
   //use the constructor of PizzaOrderCheck to enter inter price system to set item type for changing price and
   //revised price for that item; Price setting will take place in the method addPizza in this class
      
   
   System.out.println("Welcome to your Pizza Order");
   
   Num1 = 0;
   while(Num1 != 4) //end the outer while loop to skip the menu if you entered 4 for Num1 
   {
   System.out.println("Enter 1 to see the size menu\nEnter 2 to see the topping menu" + 
   "\nEnter 3 to see sauce menu" + "\nEnter 4 to skip the menu");
   MenuNum = scan.nextInt(); 
   
      while(MenuNum < 1 || MenuNum > 4) //make sure you enter integers between 1 and 4 inclusively for MenuNum
      {
      System.out.println("You enter an invalid integer. Please enter valid integers from 1 to 4");
      MenuNum = scan.nextInt(); 
      }
      System.out.println("You enter a valid integer.");
      System.out.println();
      
      
      if(MenuNum == 1) //print size menu when MenuNum = 1/ the exit option/ can return to the menu list/
      {
      System.out.println(menu.sizeMenu());
      System.out.println();
      System.out.println("Enter an integer that is not 4 to repeat the options\nEnter 4 to skip");
      Num1 = scan.nextInt();      
      }
      else 
      {
         if(MenuNum == 2) //print topping menu when MenuNum = 2/ the exit option/ can return to the menu list/
         {
         System.out.println(menu.toppingMenu());
         System.out.println();
         System.out.println("Enter an integer that is not 4 to repeat the options\nEnter 4 to skip");
         Num1 = scan.nextInt();
         }
         else
         {
            if(MenuNum == 3)//print size menu when MenuNum = 3/ the exit option/ can return to the menu list/
            {
            System.out.println(menu.sauceMemu());
            System.out.println();
            System.out.println("Enter an integer that is not 4 to repeat the options\nEnter 4 to skip");
            Num1 = scan.nextInt();
            }
            else //exit when MenuNum = 4  
            {
            Num1 = 4;
            } 
         }
      }
       
   }
   
   Num2 = 0;
   while(Num2 != 4) ///end the outer while loop to exit only after you check out 
   { 
   System.out.println("\n \n"
	+ "\n" + "Press 1 to add a pizza"
	+ "\n" + "Press 2 to proceed to checkout");
   CheckNum = scan.nextInt();
  
      while(CheckNum < 1 || CheckNum > 2) //use the while loop to make sure CheckNum entered is 1 or 2. 
      {
      System.out.println("You enter an invalid integer. Please enter valid integers either 1 or 2");
      CheckNum = scan.nextInt(); 
      }
      System.out.println("You enter a valid integer.");
      System.out.println();
      
      
      //when CheckNum = 1, adding a pizza which you can customize size, Number of toppings,
      //extra cheese or extra sauce
      if(CheckNum == 1)        
      {
      
      System.out.println("Enter your pizza size:\n" +
      "Small(1), Medium(2) and Large(3)");
      IntSize = scan.nextInt();
      
      while(IntSize < 1 || IntSize > 3) //make sure you entered integers 1, 2 or 3
      {
      System.out.println("You enter an invalid integer. Please enter valid integers either 1 or 2");
      IntSize = scan.nextInt(); 
      }
      System.out.println("You enter a valid integer.");
      System.out.println();
      
      if(IntSize == 1)
      {readSize = "Small";}
      
      if(IntSize == 2)
      {readSize = "Medium";}
      
      if(IntSize == 3)
      {readSize = "Large";} 
      
      
      System.out.println("\n" + "How many Toppings do you want: " + "choose 1 to 10 toppings");
      readToppings = scan.nextInt();
      
      System.out.println("\n" + "Do you want extra cheese? (1 for yes/2 for no)");
		letter1 = scan.nextInt();
      
      while(letter1 < 1 || letter1 > 2) //make sure you enter integers 1 or 2
      {
      System.out.println("You enter an invalid integer. Please enter valid integers either 1 or 2");
      letter1 = scan.nextInt(); 
      }
      System.out.println("You enter a valid integer.");
      System.out.println();
      
      if(letter1 == 1)
      {ifExtraCheese = true;}
      else 
      {ifExtraCheese = false;}
      
      
      System.out.println("\n" + "Do you want extra sauce? (1 for yes/2 for no)");
		letter2 = scan.nextInt();
      
      while(letter2 < 1 || letter2 > 2) //make sure you enter integers 1 or 2
      {
      System.out.println("You enter an invalid integer. Please enter valid integers either 1 or 2");
      letter2 = scan.nextInt(); 
      }
      System.out.println("You enter a valid integer.");
      System.out.println();
      
      
      if(letter2 == 1)
      {ifExtraSauce = true;}
      else
      {ifExtraSauce = false;}
      
      //add the price of one pizza for first slot in the array set in the helper class PizzaOrderCheck(limitation)
      check.addPizza(readSize, readToppings, ifExtraCheese, ifExtraSauce); 
      }
      
      else
      {
      check.addTax(); //price of all pizzas in one order multiplied by 1.06 (Tax rate 6%)
      check.Payment(); //get card type for payment
      check.PlaceOrder(); //order being placed and enter a wait number being told
            
      check.printBill(); //print the bill for each pizza with tax and wait time for the order
      
      System.out.println("============================================================");
      Num2 = 4; //only exit after checkout
      }
      
      }
      
      }
}