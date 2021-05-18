package Inheritence;

public class HRDept extends EmpDate {



private int noOfWorkingDays=30;
private int noOfLeaveDays;

public void readLeaveDays()
{
	System.out.println("Enter number of leave days: ");
	System.out.println("==========================");
	noOfLeaveDays=sc.nextInt();
}

public int showLeaveDays() {
	System.out.println("Number of leave days: "+noOfLeaveDays);
	return noOfLeaveDays;
}
	}

