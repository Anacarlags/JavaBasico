package semanadois;

import java.util.Scanner;

public class Quest�o5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media>=7) {
			System.out.println("APROVADO");
		}else if(media == 10) {
			System.out.println("APROVADO COM DISTIN��O");
		}else {
			System.out.println("Repovado");
		}
		
		


	}

}
