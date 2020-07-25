package semanaUm;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em farenheit:");
		double f = scan.nextDouble();	
		
		double c = (5*(f-32)/9);
		
		System.out.println("A temperatura "  +f+  "F é igual a " +c+ "c");
	
	}

}
