package IO_Test;

import java.util.Formatter;
import java.util.Scanner;

public class CreateTextFile {

	public static void main(String[] args) throws Exception{
		Formatter output = new Formatter("client.txt");
		Scanner input = new Scanner(System.in);
		
		int accountNumber;
		String firstName, lastName;
		double balance;
		
		System.out.printf("%s\n%s\n%s\n\n", 
				"To terminate input, type the endoffile indicator",
				"When you are prompted to enter input",
				"On windows type <ctrl> z then press Enter");
		System.out.printf("%s\n%s", "Enter account nuber (>0), first name, last name and balance","?");
		while(input.hasNext()){
			
			accountNumber = input.nextInt();
			firstName = input.next();
			lastName = input.next();
			balance = input.nextDouble();
			if(accountNumber > 0)
			{
				output.format("%d %s %s %.2f\r\n",accountNumber, firstName, lastName, balance );
			}
			else{
				System.out.println("Account number must be greater than zero!");
			}
			System.out.printf("%s\n%s", "Enter account nuber (>0), first name, last name and balance","?");
		}
		output.close();
	}

}
