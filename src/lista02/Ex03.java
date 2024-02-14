package lista02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3. Pegue três números do usuário e imprima o maior número.
		
		System.out.print("Entre com o primeiro número:");
		int a = sc.nextInt();
		System.out.print("Entre com o segundo número:");
		int b = sc.nextInt();
		System.out.print("Entre com o terceiro número:");
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("O maior dos três números é:" + a);			
		} else if (b > a && b > c) {
			System.out.println("O maior dos três números é:" + b);
		} else {
			System.out.println("O maior dos três números é:" + c);
		}		
		
		sc.close();
		
	}

}
