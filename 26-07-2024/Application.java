public class Application{
String applicationNames[] = new String[5];
int index = 0;

public String creatByApplicationName(String name){
	if(this.index<applicationNames.length){
	applicationNames[index] =name;
	index++;
	return"updated";
	}
	return "Array is full";
}
public void readByApplicationName(){
	for(int i=0; i<applicationNames.length ; i++){
		System.out.println("Application are :"+applicationNames[i]);
	}
}
public String updatesByApplicationName(String oldName , String newName){
		for(int i=0; i<applicationNames.length ; i++){
			if(applicationNames[i]==oldName){
				applicationNames[i]=newName;
				return "updated Successfull";
			}
}
return "Not updated";
}
public String deleteByApplicationName(String oldName){
		for(int i=0; i<applicationNames.length ; i++){
			if(applicationNames[i]==oldName){
								applicationNames[i]=null;
return"Delete Successfully";
}
		}
		return "Not deleted";
}
public String searchByApplicationName(String oldName){
	for(String names :applicationNames){
		if(names==oldName){
			return "Result found :"+oldName;
		}
	}
	return "Result not found";
	
}
}