package expoente;

import java.util.Scanner;

public class Expoente {
	public static void main(String[]args){
		Scanner en = new Scanner(System.in);
		
		System.out.println("digite a base: ");
		int base = en.nextInt();
		
		System.out.println("digite o expoente: ");
		int expo = en.nextInt();
		
		int resultado = 1;
		
		for(int i = 0; i < expo; i++) {
			
			resultado *= base ;		
			
		}
		
		System.out.println(base + " elevado a " + expo + " = " + resultado);
		
	}

}
