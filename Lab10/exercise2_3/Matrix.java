package exercise2_3;

//import java.util.Array;
public class Matrix {
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		int row = a.length;
		int column = a[0].length;
		double[][] c = new double[row][column];
//	+++++++++++++++++++++Unused contents++++++++++++++++++
/*	if(a.length != b.length)
		return c;
	else{
		for(dint i = 0; i < row; i++)
		{
			if(a[i].length != column || b[i].length != column)
				return c;
		}
	}
*/
//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++
		if(checkMatrix(a) || checkMatrix(b) || a.length != b.length || b[0].length != column)
		{
			return c;
		}
		for (int i = 0; i < row; i ++){
			for(int j = 0; j < column; j++)
				c[i][j] = a[i][j] + b[i][j];
		}
		return c; 
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		
		double[][] c = new double[a.length][b[0].length];//make matrix c
//		check the conditions
//		make sure array a and b are matrices, and,  a and b can be multiplied
		if(checkMatrix(a) || checkMatrix(b) || a[0].length != b.length)
			return c;
		
		for (int i = 0; i < a.length; i++)//each rows of a
		{
			for(int j = 0; j < b[0].length; j++)//each columns of b
			{
				int ele = 0;
				for(int k = 0; k < b.length; k++)//each rows of b
					ele += a[i][k] * b[k][j];
				c[i][j] = ele;
			}
		}
		return c;
	}
	
	
//	A method checking whether an array is a matrix
//	principle: make sure every rows have same number elements
	public static boolean checkMatrix(double[][] a){
		int column = a[0].length;
		for(double[] i : a)
			if(i.length != column)
			{
				return true;
			}
		return false;
	}
	
//	A method displaying a matrix
	public static void display(double[][] a){
		for(double[] i : a)
		{
			for(double j : i){
				System.out.printf("%-5.1f ",j);
			}
//			i.toString();
		System.out.println();
		}
//		a.deepToString();
		System.out.println();
	}
	

}
