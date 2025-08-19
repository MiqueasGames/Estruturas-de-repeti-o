package validar;

import java.util.Scanner;

public class Validar {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = en.nextLine();
		
		while (nome.length() <= 3) {
				System.out.println("O nome precisa ter mais de 3 caracteres: ");
				
				System.out.println("Digite seu nome: ");
				nome = en.nextLine();
			}
		en.nextLine();	
		
		System.out.println("Idade: ");
		int idade = en.nextInt();
		
		while(idade < 0 || idade > 150) {
			System.out.println("idade invalida!");
			
			System.out.println("Idade: ");
			idade = en.nextInt();
			}
		en.nextLine();
		
		System.out.println("Salário: ");
		int salario = en.nextInt();
		
		while (salario <= 0) {
			System.out.println("O salário não pode ser menor que 0! ");
			
			System.out.println("Salário: ");
			salario = en.nextInt();
			}
		en.nextLine();
		
		System.out.println("Sexo (m) ou (f):");
		char sexo = en.nextLine().charAt(0);
		
		while(sexo != 'm' && sexo != 'f') {
			System.out.println("Sexo só pode ser (m) ou (f)");
			
			System.out.println("Sexo (m) ou (f):");
			sexo = en.nextLine().charAt(0);			
			}
		
		System.out.println("Estado civil: (s), (c), (v), (d)");
		char ecivil = en.nextLine().charAt(0);
		
		while(ecivil != 's' && ecivil != 'c' && ecivil != 'v' && ecivil != 'd') {
			System.out.println("Estado civil inválido! ");
			
			System.out.println("Estado civil: (s), (c), (v), (d)");
			ecivil = en.nextLine().charAt(0);
			}
		
		en.close();
		
		
	}

}
