public class Amazon{
	String startDate;
	String endDate;
String product;
float price;
float discount;

public Amazon(){
	System.out.println("AMAZON GREAT INDIAN FESTIVAL");
}
public Amazon(String startDate, String endDate){
	this.startDate=startDate;
	this.endDate=endDate;
	System.out.println("Start at :"+startDate+" / end at :"+endDate);
}
	public void discount(String product, float price, float discount){
		this.product=product;
		this.price=price;
		this.discount=discount;
		float discountAmt=price-(price*discount);
		float discper = discount*100;
		System.out.println("The Product ("+product+") price without discount is:("+price+") and after("+discper+")% discount is: "+discountAmt);
	}
}