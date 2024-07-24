public class ShoppingRunner{
public static void main(String[] args){
Shopping payment = new Shopping();
payment.bill("Bag",1999);
payment.bill("Dress",3000);
payment.bill("watch",4000);
payment.bill("Shoes",1500);
payment.bill("mobile",15000);
payment.bill("food",400);
payment.total();
}
}