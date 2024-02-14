package lista02;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//6. Escreva um programa Java que leia dois números
		//de ponto flutuante e teste se eles são iguais até três casas decimais
		
		System.out.println("Digite 2 números reais:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		n1 = Math.floor(n1 * 1000);	// Coloquei o floor para arredondar para baixo e eliminar a parque fracionada
		n2 = Math.floor(n2 * 1000);
		
		if (n1 == n2) {
			System.out.printf("Os números são iguais: %.3f%n", n1);			
		} else {
			System.out.println("Não são iguais");			
		}		
		
		sc.close();
		

	}

}
