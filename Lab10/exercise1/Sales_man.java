package exercise1;

import java.util.Scanner;

public class Sales_man {
	
	static int[][][] sale = new int[2][2][3];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		display();
		
		do{
			int da = input.nextInt();
			int sa = input.nextInt();
			int pro = input.nextInt();
			int val = input.nextInt();
			if(da == 0)
				break;
			read_slip(da ,sa, pro, val);
		}while(true);
		input.close();
		
		display();

	}
	
	public static void read_slip(int day,int saler_num, int product_num, int value){
		sale[day][saler_num - 1][product_num - 1] = value;
	}
	
	public static void display(){
		System.out.println("saler\tproduct\tvalue");
		for(int d = 0; d < 2; d++){
		for (int i = 0; i < sale[d].length; i++){
			for (int j = 0; j < sale[d][i].length; j++){
				System.out.println(i + 1 + "\t" + (j + 1) + "\t" + sale[d][i][j]);
			}
			System.out.println();
		}
		}
	}

}
