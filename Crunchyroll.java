public class Crunchyroll{
public static void watchAnime(){
System.out.println("WELCOME TO ANIME WORLD");
}
public static void watchAnime(String title){
System.out.println("ANIME NAME : "+title);
}
public static void watchAnime(String title,int episode){
System.out.println("ANIME NAME : "+title+" /EPISODE : "+episode);
}
public static void watchAnime(String title,int episode,boolean isSubtitleAvailable){
if(isSubtitleAvailable==true){
System.out.println("SUBTITLE AVAILABLE FOR :"+title+" /EPISODE NUMBER :"+episode);
}else{
System.out.println("NO SUBTITLE AVAILABLE FOR :"+title+" /EPISODE NUMBER :"+episode);
}
}
}