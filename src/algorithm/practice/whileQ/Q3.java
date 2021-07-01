package algorithm.practice.whileQ;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = 0;
		int z = x;
		int count = 0;
		
//		if(x==0) {
//			count = 1;
//		}else {
//			while(x!=y) {
//				y = (z%10)*10+(z/10+z%10)%10;
//				//System.out.println("계산값 = " + y);
//				z=y;
//				count++;
//				//System.out.println("count = " + count);
//			}
//		}
//		System.out.println(count);
		
		do {
			y = (z%10)*10+(z/10+z%10)%10;
			z=y;
			count++;
		} while (x!=y);
		System.out.println(count);
	}
}
