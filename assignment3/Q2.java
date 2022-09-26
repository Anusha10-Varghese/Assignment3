package assignment3;

public class Q2 {
	String model;
	float price;
	void start(String m,float p) {
		model=m;
		price=p;
		System.out.println("start...");
		
	}
	void stop() {
		System.out.println("stop...");
	}
	void move() {
		System.out.println("move...");
	}
	void display()
	{
		System.out.println("Model is "+model+" Price is "+price);
	}
}
