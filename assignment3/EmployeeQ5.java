package assignment3;

public class EmployeeQ5 {
	String first_name,last_name;
	double salary;
	EmployeeQ5(String first_name,String last_name,double salary){
		this.first_name=first_name;
		this.last_name=last_name;
		this.salary=salary;
	}
	String getfirst_name() {
		return first_name;
		
	}
	void setfirst_name(String first_name) {
		this.first_name=first_name;
		
	}
	String getlast_name() {
		return last_name;
		
	}
	void setlast_name(String last_name) {
		this.last_name=last_name;
		
	}
	double getsalary() {
		return salary;
		
	}
	void setsalary(double salary) {
		this.salary=salary;
	}
		

}
