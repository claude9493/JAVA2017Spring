package exercise5;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Sam = new Employee("Sam", "Zhang", 5000);
		Employee Alex = new Employee("Alex", "Li", 6000);
		
		System.out.printf("The yearly salary of Sam is %.2f.\n", Sam.get_salary() * 12);
		System.out.printf("The yearly salary of Alex is %.2f.\n", Alex.get_salary() * 12);
		
		System.out.println("Because of their hard working, boss raises their salary by 10 percents.");
		
		Sam.set_salary(Sam.get_salary() * 1.1);
		Alex.set_salary(Alex.get_salary() * 1.1);
		System.out.printf("The new yearly salary of Sam is %.2f.\n", Sam.get_salary() * 12);
		System.out.printf("The new yearly salary of Alex if %.2f.\n", Alex.get_salary() * 12);
		

	}

}
