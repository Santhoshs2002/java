public class Cricket{
public static void runRate(int matchPlayed, int totalScore){
double runrate = totalScore / matchPlayed;
System.out.println("RUN RATE ="+runrate);
}
public static void matchResult(String result){
System.out.println("MATCH RESULT ="+result);
}
public static void playerDetails(String name, int age, double height, float weight, String education, long numberOfMatches, int totalScore){
System.out.println("PLAYER NAME ="+name);
System.out.println("PLAYER AGE ="+age);
System.out.println("PLAYER HEIGHT ="+height);
System.out.println("PLAYER WEIGHT ="+weight);
System.out.println("EDUCATION QUALIFICATION ="+education);
System.out.println("NUMBER OF MATCHES PLAYED ="+numberOfMatches);
System.out.println("TOTAL SCORE ="+totalScore);
}
}