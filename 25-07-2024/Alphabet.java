public class Alphabet{
char cha[] = new char[26];
int index = 0; 

public int arrLength(){
return cha.length;
}
public void alphabet(char letter){
if(this.index < this.arrLength()){
cha[index] = letter;
index++;
}
}
public void print(){
for(int i=0; i<this.arrLength(); i++){
System.out.println(cha[i]);
}
}
}
