package semanadois;

import java.util.Scanner;

public class Questão10 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String turno;
        
		System.out.println("Digite o turno que você Estuda(M-manhã T-tarde)");
		turno = scan.next();
		
		switch(turno) {
		case "M":
			System.out.println("Manhã");
			break;
		case "m":
			System.out.println("Manhã");
			break;
		case "T":
			System.out.println("Tarde");
			break;	
		case "t":
			System.out.println("Tarde");
			break;	
		default:
			System.out.println("turno invalido");
			break;
		}
		
	}

}
