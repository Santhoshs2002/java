public class Check_EO
{
public static void main(String[] args){
int numbers[] = {1,2,3,4,5,6,7,8,9};
int even = 0;
int odd = 0;
for(int index=0 ; index<numbers.length ; index++){
if(numbers[index]%2==0){
	System.out.println("the even number is :"+numbers[index]);
}else{
	System.out.println("the odd number is :"+numbers[index]);
}

	
}
}

}