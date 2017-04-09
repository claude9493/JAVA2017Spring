package exercise2;

public class Give_Me_Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;//Amount of the numbers meet the conditions, which controls the line feed 
		
		for (int i = 1; i <= 100; i++){ // from 1 to 100
			if(i % 7 == 0 || i % 10 == 7){ // check the conditions
				
				if ( counter % 10 == 0 && counter != 0) // whether goto a new line ???
					System.out.println();
				
				System.out.print(i + "\t"); // print the i and a tab
				counter++; 
				
			}
		}
			

	}

}
