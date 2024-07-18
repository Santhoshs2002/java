public class Charger
{
public String brand;
public String model;
public int outputPower;
public String colore;
public boolean isFastCharging;
public double cableLength;
public String connecterType;
public double weight;
public int price;
public boolean isPortable;

	public Charger(String brand){
	this.brand=brand;
	System.out.println("Charger Brand : "+brand);
	}
	public Charger(String brand,String model){
	this.brand=brand;
	this.model=model;
	System.out.println("Charger Brand : "+brand);
	System.out.println("Its Model : "+model);
	}
	public Charger(String brand,String model,int outputPower){
	this.brand=brand;
	this.model=model;
	this.outputPower=outputPower;
	System.out.println("Charger Brand : "+brand);
	System.out.println("Its Model : "+model);
	System.out.println("OutPut Power :"+outputPower+ " wats");

	}
	public Charger(String brand,String model,int outputPower,
	String colore){
	this.brand=brand;
	this.model=model;
	this.outputPower=outputPower;
	this.colore=colore;
	System.out.println("Charger Brand : "+brand);
	System.out.println("Its Model : "+model);
	System.out.println("OutPut Power :"+outputPower+ " wats");
	System.out.println("Charger color : "+colore);
	}
	public Charger(String brand,String model,int outputPower,
	String colore,boolean isFastCharging){
	this.brand=brand;
	this.model=model;
	this.outputPower=outputPower;
	this.colore=colore;
	System.out.println("Charger Brand : "+brand);
	System.out.println("Its Model : "+model);
	System.out.println("OutPut Power :"+outputPower+ " wats");
	System.out.println("Charger color : "+colore);
	System.out.println("IS it fast Charging : "+isFastCharging);

	}
	public Charger(String brand,String model,int outputPower,
	String colore,boolean isFastCharging,double cableLength){
	this.brand=brand;
	this.model=model;
	this.outputPower=outputPower;
	this.colore=colore;
	this.cableLength=cableLength;
	System.out.println("Charger Brand : "+brand);
	System.out.println("Its Model : "+model);
	System.out.println("OutPut Power :"+outputPower+ " wats");
	System.out.println("Charger color : "+colore);
	System.out.println("IS it fast Charging : "+isFastCharging);
	System.out.println("Cable length : "+cableLength+ " m");
	}
	public Charger(String brand,String model,int outputPower,
	String colore,boolean isFastCharging,double cableLength,
	String connecterType){
	this.brand=brand;
	this.model=model;
	this.outputPower=outputPower;
	this.colore=colore;
	this.cableLength=cableLength;
	this.connecterType=connecterType;
	System.out.println("Charger Brand : "+brand);
	System.out.println("Its Model : "+model);
	System.out.println("OutPut Power :"+outputPower+ " wats");
	System.out.println("Charger color : "+colore);
	System.out.println("IS it fast Charging : "+isFastCharging);
	System.out.println("Cable length : "+cableLength+ " m");
	System.out.println("Connecter Type : "+connecterType);

	}
	public Charger(String brand,String model,int outputPower,
	String colore,boolean isFastCharging,double cableLength,
	String connecterType,double weight){
	this.brand=brand;
	this.model=model;
	this.outputPower=outputPower;
	this.colore=colore;
	this.cableLength=cableLength;
	this.connecterType=connecterType;
	this.weight=weight;
	System.out.println("Charger Brand : "+brand);
	System.out.println("Its Model : "+model);
	System.out.println("OutPut Power :"+outputPower+ " wats");
	System.out.println("Charger color : "+colore);
	System.out.println("IS it fast Charging : "+isFastCharging);
	System.out.println("Cable length : "+cableLength+ " m");
	System.out.println("Connecter Type : "+connecterType);
	System.out.println("Weight of Charger : "+weight+ " grams");

	}
	public Charger(String brand,String model,int outputPower,
	String colore,boolean isFastCharging,double cableLength,
	String connecterType,double weight,int price){
	this.brand=brand;
	this.model=model;
	this.outputPower=outputPower;
	this.colore=colore;
	this.cableLength=cableLength;
	this.connecterType=connecterType;
	this.weight=weight;
	this.price=price;
	System.out.println("Charger Brand : "+brand);
	System.out.println("Its Model : "+model);
	System.out.println("OutPut Power :"+outputPower+ " wats");
	System.out.println("Charger color : "+colore);
	System.out.println("IS it fast Charging : "+isFastCharging);
	System.out.println("Cable length : "+cableLength+ " m");
	System.out.println("Connecter Type : "+connecterType);
	System.out.println("Weight of Charger : "+weight+ " grams");
	System.out.println("Charger Price :"+price+ " Rupees");

	}
	public Charger(String brand,String model,int outputPower,
	String colore,boolean isFastCharging,double cableLength,
	String connecterType,double weight,int price,boolean isPortable){
	this.brand=brand;
	this.model=model;
	this.outputPower=outputPower;
	this.colore=colore;
	this.cableLength=cableLength;
	this.connecterType=connecterType;
	this.weight=weight;
	this.price=price;
	this.isPortable=isPortable;
	System.out.println("Charger Brand : "+brand);
	System.out.println("Its Model : "+model);
	System.out.println("OutPut Power :"+outputPower+ " wats");
	System.out.println("Charger color : "+colore);
	System.out.println("IS it fast Charging : "+isFastCharging);
	System.out.println("Cable length : "+cableLength+ " m");
	System.out.println("Connecter Type : "+connecterType);
	System.out.println("Weight of Charger : "+weight+ " grams");
	System.out.println("Charger Price :"+price+ " Rupees");
	System.out.println("Is it Portable :"+isPortable);
	}
}