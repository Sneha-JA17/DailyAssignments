package regrexexample;
import java.util.Scanner;
import java.util.regex.Pattern;



public class DemoEmailRestricted {

	
	
public static void main(String[] args) {
				// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			 System.out.println("Enter email");
			String email=sc.next();
			 System.out.println(Pattern.matches("^[A-Za-z0-9._$+]{4,}[a-zA-Z0-9]@[a-z]{2,6}\\.(.+)$", email));
				sc.close();
					}
			}



