package exercise5;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> list = new ArrayList<Student>();
	public void add_Student(Student s){
		list.add(s);
	}
	public void modifyGrade(Student s, int grade){
		s.set_grade(grade);
	}
	public void deleteStudent(Student s){
		list.remove(s);
	}
	public void display(Student s){
		if(list.contains(s) != true)
			System.out.println("This student is not in the list!");
		else
			System.out.printf("StudentNo:\t%s\nStudentName:\t%s\nGrade:\t%d\n",s.get_No(),s.get_name(),s.get_grade());
		
	}

}
