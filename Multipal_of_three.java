public class Multipal_of_three
{
public static void main(String[] args){
int numbers[] = {2,3,4,6,8,9,10,12,15,14,16,21,24,18,29,30,20};
int product = 0;
for(int index=0 ; index<numbers.length ; index++){
if(numbers[index]%3==0){
System.out.println("The multipal by 3 numbers are"+numbers[index]);
}
}
}
}