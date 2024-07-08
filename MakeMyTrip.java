public class MakeMyTrip{
public static void details(String destination){
System.out.println("Destination : " +destination);
}
public static void details(String destination,int numberOfPassenger){
System.out.println("Destination : "+destination+" /Number of passenger :"+numberOfPassenger);
}
public static void details(String destination,int numberOfPassenger
,double tripCost){
System.out.println("Destination : "+destination+" /Number of passenger :"+numberOfPassenger
+" /Trip Cost :"+tripCost+"k");
}
public static void details(String destination,int numberOfPassenger
,double tripCost,boolean isRoundTrip){
System.out.println("Destination : "+destination+" /Number of passenger :"+numberOfPassenger
+" /Trip Cost :"+tripCost+"k"+" /Is Round Trip :"+isRoundTrip);
}
}




