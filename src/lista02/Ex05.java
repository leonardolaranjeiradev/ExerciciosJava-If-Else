package lista02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//5. Escreva um programa Java que capture um número 
		//do usuário e gere um inteiro entre 1 e 7 e exiba o nome do dia da semana
		
		System.out.println("Escreva um número entre 1-7:");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("Domingo");			
		} else if (num == 2) {
			System.out.println("Segunda");
		} else if (num == 3) {
			System.out.println("Terça");			
		} else if (num == 4) {
			System.out.println("Quarta");
		} else if (num == 5) {
			System.out.println("Quinta");				
		} else if (num == 6) {
			System.out.println("Sexta");
		} else if (num == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Número errado, coloque um número entre 1-7");
		}		
		
		sc.close();
		
	}

}
