public class Shopping{
public static void shoppingType(String shoppingType){
System.out.println("SHOPING TYPE :"+shoppingType);
}
public static void totalPrice(int price, double gst){
double totalPrice = price + (price*gst);
System.out.println("TOTAL PRICE INCLUDING GST :"+totalPrice);
}
public static void shoppingItemName(String itemName, String shopingType){
System.out.println("SHOPING ITEM NAME :"+itemName);
System.out.println("SHOPING ITEM TYPE :"+shopingType);
}
public static void shoppingItemName(String itemName, String shopingType,int price){
System.out.println("THE SHOPING DETAILS");
System.out.println("SHOPING ITEM NAME :"+itemName);
System.out.println("SHOPING ITEM TYPE :"+shopingType);
System.out.println("TOTAL PRICE :"+price);
}
}
