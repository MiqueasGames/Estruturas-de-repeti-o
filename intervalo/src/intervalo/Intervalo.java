package intervalo;

import java.util.Scanner;

public class Intervalo {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("digite um número");
		int num1 = en.nextInt();
		
		System.out.println("digite outro número");
		int num2 = en.nextInt();
		
		for(int i = 0 ; num1 < num2 ; num1++){
			
			int intervalo = num1 + 1;
			
			System.out.println("intervalo: " + intervalo);
			
			
		}
		
		en.close();
		
	}

}
