public class Charcount{
public static int occuranceOfChar(String[] str,char ch ){
	int count =0;
	for(String strarray : str){
for(int i=0; i<strarray.length() ; i++){
	if(strarray.charAt(i) == ch){
		count++;
	}
}
	}
return count;
}
public static void main(String[] args){
	String word[] = {"bgmi","mini militia","cash of clans"};
char countOfChar = 'i';

int occurance = occuranceOfChar(word,countOfChar);
System.out.println("the char ("+countOfChar+") occurance in given String array "+occurance);
}
} 

