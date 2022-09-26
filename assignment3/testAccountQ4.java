package assignment3;

public class testAccountQ4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountQ4 A=new AccountQ4(12345, "Anusha", 5000);
		AccountQ4 A1=new AccountQ4(92345, "isha", 80000);
        A.display();
        A1.display();
        A.checkBalance();
        A1.checkBalance();
        A.credit(846.87);
        A1.credit(654.98);
        A.debit(99999.9);
        A.checkBalance();
	}

}
