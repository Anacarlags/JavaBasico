package semanaUm;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celcius:");
		double c = scan.nextDouble();	
		
		double f = (c*1.8)+32;
		
		System.out.println("A temperatura "  +c+  "C é igual a " +f+ "f");
	
	}

}
