public class Chair
{
 String material;
 int noOfLeg;
 String colore;
 boolean hasCussion;
static boolean hasArms;
static double height;
static double width;
static double depth;

public Chair( String material,
int noOfLeg,
String colore,
boolean hasCussion,
boolean hasArms,
double height,
double width,
double depth){
this.material=material;
this.noOfLeg=noOfLeg;
this.colore=colore;
this.hasCussion=hasCussion;
Chair.hasArms=hasArms;
Chair.height=height;
Chair.width=width;
Chair.depth=depth;

System.out.println("Material Used : "+material);
System.out.println("Number of legs : "+noOfLeg);
System.out.println("Chair Colore is : "+colore);
System.out.println("Chair has Cusion : "+hasCussion);
System.out.println("Chair has Arms : "+hasArms);
System.out.println("Height of the chair : "+height+" m");
System.out.println("width of the Chair : "+width+" m");
System.out.println("DEpth of the Chair : "+depth+ "m");
}
} 