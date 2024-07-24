public class SocialMedia{
String userID;
boolean isOnline;
int followers;
short totalPost;
public SocialMedia(short totalPost){
this.totalPost=totalPost;
System.out.println("TOTAL POST UPLOADED :"+totalPost);
}
public SocialMedia(int followers){
this((short)4000);
this.followers=followers;
System.out.println("TOTAL FOLLOWERS :"+followers);
}
public SocialMedia(boolean isOnline){
this(600);
this.isOnline=isOnline;
System.out.println("IS ONLINE :"+isOnline);
}
public SocialMedia(String userID){
this(false);
this.userID=userID;
System.out.println("USER ID :"+userID);
}
public SocialMedia(){
this("Santhu");
System.out.println("HERE IS THE INSTAGRAM DETAILS OF USER");
}
}