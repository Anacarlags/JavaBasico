package semanadois;

import java.util.Scanner;

public class Questão7 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro numero: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o Segundo numero: ");
		num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = scan.nextInt();
		
		if(num1>num2&&num1>num3) {
		   System.out.println("O numero 1 é o maior: " +num1);
	    }else if(num2>num1&&num2>num3) {
		  System.out.println("O numero 2 é o maior: " +num2);
	 	
	    }else if(num3>num1&&num3>num2) {
		  System.out.println("O numero 3 é o maior: " +num3);
			
	   }
		
		if(num1<num2&&num1<num3) {
			System.out.println("O numero 1 é o menor: " +num1);
		}else if(num2<num1&&num2<num3) {
			System.out.println("O numero 2 é o menor: " +num2);
		}else if(num3<num1&&num3<num2) {
			System.out.println("O numero 3 é o menor: " +num3);
		}
		
		
		
		
		
 }
}
