public class Exams
{
public static String subject1 = "Maths";
public static String subject2 = "Science";
public static String subject3 = "Scocial";
public static String subject4 = "Kannada";
public static String subject5 = "Hindi";

public static void main(String[] args)
{
int maths = 35;
int science = 38;
int scocial = 21;
int kannada = 60;
int hindi = 40;
int sum = (maths + science + scocial + kannada + hindi);
System.out.println("Subject 1 : "+subject1+" ="+maths);
System.out.println("Subject 2 : "+subject2+" ="+science);
System.out.println("Subject 3 : "+subject3+" ="+scocial);
System.out.println("Subject 4 : "+subject4+" ="+kannada);
System.out.println("Subject 5 : "+subject5+" ="+hindi);
System.out.println("Total ="+sum);
}
}