package semanaUm;

import java.util.Scanner;

public class Questão6 {
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Digite o valor do raio:");
		 double raio = scan.nextDouble();
		 
		 double area = Math.PI * Math.pow(raio, 2);
		 
		 System.out.print("A area do circulo eh :" +area);
		 
		
	}

}
