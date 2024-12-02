public class OpenAI{
public static void openAIName(){
String openAIName = "CHAT GPT";
if(openAIName=="CHAT GPT"){
System.out.println("THE AI NAME IS :"+openAIName);
}else{
System.out.println("THE AI NAME IS NOT :"+openAIName);
}
}
public static void openAIVersion(){
double openAIVersion = 0.8;
if(openAIVersion==0.8){
System.out.println("THE AI VERSION IS :"+openAIVersion);
}else{
System.out.println("THE AI VERSION IS NOT :"+openAIVersion);
}
}
public static void openAIName(String openAIName){
	if(openAIName=="CHAT GPT"){
System.out.println("THE AI NAME IS :"+openAIName);
}else{
System.out.println("THE AI IS NOT FOUND :"+openAIName);
}
}
public static void openAIVersion(double openAIVersion,String openAIName){
if(openAIVersion==0.8){
System.out.println("THE AI VERSION IS :"+openAIVersion);
}else{
System.out.println("THE AI NAME ("+openAIName+") VERSION ("+openAIVersion+") NOT FOUND");
}
}
public static void openAiName(){
	String openAiName = "QUILBOT";
	if(openAiName=="QUILBOT"){
System.out.println("THE AI NAME IS :"+openAiName);
return;
}else{
System.out.println("THE AI IS NOT FOUND :"+openAiName);
}
}
public static void openAiVersion(){
double openAiVersion = 0.9;
if(openAiVersion==0.8){
System.out.println("THE AI VERSION IS :"+openAiVersion);
return;
}else{
System.out.println("THE AI VERSION IS NOT :"+openAiVersion);
}
}
public static String openAIname(){
	String openAIname = "Gamma";
	if(openAIname=="GAMMA"){
System.out.println("THE AI NAME IS :"+openAIname);
return "GAMMA";
}else{
System.out.println("THE AI IS NOT FOUND :"+openAIname);
}
return openAIname;
}
}