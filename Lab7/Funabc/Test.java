package Funabc;

public class Test {
	int a = 1;
	public void funa(){
		int a = 5;
		System.out.println("The local variablea in funa() before: "+a);
		funb();
		func();
		funb();
		func();
		System.out.println("The local variable in funa() end: "+a);
		
	}
	private void funb(){
		int a = 10;
		System.out.println("The local variable in funb() before: "+a);
		a++;
		System.out.println("The local variable a in funb after a++ :"+a);
		
	}
	private void func(){
		System.out.println("The instance variable a in func() before:  "+a);
		a++;
		System.out.println("The instance variable in func() after a++:  "+a);
	}
	public static void main(String[] args){
		Test tt = new Test();
		tt.funa();
		}

}
