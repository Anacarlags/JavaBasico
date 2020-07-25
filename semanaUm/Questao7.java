package semanaUm;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado:");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("A Area do Quadrado eh :"+area);
		System.out.println("O Dobro da Area do Quadrado eh :"+(area*2));
		

	}

}
