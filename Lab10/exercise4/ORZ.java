package exercise4;
/*
 * ע�⣺ �� case 1 �� case -1 ʱ������ forѭ���б�����0������ob.length ��Ϊѭ��������������forѭ���л�������ob.remove(something)�Ĳ���
 * ���������߼�������Ϊ ob �ĳ�����ѭ���б��ı䣬��forѭ���������е�ob.length������֮���䡣 
 * �ͻῴ������ȷ�������д���
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ORZ {

	public static void main(String[] args) {
//		int�ǻ������ͣ�Integer�ǰ�װ���͡�����
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
				ob.add(new Integer(rand_num));//ArrayList �в����û������ͣ�Ҫ�����ɵ������ת��Ϊ��װ����
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
