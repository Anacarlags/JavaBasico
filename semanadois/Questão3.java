package semanadois;

import java.util.Scanner;

public class Questão3 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite uma letra:(F ou M)");
	String input = scan.next();
	
	if(input.equalsIgnoreCase("f") ) {
		System.out.println("F- Feminino");
	}else if(input.equalsIgnoreCase("M")) {
		System.out.println("M-Masculino");
	}else {
		System.out.println("sexo invalido");
	}
	
	
	
}
}
