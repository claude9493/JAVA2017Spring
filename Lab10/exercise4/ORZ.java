package exercise4;

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
			
			switch(rand_num){
			case 0: 
				break;
			case 1: 
				for(int i = 0; i < ob.size();i++){
					if(ob.get(i) > 0)
						ob.remove(i);
				}
				for(int j : ob)
					System.out.print(j + "  ");
				System.out.println();
				break;
			case -1:
				for(int i = 0; i < ob.size(); i++){
					if(ob.get(i) < 0)
						ob.remove(i);
				}
				for(int j : ob)
					System.out.print(j + "  ");
				System.out.println();
				
				break;
			case 10:
				Collections.sort(ob);
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
			if(rand_num == 0 || rand_num == 1 || rand_num == -1 || rand_num == 10 || rand_num == -10)
				break;
		}
		System.out.printf("%d times are needed to break the while loop",count);
		

	}

}
