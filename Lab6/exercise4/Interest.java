package exercise4;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
		double principal = 1000.0;
//		double rate = 0.05;
		
//		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		
		for (double rate = 0.05; rate <= 0.1; rate += 0.01){
			System.out.printf("  When the rate is %.0f%%\n", rate * 100);
			//use %% to print a single %
			System.out.printf("%s%20s\n", "Year", "Amount on deposit");
			//%s is a place holder of a String type variable, and %20s means place 20 spaces before that string 
			
			for (int year = 1; year <= 10; year++){
				amount = principal * Math.pow(1.0 + rate , year);
				System.out.printf("%4d%20.2f\n", year, amount);
			}
			
			System.out.println("========================================");
			
		}

	}

}
