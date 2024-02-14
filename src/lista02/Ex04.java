package lista02;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*4. Escreva um programa Java que leia um número de ponto flutuante e 
		imprima "zero" se o número for zero. Caso contrário, imprima "positivo" 
		ou "negativo". Adicione "pequeno" se o valor absoluto do número for menor que 1 ou "grande" se exceder 1.000.000 */
		
		System.out.print("Escreva um número Real:");
		double n1 = sc.nextDouble();
		
		if (n1 == 0) {
			System.out.println("ZERO");
		} else if (n1 > 0) {
			System.out.println("Positivo");			
		} else {
			System.out.println("Negativo");
		} 
		if (Math.abs(n1) < 1) {
			System.out.println("pequeno");			
		} else if (Math.abs(n1) > 1000000) {
			System.out.println("grande");
		}		
		
		sc.close();
		

	}

}
