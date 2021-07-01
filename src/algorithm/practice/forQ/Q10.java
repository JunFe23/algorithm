package algorithm.practice.forQ;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int arr[] = new int[x]; 
		
		for (int i = 0; i < x; i++) {
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		
		for (int i = 0; i < x; i++) {
			if(arr[i]< y) System.out.print(arr[i]+" ");
		}
	}
}
