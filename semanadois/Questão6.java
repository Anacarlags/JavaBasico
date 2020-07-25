package semanadois;

import java.util.Scanner;

public class Questão6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero:");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero:");
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("o primeiro numero é o maior");
		}else if(num2>num1 && num2>num3) {
			System.out.println("o segundo numero é o maior");
		}else if(num3>num1 && num3>num2) {
			System.out.println("o terceiro numero é o maior");
		}
		
	}

}
