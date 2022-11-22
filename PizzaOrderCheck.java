
import java.util.Scanner;

public class PizzaOrderCheck
{
   String cardInfo = "";
   private PizzaOrderprice[] pizzas = new PizzaOrderprice[10]; 
   //instantiate the arrays of a object for the class PizzaOrderprice for 10 slots (limitation)
   
   private int NumPizzas = 0;

   private double subTotal = 0;
	private double total = 0;
   private double tax;
   private double newPrice = 0;
   private int PriceNumer = 0;
   private int OrderNum = 0;
   
   
   //use the constructor of PizzaOrderCheck to enter inter price system to set item type for changing price and
   //revised price for that item; Price setting will take place in the method addPizza in this class
   public PizzaOrderCheck() 
   {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Customer or system administrator? " + 
   "1 for Customer/ 2 for system administrator");
   int beginNum = scan.nextInt();
   
   while(beginNum < 1 || beginNum > 2) //make sure you entered integers 1 or 2
      {
      System.out.println("You enter an invalid integer. Please enter valid integers either 1 or 2");
      beginNum = scan.nextInt(); 
      }
      System.out.println("You enter a valid integer.");
      System.out.println();
      
      
      if(beginNum == 1) //Customer choice: getting into ordering system
      {System.out.println("Enter the ordering system...");}
      else //system administrator: getting into inner price system
      {
         System.out.println("Enter the internal price system...\n" +
         "you can change the price based on current market price you entered");
         
         System.out.println();
         System.out.println("price changes? 1 for \"Yes\" or 2 for \"No\"");
         int response = scan.nextInt();
         
         while(response < 1 || response > 2) //make sure you entered integers 1 or 2
         {
         System.out.println("You enter an invalid integer. Please enter valid integers either 1 or 2");
         response = scan.nextInt(); 
         }
         System.out.println("You enter a valid integer.");
         System.out.println();
         
         
   
         if(response == 1) //choice of changing price
         {
         System.out.println("Select the price you want to change:\n" +
         "1 for Small size, 2 for Medium size, 3 for Large size\n" +
         "4 for 3 < toppings <= 5, 5 for 5 < toppings <= 8, 6 for 8 < toppings <= 10\n" +
         "7 for extra cheese, 8 for extra sauce" +
         ", 0 for skip"); //get the item which you want to change the price of  
         PriceNumer = scan.nextInt();
         
         
         while(PriceNumer < 0 || PriceNumer > 8) //make sure you entered integers between 0 and 8 inclusively
         {
         System.out.println("You enter an invalid integer. Please enter valid integers either 1 or 2");
         PriceNumer = scan.nextInt(); 
         }
         System.out.println("You enter a valid integer.");
         System.out.println();
         
         
         if(PriceNumer != 0) //make sure you enter a integer that is not 0
         {
         System.out.println("Enter the new price:");
         newPrice = scan.nextDouble();
         }
          
         }
         else //skip the price setting  when response is 2 for not changing any price 
         {}
         System.out.println("Enter the ordering system...");
         
      }
   
   }
   
      
   
   //add numbered pizza by arrays
   public void addPizza(String size, int toppings, boolean hasExtraCheese, boolean hasExtraSauce) 
   {
   //instanciate the object with arrays
   pizzas[NumPizzas] = new PizzaOrderprice(size, toppings, hasExtraCheese, hasExtraSauce);
   
   switch(PriceNumer) //using switch to set prices for items with corresponding integers indicated above
   {
      case 1:
         pizzas[NumPizzas].SetpriceSmall(newPrice);
         break;
      case 2:
         pizzas[NumPizzas].SetpriceMedium(newPrice);
         break;
      case 3:
         pizzas[NumPizzas].SetpriceLarge(newPrice);
         break;
      case 4:
         pizzas[NumPizzas].Setprice_3Toppings(newPrice);
         break;
      case 5:
         pizzas[NumPizzas].Setprice_5Toppings(newPrice);
         break;
      case 6:
         pizzas[NumPizzas].Setprice_8Toppings(newPrice);
         break;
      case 7:
         pizzas[NumPizzas].SetpriceExtraCheese(newPrice);
         break;
      case 8:
         pizzas[NumPizzas].SetpriceExtraSauce(newPrice);
         break; 
         
   }
   
   subTotal += pizzas[NumPizzas].price(); 
   NumPizzas ++; 
   }  
   
   public void addTax()
   {
   tax = subTotal * 0.06;
   total = subTotal + tax;
   }
   
   public void Payment()
   {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("paid by credit card or debit card? 1 for credit, 2 for debit card");
   int CardType = scan.nextInt();
   
   while(CardType < 1 || CardType > 2) //make sure CardType is 1 or 2
         {
         System.out.println("You enter an invalid integer. Please enter valid integers either 1 or 2");
         CardType = scan.nextInt(); 
         }
         System.out.println("You enter a valid integer.");
         System.out.println();
   
   if(CardType == 1)
   {cardInfo = "paid by credit card";}
   else
   {cardInfo = "paid by debit card";}
    
   }
   
   
   
   public void PlaceOrder()
   {
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter the wait Number: ");
   int waitNumber = scan.nextInt();
   
   while(waitNumber < 0 || waitNumber > 20) //set limitation for wait number from 0 to 20 inclusively
         {
         System.out.println("You enter an invalid integer. Please enter valid integers either 1 or 2");
         waitNumber = scan.nextInt(); 
         }
         System.out.println("You enter a valid integer.");
         System.out.println();

   OrderNum = waitNumber;
   System.out.println("Your order Number is " + OrderNum);
   
    }
   
   
   
   public void printBill() //print the bill for the order
   { 
   System.out.println("\n \n \n " + "Bill for pizza order");
	System.out.println("============================================================");
   
   for(int i = 0; i < this.NumPizzas; i++) //add all numbered pizzas with corrresponding requirements
   {
   System.out.println("Pizza" + (i + 1) + ": \n" + pizzas[i].getSize() + " size");
   System.out.println(pizzas[i].getToppings() + " toppings");
   
   if(pizzas[i].ifHasExtraCheese()) 
         {
			System.out.print("extra cheese, ");
			}
      
   if(pizzas[i].ifhasExtraSauce()) 
         {
			System.out.println("extra sauce");
			}
         
   System.out.println();
   }
   
   System.out.println("============================================================");
   System.out.println("SubTotal = $" + this.subTotal);
   System.out.println("Tax = $" + this.tax);
   System.out.println("============================================================");
   System.out.println("Total = $" + this.total); 
   System.out.println(cardInfo);
   
   if(OrderNum <= 10) //indicate the waiting time for different wait Number entered
   {System.out.println("Your pizzas will be ready within 15 minutes.");}  
   else
   {System.out.println("Your pizzas will be ready within 30 minutes.");}
   
   }

   
   }      
