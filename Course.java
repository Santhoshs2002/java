public class Course
{
public static void main(String[] args)
{
int courseCost = 12000;
double gstRate = 18*0.01;
double gstAmount = gstRate*courseCost;
double totalCost = courseCost+gstAmount;
System.out.println("Course Cost :"+courseCost);
System.out.println("GST Amount :"+gstAmount);
System.out.println("Total Cost :"+totalCost); 
}
}
