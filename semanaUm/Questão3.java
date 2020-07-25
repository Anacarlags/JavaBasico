package semanaUm;

import java.util.Scanner;

public class Questão3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o primeiro segundo numero:");
		int num2 = scan.nextInt();
		
		int resultado = num1+num2;
		System.out.println("A soma eh " +resultado);
		
	
            
	}


}
