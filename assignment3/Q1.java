package assignment3;

public class Q1 {
	int age;
	String breed,colour;
	void bark(int a,String b,String c)
	{
		age=a;
		breed=b;
		colour=c;
	}
	void sleep()
	{
		System.out.println("age="+age+" breed="+breed+" colour="+colour);
	}
}
