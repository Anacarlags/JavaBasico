package semanadois;

import java.util.Scanner;

public class Quest�o10 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String turno;
        
		System.out.println("Digite o turno que voc� Estuda(M-manh� T-tarde)");
		turno = scan.next();
		
		switch(turno) {
		case "M":
			System.out.println("Manh�");
			break;
		case "m":
			System.out.println("Manh�");
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
