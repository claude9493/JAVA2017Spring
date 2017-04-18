package exercise2;

public class Change {
	public static double[] change(double[] init){
		double[] updateArray = new double[init.length];
		
		for(int i = 0; i < init.length; i++){
			updateArray[i] = init[i] < 0 ? 0: init[i] > 100 ? 100 : init[i];
		}
		return updateArray;
			
	}

}
