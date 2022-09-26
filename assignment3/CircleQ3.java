package assignment3;

public class CircleQ3 {
	private double radius;
	private String color;
	
    CircleQ3() {	
		radius=1.0;
		color="red";
	}
    CircleQ3(double radius){
    	this.radius=radius;
    }
	double getradius() {
		return radius;	
	}
	double getArea() {
		return 3.14*radius*radius;	
	}
	public static void main(String[] args) {
		CircleQ3 c1=new CircleQ3();
		System.out.println("Area: "+c1.getArea());
		System.out.println("radius: "+c1.radius+" " +"Colour:" +c1.color);
	}

}
