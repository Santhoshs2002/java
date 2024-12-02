public class MocktailsRunner{
public static void main(String[] args){
Mocktails.getinfo();
Mocktails.name("Fruit Punch");
Mocktails.rating();
String drink[] ={"fruit vodka","sugarcane rum","coke monk"};
Mocktails.drink_details(drink);
Mocktails.max_rupees(20,50);
}
}