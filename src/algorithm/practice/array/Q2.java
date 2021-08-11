package algorithm.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int x;
		int []a = new int[9];
		int []b = new int[9];
		for (int i = 0; i < a.length; i++) {
			x = sc.nextInt();
			a[i]=x;
			b[i]=x;
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp;
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		
		int z=0;
		for (int i = 0; i < b.length; i++) {
			if(a[0]==b[i]) {
				z=i+1;
			}
		}
		
		System.out.println(a[0]);
		System.out.println(z);
	}
}
