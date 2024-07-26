public class Games{
String gamesNames[] = new String[5];
int index = 0;

public String creatByGamesName(String name){
	if(this.index<gamesNames.length){
	gamesNames[index] =name;
	index++;
	return"updated";
	}
	return "Array is full";
}
public void readByGamesName(){
	for(int i=0; i<gamesNames.length ; i++){
		System.out.println("Games are :"+gamesNames[i]);
	}
}
public String updatesByGamesName(String oldName , String newName){
		for(int i=0; i<gamesNames.length ; i++){
			if(gamesNames[i]==oldName){
				gamesNames[i]=newName;
				return "updated Successfull";
			}
}
return "Not updated";
}
public String deleteByGamesName(String oldName){
		for(int i=0; i<gamesNames.length ; i++){
			if(gamesNames[i]==oldName){
								gamesNames[i]=null;
return"Delete Successfully";
}
		}
		return "Not deleted";
}
public String searchByGamesName(String oldName){
	for(String names :gamesNames){
		if(names==oldName){
			return "Result found :"+oldName;
		}
	}
	return "Result not found";
	
}
}