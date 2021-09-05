package algorithm.practice.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		// #1
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			h.add(sc.nextInt() % 42);
		}
		
		sc.close();
		System.out.println(h.size());
		
		
	}
}
