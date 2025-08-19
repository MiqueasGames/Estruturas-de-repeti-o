package usersenha;

import java.util.Scanner;

public class usersenha {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Digite seu usuário: ");
		String usuario = en.nextLine();
		
		System.out.println("Digite seu senha: ");
		String senha = en.nextLine();
		
		while (usuario.equals(senha)) {
			
			System.out.println("O nome de usuário não pode ser o mesmo da senha! \n");
			
			System.out.println("Digite seu usuário: ");
			usuario = en.nextLine();
			
			System.out.println("Digite seu senha: ");
			senha = en.nextLine();
			
		}
		
		System.out.println("Usuário e senha registados!");
		
		en.close();
		
	}

}
