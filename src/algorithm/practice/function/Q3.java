package algorithm.practice.function;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int cnt = 0;
		
		
		
		for (int i = 1; i <= N; i++) {
			int a = i%10; // 1의 자리
			int b = (i/10)%10; // 10의 자리
			int c = (i/100)%10; // 100의 자리
			int d = (i/1000)%10; // 1000의 자리
				
			
			if(i<100) {
				cnt++;
			} else if(i>=100 && i<1000 && ((a-b)==(b-c))) {
				cnt++;
			} 
		}
		
		System.out.println(cnt);
	}
}
