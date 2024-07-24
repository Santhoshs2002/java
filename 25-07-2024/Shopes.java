public class Shopes{
String shopesName[] = new String[8];
int index = 0;
public void shope(String name){
	if(this.index < shopesName.length){
		System.out.println(index);
	shopesName[index]=name;	
	index++;
	}else{
		System.out.println("Array is full");
	}
}
public void names(){
	for(int i=0; i<shopesName.length ; i++){
		System.out.println("Shop names :"+shopesName[i]);
	}
}
}