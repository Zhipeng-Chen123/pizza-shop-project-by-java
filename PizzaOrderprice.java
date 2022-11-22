

public class PizzaOrderprice
{
   private String size;
	private int toppings;
	private boolean hasExtraCheese;
   private boolean hasExtraSauce;

   private double priceSmall = 3.0;
   private double priceMedium = 5.0;
   private double priceLarge = 7.0;
   
   private double price_3Toppings = 1.5;
   private double price_5Toppings = 3.0;
   private double price_8Toppings = 5.0;
   
   private double priceExtraCheese = 1.5;
   private double priceExtraSauce = 1.0;

   //put in customized size, number of toppings, extra cheese and extra sauce for constructor method
   public PizzaOrderprice(String size, int toppings, boolean hasExtraCheese, boolean hasExtraSauce) 
   {
   //make global variables does not mess up with the local variables with the same names
   this.size = size;
	this.toppings = toppings;
	this.hasExtraCheese = hasExtraCheese;
   this.hasExtraSauce = hasExtraSauce;
   }
   
   //Getter methods
   public String getSize()
   {
   return size;
   }
   
   public int getToppings()
   {
   return toppings;
   }
   
   public boolean ifHasExtraCheese()
   {
   return hasExtraCheese; 
   }
   
   public boolean ifhasExtraSauce()
   {
   return hasExtraSauce;
   }
   
   //setter methods for price on size, toppings and extra cheese or sauce
   public void SetpriceSmall(double p1)
   {
   priceSmall = p1; 
   }
   
   public void SetpriceMedium(double p2)
   {
   priceMedium = p2;
   }
   
   public void SetpriceLarge(double p3)
   {
   priceLarge = p3;
   }
   
   public void Setprice_3Toppings(double p4)
   {
   price_3Toppings = p4;
   }
   
   public void Setprice_5Toppings(double p5)
   {
   price_5Toppings = p5;
   }
   
   public void Setprice_8Toppings(double p6)
   {
   price_8Toppings = p6;
   }
   
   public void SetpriceExtraCheese(double p7)
   {
   priceExtraCheese = p7;
   }
   
   public void SetpriceExtraSauce(double p8)
   {
   priceExtraSauce = p8;
   }
   
   //price calculator for the pizza with specific requirements 
   public double price()
   {
   double price = 0;
   
   if(size.equals("Small"))
   {price += priceSmall;}
   else
   {
      if(size.equals("Medium")){
      price += priceMedium;}
      else
      {
      if(size.equals("Large")){
      price += priceLarge;}
      }
   }
   
   
   if(toppings > 3 && toppings <= 5)
   {price += price_3Toppings;}
   else
   {
      if(toppings > 5 && toppings <= 8)
      {price += price_5Toppings;}
      else
      {
      if(toppings > 8 && toppings <= 10)
      {price += price_8Toppings;}
      }
   }
      
      
      if(hasExtraCheese)
      {
      price += priceExtraCheese;
      }
      
      if(hasExtraSauce)
      {
      price += priceExtraSauce;
      }  
      
      return price;
      }
 
}