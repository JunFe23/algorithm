package mymind;

public class Gugudan {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(i+"단");
			for (int j = 1; j < 10; j++) {
				int z = i * j;
				System.out.println(i+" * "+j+" = "+z);
			}
			System.out.println();
		}
	}
}
