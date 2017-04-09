package exercise5;

public class Narcissistic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		
		do{
			int hundred = i / 100, ten = i / 10 - hundred * 10, unit = i - hundred * 100 - ten * 10;
//			hundred is the largest digit and ten is the middle digit and unit is the third digit
		
			int fake_narc = (int) Math.pow(hundred, 3) + (int)Math.pow(ten, 3) + (int)Math.pow(unit, 3);
//			use (int) to change the type of parameters of the method Math.pow from double to int  
//			int fake_narc = hundred * hundred * hundred + ten * ten * ten + unit * unit * unit;
			if (i == fake_narc)
				System.out.println(i);		
			i++;
			
		}
		while(i < 1000);

	}

}
