

public class pizzaInfo
{
   
   public pizzaInfo()
   {
   }

   public String sizeMenu() //get size menu 
   {
   String result = "Small (average between 8 and 10 inches/ about 6 slices)" +
   "\nMedium (12 inches in diameter/ about 8 slices)" + 
   "\nLarge (14 inches in diameter/ about 10 slices)";
   
   return result;
   }
   
   public String toppingMenu() //get topping menu and some information about toppings 
   {
   String result = "Black Olives" + "\nGreen Olives" + "\nBroccoli" + "\nSpinach" +  "\nAnchovies" + 
   "\nTomatoes" +  "\nChicken" + "\nGround Beef" + "\nBacon Bits" + "\nBacon Strips" + "\nHam" + 
   "\nJalapenos" + "\nRoasted Red Peppers" + "\nGreen Pepper" + "\nMild Sausage" + 
   "\nHot Sausage" + "\nOnions Pineapple" + "\nMushrooms" + "\nPepperoni" + 
   "\"The price of toppings based on weight of toppings in pounds.\"\n" +
   "Toppings <= 3(free): 0.1 pounds\n" + "3 < Toppings <= 5: 0.2 pounds\n" +
   "5 < Toppings <= 8: 0.3 pounds\n" + "8 < Toppings <= 10: 0.4 pounds\n" +
   "\"Ask the servant about availbility of toppings you choose.\"";
   
   return result;
   }
   
   public String sauceMemu() //get sauce menu
   { 
   String result = "Tomato Sauce" + "\nPesto Sauce" + "\nWhite Garlic Sauce" + "\nGarlic Ranch Sauce" + "\nHummus Sauce" +
   "\nBuffalo Sauce";
   
   return result;
   }
   
}