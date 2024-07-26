public class States{
String stateNames[] = new String[5];
int index = 0;

public String creatByStatesName(String name){
	if(this.index<stateNames.length){
	stateNames[index] =name;
	index++;
	return"updated";
	}
	return "Array is full";
}
public void readByStatesName(){
	for(int i=0; i<stateNames.length ; i++){
		System.out.println("States are :"+stateNames[i]);
	}
}
public String updatesByStatesName(String oldName , String newName){
		for(int i=0; i<stateNames.length ; i++){
			if(stateNames[i]==oldName){
				stateNames[i]=newName;
				return "updated Successfull";
			}
}
return "Not updated";
}
public String deleteByStatesName(String oldName){
		for(int i=0; i<stateNames.length ; i++){
			if(stateNames[i]==oldName){
								stateNames[i]=null;
return"Delete Successfully";
}
		}
		return "Not deleted";
}
public String searchByStatesName(String oldName){
	for(String names :stateNames){
		if(names==oldName){
			return "Result found :"+oldName;
		}
	}
	return "Result not found";
	
}
}