public class App{
int Unreadmessage;
long number;
boolean isStatusupdated;
String username;
	public App(boolean isStatusupdated){
		this(75);
		this.isStatusupdated=isStatusupdated;
		System.out.println("IS STATUS UPDATED :"+isStatusupdated);
	}
	public App(int Unreadmessage){
		this("SANTHU");
		this.Unreadmessage=Unreadmessage;
		System.out.println("TOTAL UNREAD MESSAGES :"+Unreadmessage);
	}
	public App(String username){
		this(9876579542l);
		this.username=username;
		System.out.println("USER :"+username);
	}
	public App(long number){
		this();
		this.number=number;
		System.out.println("WHATS APP NUMBER :"+number);
	}
	public App(){
		System.out.println("Here is the whatsapp info of :");
}
}