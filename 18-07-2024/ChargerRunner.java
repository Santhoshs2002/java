public class ChargerRunner
{
public static void main(String[] args){
Charger charger = new Charger("Samsung");
Charger charger1 = new Charger("Samsung","EP-TA20JWE");
Charger charger2 = new Charger("Samsung","EP-TA20JWE",15);
Charger charger3 = new Charger("Samsung","EP-TA20JWE",15,"White");
Charger charger4 = new Charger("Samsung","EP-TA20JWE",15,"White",true);
Charger charger5 = new Charger("Samsung","EP-TA20JWE",15,"White",true,1.5);
Charger charger6 = new Charger("Samsung","EP-TA20JWE",15,"White",true,1.5,"USB type-C");
Charger charger7 = new Charger("Samsung","EP-TA20JWE",15,"White",true,1.5,"USB type-C",50);
Charger charger8 = new Charger("Samsung","EP-TA20JWE",15,"White",true,1.5,"USB type-C",50,1500);
Charger charger9 = new Charger("Samsung","EP-TA20JWE",15,"White",true,1.5,"USB type-C",50,1500,true);

}
}