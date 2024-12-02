public class Dominoes{
public static void orderpizza(){
System.out.println("Order a basic Cheese Corn Pizza......");
}
public static void orderpizza(String size){
System.out.println("Order a basic Cheese Corn Pizza of ("+size+") size");
}
public static void orderpizza(String size, String crustType){
System.out.println("Order a basic Cheese Corn Pizza of ("+size+") size, with ("+crustType+")Crust");
}
public static void orderpizza(String size, String crustType, boolean withExtraCheese){
if(withExtraCheese==true){
System.out.println("Order a basic Cheese Corn Pizza of ("+size+") size, with ("+crustType+")Crust, with Extra Cheese ");
}else{
System.out.println("Order a basic Cheese Corn Pizza of ("+size+") size, with ("+crustType+")Crust, with NO Extra Cheese ");
}
}
}
