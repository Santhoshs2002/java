public class LinkDind{
public static void profileDetails(){
String name = "Santhosh S";
int age = 21;
System.out.println("NAME : "+name+" / AGE : "+age);
LinkDind.educationDetails();
}
public static void educationDetails(){
	System.out.println("I HAVE COMPLETED MY BE AS CIVIL ENGG");
	LinkDind.personalDetails();
}
public static void personalDetails(){
	System.out.println("MY HOBBIES ARE LIKE : DRAWING, DEVELOPING SKILLS, GAMES");
	LinkDind.skills();
}
public static void skills(){
	System.out.println("SKILLS :CORE JAVA, MY SQL");
	LinkDind.percentageOfDegree();
}
public static void percentageOfDegree(){
	System.out.println("DEGREE CGPA : 7.4");
}
}