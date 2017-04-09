package exercise4;

public class Account {
	private double balance = 0.0;
	
	public Account(){
		
	}
	
	public Account(double bal){
		balance = bal > 0? bal: 0.0;
	}
	public void debit(double deb){
		if (deb > balance)
			System.out.println("Debit amount exceeded account balance.");
		else{
			balance -= deb;
			System.out.printf("The debit of %.2f is set successfully!", deb);
		}
			
	}
	

}
