public class AmazonRunner{
public static void main(String[] args){
Amazon sale = new Amazon();
Amazon sale1 = new Amazon("01-08-2024","01-09-2024");
sale.discount("Laptop",50000.0f,0.20f);
sale.discount("Plants",500.0f,0.10f);
sale.discount("Chair",5000.0f,0.04f);
sale.discount("Bag",1999.0f,0.07f);
sale.discount("Pen",7.0f,0.01f);
sale.discount("Cloth",999.0f,0.03f);
sale.discount("mobile",30000.0f,0.5f);
sale.discount("watch",3999.0f,0.05f);
sale.discount("Shoes",2999.0f,0.10f);
sale.discount("Washing Machine",50000.0f,0.10f);
sale.discount("Fridge",70000.0f,0.20f);
sale.discount("Oven",15000.0f,0.09f);
}
}
