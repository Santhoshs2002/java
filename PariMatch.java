public class PariMatch{
public static void placeBet(){
System.out.println("PLACING A STANDARD BET");
}
public static void placeBet(String match){
System.out.println("MATCH TYPE : "+match);
}
public static void placeBet(String match, double amount){
System.out.println("MATCH TYPE : "+match+" /MINIMUM DEPOSIT : "+amount);
}
public static void placeBet(String match, double amount , String team){
System.out.println("placing a bet of "+amount+"Rs on team "+team+" in match "+match );
}
}