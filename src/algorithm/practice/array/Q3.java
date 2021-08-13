package algorithm.practice.array;

import java.util.Scanner;

public class Q3 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int sum = x * y * z;
		
		int []a = new int[10];
		
		while(sum!=0) {
			a[sum%10]++;
			sum/=10;
		}
		
		for(int result:a) {
			System.out.println(result);
		}
		
	}

}
