package semanatres;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
	 int nota = 0;
	 
	 
	 @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	 
	 do{
		 System.out.println("Digite um valor entre 0 e 10:" );
		 nota = scan.nextInt();	
	 }while(nota < 0 || nota > 10);
		 
	 

	 

	}

}
