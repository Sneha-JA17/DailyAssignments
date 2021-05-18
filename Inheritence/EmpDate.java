package Inheritence;
import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Scanner;


	public class EmpDate {

		private int empId;
		private String empName;
		private String empDob;
		private String empDoj;
		private float empSalary;
		Scanner sc=new Scanner(System.in);
		//creating the Date object
		Date dob=new Date();
		Date doj=new Date();
		/*SimpleDateFormat is a class in java.text.package to declare date format for
		 * converting string to date or date to another format 
		*/
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		public void addEmployee() throws ParseException {
			System.out.println("Enter employee details");
			System.out.println("Enter Employee id");
			empId=sc.nextInt();
			System.out.println("Enter Employee name");
			empName=sc.next();
			System.out.println("Enter Employee DOB(dd/MM/yyyy)");
			empDob=sc.next();
			dob=convertStringToDate(empDob);
			System.out.println("Enter Employee DOJ(dd/MM/yyyy)");
			empDoj=sc.next();
			doj=convertStringToDate(empDoj);
			empSalary=sc.nextFloat();
			
		}
		public Date convertStringToDate(String date) throws ParseException {
			Date stringToDate = sdf.parse(date);
			return stringToDate;
		}
		public float showSalary(){
			return empSalary;
		}
		public void displayEmployeeDetails() {
			System.out.println("Employee Details are...");
			System.out.println("Employee Id = "+empId);
			System.out.println("Employee Name = "+empName);
			System.out.println("Employee DOB = "+dob);
			System.out.println("Employee DOJ = "+doj);
		}
		
		
	} 
	


