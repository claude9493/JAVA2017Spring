package exercise1;

import java.util.Scanner;

public class Sales_slip {

	public static void main(String[] args) {
//		int[][] sale_f = {{100, 150, 3000},{350, 200, 1500}};
//		int[][] sale_s = {{1,1,1},{1,1,1}};
		int[][] sale_f = new int[2][3];
		int[][] sale_s = new int[2][3];
		read2(sale_f);
//		display(sale_f);
		read2(sale_s);
		int[] tot_by_saler = new int[2];//by salesman
		int[] tot_by_pro = new int[3];//by product
		
		for(int i = 0; i < 2; i ++){
			for(int j = 0; j < 3; j ++){
//				System.out.printf("%d  %d  %d  ", i+1, j+1, sale_f[i][j]);
				tot_by_saler[i] += sale_f[i][j];
				tot_by_pro[j] += sale_f[i][j];
			}
//			System.out.println();
		}
//		System.out.println();
		for(int i = 0; i < 2; i ++){
			for(int j = 0; j < 3; j ++){
//				System.out.printf("%d  %d  %d  ", i+1, j+1, sale_s[i][j]);
				tot_by_saler[i] += sale_s[i][j];
				tot_by_pro[j] += sale_s[i][j];
			}
//			System.out.println();
		}
		
		display(tot_by_saler);
		display(tot_by_pro);
//		for(int i : tot_by_saler)
//			System.out.print(i+"\t");
//		System.out.println();
//		for(int i : tot_by_pro)
//			System.out.print(i+"\t");
	}

	
	public static void read(int[][] a){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("=====================");
	}
	
	public static void display(int[] a){
		for (int i : a)
			System.out.print(i + "\t");
		System.out.println();
	}
	
	public static void display(int[][] a){
		for(int[] i : a){
			for( int j : i)
				System.out.print(j + " ");
		}
	}
	
	public static void read2(int[][] a){
		Scanner input = new Scanner(System.in);
		for(int[] i : a){
			for(int j = 0; j < i.length; j++){
				i[j] = input.nextInt();
			}
		}
	}
}
