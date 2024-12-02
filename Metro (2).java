public class Metro{
	public static void via(String from,String to,int ticketprice){
		System.out.println("FROM :"+from);
		System.out.println("TO :"+to);
		if(ticketprice == 25){
			System.out.println("THE TICKET PRICE FROM BANSHANKARI TO BTM IS 25rs");
		}else{
			System.out.println("THE TICKET PRICE FROM BANSHANKARI TO BTM IS 50rs");
		}
	}
	public static void cardBalance(int card, int ticket){
		int cardBalance = card-ticket;
		System.out.println("THE BALANCE IN CARD :"+card);
		System.out.println("DEBITED:"+ticket);
		System.out.println("THE REMAINING BALANCE IN CARD :"+cardBalance); 
	}
}
