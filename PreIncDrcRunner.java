public class PreIncDrcRunner
{
public static void main(String[] args){
	int preincrement = PreIncDrc.++i;	
	System.out.println("Before pre increment is :"+preincrement);
	System.out.println("After pre increment is :"+PreIncDrc.i);
	int predecrement = PreIncDrc.--j;
	System.out.println("Before pre decrement is :"+predecrement);
	System.out.println("After pre decrement is :"+PreIncDrc.j);
}
}