	package semanadois;
	
	import java.util.Scanner;
	
	public class Quest�o1 {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	System.out.println("digite o primeiro numero");
	int num1 = scan.nextInt();
	
	System.out.println("digite o segundo numero");
	int num2 = scan.nextInt();
	
	if(num1>num2) {
		System.out.println(" O primeiro numero � maior");

	}else {
		System.out.println("O segundo numero � maior");

	}
	
	}
	}
