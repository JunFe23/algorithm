package algorithm.practice.charQ;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String numbers = in.nextLine();
		
		int time = 0;
		
		for (int i = 0; i < numbers.length(); i++) {
			switch (numbers.charAt(i)) {
			case 'A','B','C': time+=3;
			break;
			
			case 'D','E','F': time+=4;
			break;
			
			case 'G','H','I': time+=5;
			break;
			
			case 'J','K','L': time+=6;
			break;
			
			case 'M','N','O': time+=7;
			break;
			
			case 'P','Q','R','S': time+=8;
			break;
			
			case 'T','U','V': time+=9;
			break;
			
			case 'W','X','Y','Z': time+=10;
			break;
			}
		}
		System.out.println(time);
	}
}
