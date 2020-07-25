package semanadois;

import java.util.Scanner;

public class Questão9 {

	
	 	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//não funciona corretamente
		int n_1;
		int n_2;
		int n_3;
		
		System.out.println("Digite o primeiro numero");
		n_1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		n_2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero");
		n_3 = scan.nextInt();
		
		if(n_1 <= n_2 && n_1 <= n_3 && n_3 <= n_2) {
			System.out.println(n_3+"-"+n_1+"-"+n_2);
			
		}else if(n_2 <= n_1 && n_2 <= n_3 && n_1 <= n_3) {
			System.out.println(n_1+"-"+n_3+"-"+n_2);
			
		}else if(n_3 <= n_1 && n_3 <= n_2 && n_2 <= n_1) {
			System.out.println(n_1+"-"+n_2+"-"+n_3 );
		}
		
		
	}

}
