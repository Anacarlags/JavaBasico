package semanaUm;

import java.util.Scanner;

public class quest�o8 {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o valor da sua hora:");
	double valorHora = scan.nextDouble();
	
	System.out.println("Digite as horas trabalhados no m�s:");
	double quantHoras = scan.nextDouble();
	
	double salario = valorHora * quantHoras;
	
	System.out.println("Seu salario eh :" +salario);
	
	}

}
