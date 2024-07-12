public class Messanger{
public static void sendingMessage(){
System.out.println("SENDING A MESSAGE FOR CHANNEL MOVIEADDA");
}
public static void sendingMessage(String message){
System.out.println(message);
}
public static void sendingMessage(String message, String recipeant){
System.out.println(message+" to "+recipeant);
}
public static void sendingMessage(String message, String recipeant, boolean urgent){
if(urgent){
System.out.println(message+" to "+recipeant+" ITS URGENT MESSAGE");
}else{
System.out.println(message+" to "+recipeant);
}
}
}