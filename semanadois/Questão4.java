package semanadois;

import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = scan.next();
		
		
		if(letra.length()>1) {
			System.out.println("não é uma letra valida");
		}else {
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":	
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":	
		case "U":System.out.println("é vogal");	break;
		default: System.out.println("não é vogal");	
		}
		}
	}

}
