package semanadois;

import java.util.Scanner;

public class Questão8 {

  @SuppressWarnings({ "resource" })
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 float preço_1;
		 float preço_2;
		 float preço_3;
		 
		 System.out.println("Digite o preço do Primeiro Produto ");
		 preço_1 = scan.nextFloat();
		 
		 System.out.println("Digite o preço do Segundo Produto ");
		 preço_2 = scan.nextFloat();
		 
		 System.out.println("Digite o preço do Terceiro Produto ");
		 preço_3 = scan.nextFloat();

		 
		 if(preço_1 < preço_2 && preço_1 < preço_3) {
			 System.out.println("Compre o Primeiro Produto ");
		 }else if(preço_2 < preço_1 && preço_2 < preço_3) {
			 System.out.println("Compre o Segundo Produto ");

		 }else if(preço_3 < preço_1 && preço_3 < preço_2) {
			 System.out.println("Compre o Terceiro Produto ");
		 }
	}

}
