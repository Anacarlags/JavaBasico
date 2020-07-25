package semanatres;

import java.util.Scanner;
public class Questão3 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		float salario;
	    
	
			System.out.println("Digte seu nome: ");
			nome = scan.next();
	
			
		while( nome.length() < 3 ) {

			System.out.println("Digte seu nome completo: ");	
			nome = scan.next();
	  }
		
		do {
			System.out.println("Digte seu sua idade: ");
			 idade = scan.nextInt();
		}while(idade > 0 && idade < 150);
}
}
