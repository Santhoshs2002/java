public class ApplicationRunner{
public static void main(String[] args){
Application.bmtcPassApplication();
Application.bmtcPassApplication("DRAVID");
Application.bmtcPassApplication("DRAVID",21);
Application.bmtcPassApplication("DRAVID",21,true);
Application.bmtcPassApplication("DRAVID",21,true,"SVIT");
Application.bmtcPassApplication("DRAVID",21,true,"SVIT","YLNK TO RAJANUKUNTE");
Application.bmtcPassApplication("DRAVID",21,true,"SVIT","YLNK TO RAJANUKUNTE",1200);
Application.bmtcPassApplication("DRAVID",21,true,"SVIT","YLNK TO RAJANUKUNTE",1200,"12/06/2025");
//Application.bmtcPassApplication("DRAVID",21,true,"SVIT","YLNK TO RAJANUKUNTE",1200,"12/06/2025","SUMBITED");
System.out.println(Application.bmtcPassApplication("DRAVID",21,true,"SVIT","YLNK TO RAJANUKUNTE",1200,"12/06/2025","SUMBITED"));
}
}