public class Shopping{
int prices[] = new int[10];
int index = 0;

public void bill (String item, int price){
	prices[index]=price;
	index++;
	System.out.println("Item :"+item+" price :"+price);
}
public void total(){
	for(int i=0; i<prices.length ; i++){
		index+=prices[i];
	}
	System.out.println("Total bill :"+index);
}

}