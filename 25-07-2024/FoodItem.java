public class FoodItem{
public static void itemDetails(){
	FoodItem.itemDetails("LION DATES");
System.out.println( "ABOUT FOOD ITEM");
}
public static void itemDetails(String name){
	FoodItem.itemDetails("LION DATES","DRY FRUITS");
System.out.println( "FOOD ITEM NAME :"+name);
}
public static void itemDetails(String name, String category){
	FoodItem.itemDetails("LION DATES","DRY FRUITS",156.00);
System.out.println( "FOOD ITEM NAME :"+name+" /CATOGORY : "+category);
}
public static void itemDetails(String name, String category, double price){
	FoodItem.itemDetails("LION DATES","DRY FRUITS",156.00,500);
System.out.println( "FOOD ITEM NAME :"+name+" /CATOGORY : "+category+" /PRICE : "+price+"Rs");
}
public static void itemDetails(String name, String category, double price, int quantity){
	FoodItem.itemDetails("LION DATES","DRY FRUITS",156.00,500,"16/10/2024");
System.out.println( "FOOD ITEM NAME :"+name+" /CATOGORY : "+category+" /PRICE : "+price+"Rs"+ " /NET QUANTITY :"+quantity+"g");
}
public static void itemDetails(String name, String category, double price, int quantity, String expDate){
	FoodItem.itemDetails("LION DATES","DRY FRUITS",156.00,500,"16/10/2024",1410);
System.out.println( "FOOD ITEM NAME :"+name+" /CATOGORY : "+category+" /PRICE : "+price+"Rs"+ " /NET QUANTITY :"+quantity+"g"+" /EXPIRY DATE :"+expDate);
}
public static void itemDetails(String name, String category, double price, int quantity, String expDate, int calories){
	FoodItem.itemDetails("LION DATES","DRY FRUITS",156.00,500,"16/10/2024",1410,true);
System.out.println( "FOOD ITEM NAME :"+name+" /CATOGORY : "+category+" /PRICE : "+price+"Rs"+ " /NET QUANTITY :"+quantity+"g"+" /EXPIRY DATE :"+expDate+" /CALORIES : "+calories);
}
public static void itemDetails(String name, String category, double price, int quantity, String expDate, int calories, boolean isOrganic){
System.out.println( "FOOD ITEM NAME :"+name+" /CATOGORY : "+category+" /PRICE : "+price+"Rs"+ " /NET QUANTITY :"+quantity+"g"+" /EXPIRY DATE :"+expDate+" /CALORIES : "+calories+
" /IS ORGANIC : "+isOrganic);

//System.out.println("100% NATUREL";
}
}