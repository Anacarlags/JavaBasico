package semanadois;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite um numero");
		int num1 = scan.nextInt();
		
		
		
		if(num1>=0) {
			System.out.println(" O numero é positivo");

		}else {
			System.out.println("O numero é negativo");

		}
		
		}

	}


