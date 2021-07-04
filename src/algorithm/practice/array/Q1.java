package algorithm.practice.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int[] a = new int[x];
		
		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();
			a[i]=y;
		}
		
		
		sc.close();
		Arrays.sort(a);
		System.out.println(a[0]+" "+a[x-1]);
	}
}
