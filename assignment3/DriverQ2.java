package assignment3;

public class DriverQ2 extends Q2{
	String name; 
	int age;
	void drive(String n,int a) {
		name=n;
		age=a;
		
	}
	void get()
	{
		System.out.println("age is "+age+" name is "+name);
	}

}
