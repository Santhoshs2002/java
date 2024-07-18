public class Watch
{
	public String brand;
    public String model;
    public String color;
    public String material;
    public double diameter; 
    public boolean isWaterResistant;
    public int waterResistanceDepth; 
    public String movementType;
    public double weight; 
    public int price;

	
		public Watch(String brand){
		this.brand = brand;
		System.out.println("Brand: " +brand);
		}
		public Watch(String brand,String model){
		this.brand = brand;
		this.model = model;
		System.out.println("Brand: " +brand);
	    System.out.println("Model: " +model);

		}
		public Watch(String brand,String model,String color){
		this.brand = brand;
		this.model = model;
		this.color = color;
		System.out.println("Brand: " +brand);
	    System.out.println("Model: " +model);
		System.out.println("Color: " +color);
		}
		public Watch(String brand,String model,String color,
		String material){
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.material = material;
		System.out.println("Brand: " +brand);
	    System.out.println("Model: " +model);
		System.out.println("Color: " +color);
		System.out.println("Material: " +material);

		}
		public Watch(String brand,String model,String color,
		String material,double diameter){
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.diameter = diameter;
		this.material = material;
		System.out.println("Brand: " +brand);
	    System.out.println("Model: " +model);
		System.out.println("Color: " +color);
		System.out.println("Material: " +material);
		System.out.println("Diameter: " +diameter + " mm");
		}
		public Watch(String brand,String model,String color,
		String material,double diameter,boolean isWaterResistant){
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.diameter = diameter;
		this.material = material;
		this.isWaterResistant = isWaterResistant;
		System.out.println("Brand: " +brand);
	    System.out.println("Model: " +model);
		System.out.println("Color: " +color);
		System.out.println("Material: " +material);
		System.out.println("Diameter: " +diameter + " mm");
		System.out.println("Water Resistant: " +isWaterResistant);
		}
		public Watch(String brand,String model,String color,
		String material,double diameter,boolean isWaterResistant,
		int waterResistanceDepth){
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.diameter = diameter;
		this.material = material;
		this.isWaterResistant = isWaterResistant;
		this.waterResistanceDepth = waterResistanceDepth;
		System.out.println("Brand: " +brand);
	    System.out.println("Model: " +model);
		System.out.println("Color: " +color);
		System.out.println("Material: " +material);
		System.out.println("Diameter: " +diameter + " mm");
		System.out.println("Water Resistant: " +isWaterResistant);
		System.out.println("Water Resistance Depth: " +waterResistanceDepth + " meters");
		}
		public Watch(String brand,String model,String color,
		String material,double diameter,boolean isWaterResistant,
		int waterResistanceDepth,String movementType,double weight){
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.diameter = diameter;
		this.material = material;
		this.isWaterResistant = isWaterResistant;
		this.waterResistanceDepth = waterResistanceDepth;
		this.movementType = movementType;
		this.weight = weight;
		System.out.println("Brand: " +brand);
	    System.out.println("Model: " +model);
		System.out.println("Color: " +color);
		System.out.println("Material: " +material);
		System.out.println("Diameter: " +diameter + " mm");
		System.out.println("Water Resistant: " +isWaterResistant);
		System.out.println("Water Resistance Depth: " +waterResistanceDepth + " meters");
		System.out.println("Movement Type: " +movementType);
		System.out.println("Weight: " +weight + " grams");
		}
		public Watch(String brand,String model,String color,
		String material,double diameter,boolean isWaterResistant,
		int waterResistanceDepth,String movementType,double weight,int price){
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.diameter = diameter;
		this.material = material;
		this.isWaterResistant = isWaterResistant;
		this.waterResistanceDepth = waterResistanceDepth;
		this.movementType = movementType;
		this.weight = weight;
		this.price = price;
		System.out.println("Brand: " +brand);
	    System.out.println("Model: " +model);
		System.out.println("Color: " +color);
		System.out.println("Material: " +material);
		System.out.println("Diameter: " +diameter + " mm");
		System.out.println("Water Resistant: " +isWaterResistant);
		System.out.println("Movement Type: " +movementType);
		System.out.println("Water Resistance Depth: " +waterResistanceDepth + " meters");
		System.out.println("Weight: " +weight + " grams");
		System.out.println("Price: Rs" +price);
		}
}