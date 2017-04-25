package exercise2_3;

public class MatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] a = {{1,2},{3,4}}, b = {{1,2},{3,4}};
//		Matrix.display(a);
		Matrix.display(Matrix.addMatrix(a,b));
		Matrix.display(Matrix.multiplyMatrix(a, b));
		double[][] c = {{1,1,1},{2,2,2}}, d = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		Matrix.display(Matrix.multiplyMatrix(c, d));
		

	}

}
