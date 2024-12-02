public class Cricbuzz{
public static void matchDetails(){
System.out.println("SHOWING MATCH DETAILS");
}
public static void matchDetails(String matchType){
System.out.println("MATCH TYPE : "+matchType);
}
public static void matchDetails(String matchType, String team){
System.out.println("MATCH TYPE : "+matchType+" /Team : "+team);
}
public static void matchDetails(String matchType, String team, String venue){
System.out.println("MATCH TYPE : "+matchType+" /Team : "+team+" At :"+venue);
}
}