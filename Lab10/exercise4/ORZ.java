package exercise4;
/*
 * 注意： 在 case 1 和 case -1 时，若以 for循环中变量从0递增到ob.length 作为循环计数条件，而for循环中还进行了ob.remove(something)的操作
 * 这样会有逻辑错误，因为 ob 的长度在循环中被改变，而for循环的条件中的ob.length不会随之而变。 
 * 就会看起来正确，但是有错误。
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ORZ {

	public static void main(String[] args) {
//		int是基本类型，Integer是包装类型。。。
		ArrayList<Integer> ob = new ArrayList<Integer>();
		Random rand = new Random();
		int count = 0;
		
		while(true)
		{
			int rand_num = rand.nextInt(21)-10;
			System.out.print("rand_number is: " + rand_num + "\t");
			switch(rand_num){
			case 0: 
				break;
			case 1: 
				for(int i = ob.size()-1; i >= 0; i--){
					if(ob.get(i) > 0)
						ob.remove(i);
				}
				for(int j : ob)
					System.out.print(j + "  ");
				System.out.println();
				break;
			case -1:
				for(int i = ob.size()-1; i >= 0; i--){
					if(ob.get(i) < 0)
						ob.remove(i);
				}
				for(int j : ob)
					System.out.print(j + "  ");
				System.out.println();
				
				break;
			case 10:
				Collections.sort(ob);//ArrayList sort
				for(int j : ob)
					System.out.print(j + " ");
				System.out.println();
				break;
			case -10:
				System.out.println(ob.size());
				break;
			default:
				ob.add(new Integer(rand_num));//ArrayList 中不能用基础类型，要把生成的随机数转化为包装类型
				for(int j : ob)
					System.out.print(j + " ");
				System.out.println();
				break;
			}
			count++;
			if(rand_num == 0)
				break;
		}
		System.out.printf("%d times are needed to break the while loop",count);
		

	}

}
