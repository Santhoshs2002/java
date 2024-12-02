public class Application{
	public static void bmtcPassApplication(){
	System.out.println("APPLYING FOR A STUDENT BUS PASS");
	}
	public static void bmtcPassApplication(String applicantName){
	System.out.println("APPLICANT NAME : "+applicantName);	
	}
	public static void bmtcPassApplication(String applicantName, int applicantAge){
	System.out.println("APPLICANT NAME : "+applicantName+" /APPLICANT AGE : "+applicantAge);
	}
	public static void bmtcPassApplication(String applicantName, int applicantAge ,boolean isStudentpass){
	if(isStudentpass){
		System.out.println("APPLICANT NAME : "+applicantName+" /APPLICANT AGE : "+applicantAge+" /IS STUDENT PASS : "+isStudentpass);
	}
	}
	public static void bmtcPassApplication(String applicantName, int applicantAge ,boolean isStudentpass, String collegeName){
			System.out.println("APPLICANT NAME : "+applicantName+" /APPLICANT AGE : "+applicantAge+" /IS STUDENT PASS : "
			+isStudentpass+" /COLLEGE NAME : "+collegeName);
	}
	public static void bmtcPassApplication(String applicantName, int applicantAge ,boolean isStudentpass, String collegeName, String via){
	System.out.println("APPLICANT NAME : "+applicantName+" /APPLICANT AGE : "+applicantAge+" /IS STUDENT PASS : "
			+isStudentpass+" /COLLEGE NAME : "+collegeName+" /VIA LOCATION : "+via);
	}
	public static void bmtcPassApplication(String applicantName, int applicantAge ,boolean isStudentpass, String collegeName, String via,
	double price){
	System.out.println("APPLICANT NAME : "+applicantName+" /APPLICANT AGE : "+applicantAge+" /IS STUDENT PASS : "
			+isStudentpass+" /COLLEGE NAME : "+collegeName+" /VIA LOCATION : "+via+" /PRICE : "+price);
	}
	public static void bmtcPassApplication(String applicantName, int applicantAge ,boolean isStudentpass, String collegeName, String via,
	double price, String validUpto){
		System.out.println("APPLICANT NAME : "+applicantName+" /APPLICANT AGE : "+applicantAge+" /IS STUDENT PASS : "
			+isStudentpass+" /COLLEGE NAME : "+collegeName+" /VIA LOCATION : "+via+" /PRICE : "+price+" /VALID UPTO : "+validUpto);
	}
	public static String bmtcPassApplication(String applicantName, int applicantAge ,boolean isStudentpass, String collegeName, String via,
	double price, String validUpto, String request){
		System.out.println("APPLICANT NAME : "+applicantName+" /APPLICANT AGE : "+applicantAge+" /IS STUDENT PASS : "
			+isStudentpass+" /COLLEGE NAME : "+collegeName+" /VIA LOCATION : "+via+" /PRICE : "+price+" /VALID UPTO : "+validUpto+
			" /STATUS : "+request);
	return "STUDENT PASS APPLICATION REQUEST APPLIED SUCCESSFUL";		
	}
	}
