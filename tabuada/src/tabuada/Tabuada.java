package tabuada;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Qual tabuada você deseja criar? ");
		int tab = en.nextInt();
		
		System.out.println("De: ");
		int inter1 = en.nextInt();
		
		System.out.println("Até: ");
		int inter2 = en.nextInt();
		
		for(int i = 0; inter1 <= inter2; inter1++) {
			
			int result = (tab * inter1);
			System.out.println(+ tab + "x" + inter1 + "=" + result );
			
			
		}
		
		en.close();
	}

}
