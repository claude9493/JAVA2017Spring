package exercise1;

public class Sales_slip {

	public static void main(String[] args) {
		int[][] sale_f = {{100, 150, 3000},{350, 200, 1500}};
		int[][] sale_s = {{1,1,1},{1,1,1}};
		int[] tot_by_saler = new int[2];
		int[] tot_by_pro = new int[3];
		for(int i = 0; i < 2; i ++){
			for(int j = 0; j < 3; j ++){
				System.out.printf("%d  %d  %d  ", i+1, j+1, sale_f[i][j]);
				tot_by_saler[i] += sale_f[i][j];
				tot_by_pro[j] += sale_f[i][j];
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < 2; i ++){
			for(int j = 0; j < 3; j ++){
				System.out.printf("%d  %d  %d  ", i+1, j+1, sale_s[i][j]);
				tot_by_saler[i] += sale_s[i][j];
				tot_by_pro[j] += sale_s[i][j];
			}
			System.out.println();
		}
		for(int i : tot_by_saler)
			System.out.print(i+"\t");
		System.out.println();
		for(int i : tot_by_pro)
			System.out.print(i+"\t");
		
		
		
		

	}

}
