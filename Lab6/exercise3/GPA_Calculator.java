package exercise3;

public class GPA_Calculator {

	public static void main(String[] args) {
		// TODO: to convert the grade and GPA
		GPA(100);//Test
		GPA(70);//Test
		}
	
	public static void GPA(int grades){
		switch (grades / 10){ //Get the first digit of the grade
		case 10: // the first digit is 10 (i.e. the grade is 100)
			System.out.println("4.0");
			break; //break is used to jump out the rest judges 
		case 9:
			System.out.println("4.0");
			break;
		case 8:
			System.out.println("3.0");
			break;
		case 7:
			System.out.println("2.0");
			break;
		case 6:
			System.out.println("1.0");
			break;
		default:
			System.out.println("0");
		}
		
	}
	

}
