package semanaUm;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.print("A media eh " +media);
		
		
	}
	
}
