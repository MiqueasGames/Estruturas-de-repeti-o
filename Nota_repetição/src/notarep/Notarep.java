package notarep;

import java.util.Scanner;

public class Notarep {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.print("Digite uma nota: ");
		int nota = en.nextInt();
		
		while (nota > 10) {
			System.out.println("A nota precisa ser menor que 10! ");
			
			System.out.print("Digite uma nota: \n");
			nota = en.nextInt();
			
		}
		
		System.out.print("Nota registrada");
		
		en.close();
	}
	
	

}
