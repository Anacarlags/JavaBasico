package semanaUm;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[ ] args) {
		
	 @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
		
	 System.out.println("Digite a quantidade de metros:");
	 double metros = scan.nextDouble();
	 
	 double cm = metros*100;
	 
	 System.out.println("O valor em centimetros eh:" +cm);
	 
		
	}
	

}
