package assignment3;

public class TestQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 d1=new Q2();
		Q2 d2=new Q2();
		DriverQ2 dr=new DriverQ2();
		d1.start("VW Golf IV", 23195);
		d2.start("Mercedes W124", 0);
		d1.stop();
		d1.move();
		d1.display();
		d2.stop();
		d2.move();
		d2.display();
		dr.drive("Ramu", 32);
		dr.get();
		
		
	}

}
