package pages;


public class EmployeeInfoClass {
	
	int employeeId;
	String employeeName;
	
	EmployeeInfoClass(int employeeId, String employeeName){
		//this(); // to call default constructor
		System.out.println("Parameterized constructor");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		
	}
		
	EmployeeInfoClass(){
		this(100,"Hari");
		System.out.println("Default constructor");
	}

	public void printDetails() {
		System.out.println(employeeId+" "+employeeName);

	}
	
	public static void main(String[] args) {
		EmployeeInfoClass emp1 = new EmployeeInfoClass();
		emp1.printDetails();
		
		
		String text = new String("Welcome");
		
		

	}

}