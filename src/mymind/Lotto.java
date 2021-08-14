package mymind;

public class Lotto {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			
			for (int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("이번주 철또 추천번호 : ");
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
