package exercise5;

public class Employee {
	private String fname, lname;
	private double salary = 0;
	
	public Employee(String fn, String ln, double sal){
		fname = fn;
		lname = ln;
		salary = sal > 0? sal: 0;
	}
	
	public void set_fname(String fna){
		fname = fna;
	}
	
	public String get_fname(){
		return fname;
	}
	
	public void set_lname(String lna){
		lname = lna;
	}
	
	public String get_lname(){
		return lname;
	}
	
	public void set_salary(double sala){
		salary = sala > 0? sala: 0;
	}
	
	public double get_salary(){
		return salary;
	}
	


}
