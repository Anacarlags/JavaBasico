package semanadois;

import java.util.Scanner;

public class Quest�o8 {

  @SuppressWarnings({ "resource" })
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 float pre�o_1;
		 float pre�o_2;
		 float pre�o_3;
		 
		 System.out.println("Digite o pre�o do Primeiro Produto ");
		 pre�o_1 = scan.nextFloat();
		 
		 System.out.println("Digite o pre�o do Segundo Produto ");
		 pre�o_2 = scan.nextFloat();
		 
		 System.out.println("Digite o pre�o do Terceiro Produto ");
		 pre�o_3 = scan.nextFloat();

		 
		 if(pre�o_1 < pre�o_2 && pre�o_1 < pre�o_3) {
			 System.out.println("Compre o Primeiro Produto ");
		 }else if(pre�o_2 < pre�o_1 && pre�o_2 < pre�o_3) {
			 System.out.println("Compre o Segundo Produto ");

		 }else if(pre�o_3 < pre�o_1 && pre�o_3 < pre�o_2) {
			 System.out.println("Compre o Terceiro Produto ");
		 }
	}

}
