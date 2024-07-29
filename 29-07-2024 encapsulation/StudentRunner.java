public class StudentRunner{
public static void main(String[] args){
Student studentDetails = new Student();
studentDetails.getByname("Raju");
String name = studentDetails.setByname();
System.out.println("Student name :"+name);
System.out.println("-------------------");
studentDetails.getByage(21);
int age = studentDetails.setByage();
System.out.println("Student age :"+age);
System.out.println("-------------------");
studentDetails.getBystudentId("r211va10");
String studentId = studentDetails.setBystudentId();
System.out.println("Student usn :"+studentId);
System.out.println("-------------------");
studentDetails.getBycorse("Cyber Security");
String corse = studentDetails.setBycorse();
System.out.println("Student course :"+corse);
System.out.println("-------------------");
studentDetails.getBygrade("A");
String grade = studentDetails.setBygrade();
System.out.println("Student grade :"+grade);
System.out.println("-------------------");
studentDetails.getByemail("xyz.xworkz@gmail.com");
String email = studentDetails.setByemail();
System.out.println("Student email :"+email);
System.out.println("-------------------");
studentDetails.getByphoneNumber("9872564512");
String phoneNumber = studentDetails.setByphoneNumber();
System.out.println("Student phoneNumber :"+phoneNumber);
System.out.println("-------------------");
studentDetails.getByaddress("Bengaluru");
String address = studentDetails.setByaddress();
System.out.println("Student address :"+address);
System.out.println("-------------------");
studentDetails.getByenrollmentYear("2024");
String enrollmentYear = studentDetails.setByenrollmentYear();
System.out.println("Student enrollmentYear :"+enrollmentYear);
System.out.println("-------------------");
studentDetails.getBycgpa(7.42);
double cgpa = studentDetails.setBycgpa();
System.out.println("Student cgpa :"+cgpa);
System.out.println("-------------------");
}

}
