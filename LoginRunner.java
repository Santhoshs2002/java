import java.util.Scanner;
public class LoginRunner{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
Login.email();
String email = scanner.nextLine();

Login.password();
String password = scanner.nextLine();
System.out.println("Login Successfully");
scanner.close();
}
}