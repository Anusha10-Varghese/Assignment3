package assignment3;

public class TestEmployeeQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeQ5 e=new EmployeeQ5("Anusha", "Varghese",90000);
		EmployeeQ5 e1=new EmployeeQ5("Anu", "Jose",80000);
		System.out.println(e.getfirst_name());
		System.out.println(e1.getfirst_name());
		System.out.println(e.getsalary()*1.1);
		System.out.println("The yearly salary of " + e.getfirst_name()+ " " + e.getlast_name()+ " " + e.getsalary()*12);
		System.out.println("The yearly salary of " + e1.getfirst_name()+ " " + e1.getlast_name()+ " " + e1.getsalary()*12);
		
	}
	}


