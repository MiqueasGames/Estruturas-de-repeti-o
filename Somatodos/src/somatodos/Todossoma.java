package somatodos;

import java.util.Scanner;

public class Todossoma {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("digite um número: ");
		int num1 = en.nextInt();
		
		System.out.println("digite o intervalo:");
		int num2 = en.nextInt();
		
		int soma = 0;
		
		for(int i = 0 ; num1 < num2 ; num1++){
			
				soma = num1 + soma;
			
			System.out.println("intervalo: " + soma);
			
			
		}
		
		en.close();
		
	}

}