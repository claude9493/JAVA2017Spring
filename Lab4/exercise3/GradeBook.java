package exercise3;

public class GradeBook {
	private String instructor;
	private String course;
	
	public GradeBook(String cour, String teac){
		instructor = teac;
		course = cour;
	}
	
	public void instructor_set(String name){
		instructor = name;
	}
	
	public String get_instructor(){
		return instructor;
	}
	
	public void displayMessage(){
		System.out.printf("Welcome!!!\n%s  This course is presented by: %s", course, instructor);
	}

}
