package assignment3;
		
		public class AccountQ4 {
			int acc_no;  
			String name;  
			double amount; 
			AccountQ4(int acc_no,String name,double amount ) {
				this.acc_no=acc_no;
				this.name=name;
				this.amount=amount;
			}

				void credit(double amt){  
					amount=amount+amt;  
					System.out.println(amt+" credited");  
					} 
				void debit(double amt){  
					if(amount<amt){  
					System.out.println("Debit amount exceeded account balance");  
					}
					else
					{  
					amount=amount-amt;  
					System.out.println(amt+" debited");  
					}  
					}
				void checkBalance()
				{
					System.out.println("Balance is: "+amount);
					}  
				  
				void display()
				{
					System.out.println(acc_no+" "+name+" "+amount);
				}  
				
		
		}  
			

