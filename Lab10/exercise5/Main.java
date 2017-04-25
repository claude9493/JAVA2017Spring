package exercise5;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		StudentManager studentManager = new StudentManager();
//		
//		Student student1= new Student();
//		student1.set_No("1");
//		studentManager.add_Student(student1);
		
		while(true)
		{
//			StudentManager studentManager = new StudentManager();
			System.out.println("==============================================");
			System.out.print("Please input an operation code:\t");
			int code = input.nextInt();
			System.out.println();
			switch(code)
			{
			case 1:
				System.out.println("Create a new student:");
				Student student = new Student();
				student.set_No(input.next());
				student.set_name(input.next());
				student.set_grade(input.nextInt());
				studentManager.add_Student(student);
				break;
			case 2:
				System.out.println("Input the student number:\t");
				String num = input.next();
//				int wheather_find = 0;//0:not found;1:successfully found
//				for(Student s : studentManager.list)
//				{
//					if (num == s.get_No())
//					{
//						studentManager.display(s);
//						wheather_find = 1;
//						break;//能否在这个if判断里直接break掉外层的switch？？？
//					}
//				}
//				if(wheather_find == 0)
				if(wheather_find(studentManager, num) != -1)
					studentManager.display(studentManager.list.get(wheather_find(studentManager,num)));
				else
					System.out.println("The student doesn't exist.");
				break;
			case 3:
				System.out.println("Input the student number:\t");
				String No = input.next();
//				int wheatherFind = 0;
//				for(Student s : studentManager.list)
//				{
//					if(No == s.get_No()){
//						studentManager.deleteStudent(s);
//						wheatherFind = 1;
//						break;
//					}
//				}
//				if(wheatherFind == 0)
				if(wheather_find(studentManager, No) != -1)
					studentManager.deleteStudent(studentManager.list.get(wheather_find(studentManager,No)));
				else
					System.out.println("The student doesn't exist.");
				break;
			case 4:
				System.out.println("Input the student number and his new grade:\t");
				String Noo = input.next();
				int grade = input.nextInt();
				if(wheather_find(studentManager, Noo) != -1)
					studentManager.modifyGrade(studentManager.list.get(wheather_find(studentManager,Noo)),grade);
				else
					System.out.println("The student doesn't exist.");
				break;
			case 5:
				System.exit(0);
				break;//这个break是不是有点多余了???
			default:
				System.out.println("Please select a right operation.");
				break;
			}
		}
	}
	
	public static int wheather_find(StudentManager s, String NO){
		for(Student ss : s.list){
			String temNO = ss.get_No();
			if(Integer.parseInt(temNO) == Integer.parseInt(NO))
//				此处，永久的记忆，String是reference型，直接比较没有效果！！！
			{
				return s.list.indexOf(ss);
			}
		}
		return -1;
				
	}
	
}
