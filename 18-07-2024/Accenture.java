public class Accenture{
public String employe_name;
public byte age;
public int id_number;
public short nuber_of_holidays;
public long phone_number;
public float experience;
public double salary;
public boolean isAvtive;
public char gender ;
public String location;

	public Accenture(String employe_name){
	this.employe_name = employe_name;
	System.out.println("EMPLOYE NAME :"+employe_name);
	}
	public Accenture(String employe_name,byte age){
	this.employe_name = employe_name;
	this.age = age;
	System.out.println("EMPLOYE NAME :"+employe_name);
	System.out.println("EMPLOYE AGE :"+age);
	}
	public Accenture(String employe_name,byte age,int id_number){
	this.employe_name = employe_name;
	this.age = age;
	this.id_number = id_number;
	System.out.println("EMPLOYE NAME :"+employe_name);
	System.out.println("EMPLOYE AGE :"+age);
	System.out.println("EMPLOYE ID NUMBER :"+id_number);
	}
	public Accenture(String employe_name,byte age,int id_number,short nuber_of_holidays){
	this.employe_name = employe_name;
	this.age = age;
	this.id_number = id_number;
	this.nuber_of_holidays = nuber_of_holidays;
	System.out.println("EMPLOYE NAME :"+employe_name);
	System.out.println("EMPLOYE AGE :"+age);
	System.out.println("EMPLOYE ID NUMBER :"+id_number);
	System.out.println("EMPLOYE TOTAL HOLIDAY/YEAR :"+nuber_of_holidays);
	}
	public Accenture(String employe_name,byte age,int id_number,short nuber_of_holidays
	,long phone_number){
	this.employe_name = employe_name;
	this.age = age;
	this.id_number = id_number;
	this.nuber_of_holidays = nuber_of_holidays;
	this.phone_number = phone_number;
	System.out.println("EMPLOYE NAME :"+employe_name);
	System.out.println("EMPLOYE AGE :"+age);
	System.out.println("EMPLOYE ID NUMBER :"+id_number);
	System.out.println("EMPLOYE TOTAL HOLIDAY/YEAR :"+nuber_of_holidays);
	System.out.println("EMPLOYE PHONE NUMBER :"+phone_number);

	}
	public Accenture(String employe_name,byte age,int id_number,short nuber_of_holidays
	,long phone_number,float experience){
	this.employe_name = employe_name;
	this.age = age;
	this.id_number = id_number;
	this.nuber_of_holidays = nuber_of_holidays;
	this.phone_number = phone_number;
	this.experience = experience;
	System.out.println("EMPLOYE NAME :"+employe_name);
	System.out.println("EMPLOYE AGE :"+age);
	System.out.println("EMPLOYE ID NUMBER :"+id_number);
	System.out.println("EMPLOYE TOTAL HOLIDAY/YEAR :"+nuber_of_holidays);
	System.out.println("EMPLOYE PHONE NUMBER :"+phone_number);
	System.out.println("EMPLOYE EXPERIENCE :"+experience);
	}
	public Accenture(String employe_name,byte age,int id_number,short nuber_of_holidays
	,long phone_number,float experience,double salary){
	this.employe_name = employe_name;
	this.age = age;
	this.id_number = id_number;
	this.nuber_of_holidays = nuber_of_holidays;
	this.phone_number = phone_number;
	this.experience = experience;
	this.salary = salary;
	System.out.println("EMPLOYE NAME :"+employe_name);
	System.out.println("EMPLOYE AGE :"+age);
	System.out.println("EMPLOYE ID NUMBER :"+id_number);
	System.out.println("EMPLOYE TOTAL HOLIDAY/YEAR :"+nuber_of_holidays);
	System.out.println("EMPLOYE PHONE NUMBER :"+phone_number);
	System.out.println("EMPLOYE EXPERIENCE :"+experience);
	System.out.println("EMPLOYE SALARY :"+salary);

	}
	public Accenture(String employe_name,byte age,int id_number,short nuber_of_holidays
	,long phone_number,float experience,double salary,boolean isAvtive){
	this.employe_name = employe_name;
	this.age = age;
	this.id_number = id_number;
	this.nuber_of_holidays = nuber_of_holidays;
	this.phone_number = phone_number;
	this.experience = experience;
	this.salary = salary;
	this.isAvtive = isAvtive;
	System.out.println("EMPLOYE NAME :"+employe_name);
	System.out.println("EMPLOYE AGE :"+age);
	System.out.println("EMPLOYE ID NUMBER :"+id_number);
	System.out.println("EMPLOYE TOTAL HOLIDAY/YEAR :"+nuber_of_holidays);
	System.out.println("EMPLOYE PHONE NUMBER :"+phone_number);
	System.out.println("EMPLOYE EXPERIENCE :"+experience);
	System.out.println("EMPLOYE SALARY :"+salary);
System.out.println("EMPLOYE STATUS :"+isAvtive);
	}
	public Accenture(String employe_name,byte age,int id_number,short nuber_of_holidays
	,long phone_number,float experience,double salary,boolean isAvtive,char gender){
	this.employe_name = employe_name;
	this.age = age;
	this.id_number = id_number;
	this.nuber_of_holidays = nuber_of_holidays;
	this.phone_number = phone_number;
	this.experience = experience;
	this.salary = salary;
	this.isAvtive = isAvtive;
	this.gender = gender;
	System.out.println("EMPLOYE NAME :"+employe_name);
	System.out.println("EMPLOYE AGE :"+age);
	System.out.println("EMPLOYE ID NUMBER :"+id_number);
	System.out.println("EMPLOYE TOTAL HOLIDAY/YEAR :"+nuber_of_holidays);
	System.out.println("EMPLOYE PHONE NUMBER :"+phone_number);
	System.out.println("EMPLOYE EXPERIENCE :"+experience);
	System.out.println("EMPLOYE SALARY :"+salary);
System.out.println("EMPLOYE STATUS :"+isAvtive);
	System.out.println("EMPLOYE GENDER MALE(M)/FEMALE(F) :"+gender);
	}
	public Accenture(String employe_name,byte age,int id_number,short nuber_of_holidays
	,long phone_number,float experience,double salary,boolean isAvtive,char gender,String location){
	this.employe_name = employe_name;
	this.age = age;
	this.id_number = id_number;
	this.nuber_of_holidays = nuber_of_holidays;
	this.phone_number = phone_number;
	this.experience = experience;
	this.salary = salary;
	this.isAvtive = isAvtive;
	this.gender = gender;
	this.location = location;
	System.out.println("EMPLOYE NAME :"+employe_name);
	System.out.println("EMPLOYE AGE :"+age);
	System.out.println("EMPLOYE ID NUMBER :"+id_number);
	System.out.println("EMPLOYE TOTAL HOLIDAY/YEAR :"+nuber_of_holidays);
	System.out.println("EMPLOYE PHONE NUMBER :"+phone_number);
	System.out.println("EMPLOYE EXPERIENCE :"+experience);
	System.out.println("EMPLOYE SALARY :"+salary);
System.out.println("EMPLOYE STATUS :"+isAvtive);
	System.out.println("EMPLOYE GENDER MALE(M)/FEMALE(F) :"+gender);
	System.out.println("EMPLOYE LOCATION :"+location);

	}
}