package semanatres;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		 Scanner scan = new Scanner(System.in);
		
	
		Object senha;
		Object nome ;
		do{
			System.out.println("Digite seu nome de usuario");
			nome = scan.next();
		    System.out.println("Digite sua senha ");
		    senha = scan.next();
		}while(senha != nome);
		
		
	}

}
