package lista02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 7. Escreva um programa Java para encontrar o número de dias em um mês.
		
		System.out.print("Me fale o número de um mês (1-12):");
		int numMes = sc.nextInt();
		
		if (numMes == 1) {
			System.out.println("Mes de Janeiro, possui 31 dias!");			
		} else if (numMes == 2) {
			System.out.print("Me fale o ano:");
			int ano = sc.nextInt();
			if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
				System.out.println("Mes de Fevereiro, em ano Bissexto com 29 dias!"); 
			}
			else {
				System.out.println("Mes de Fevereiro, em ano não Bissexto com 28 dias!");
			}			
		} else if (numMes == 3) {
			System.out.println("Mes de Março, possui 31 dias!");			
		} else if (numMes == 4) {
			System.out.println("Mes de Abril, possui 30 dias!");			
		} else if (numMes == 5) {
			System.out.println("Mes de Maio, possui 31 dias!");
		} else if (numMes == 6) {	
			System.out.println("Mes de Junho, possui 30 dias!");
		} else if (numMes ==7) {
			System.out.println("Mes de Julho, possui 31 dias!");
		} else if (numMes ==8) {		
			System.out.println("Mes de Agosto, possui 31 dias!");
		} else if (numMes ==9) {			
			System.out.println("Mes de Setembro, possui 30 dias!");
		} else if (numMes ==10) {			
			System.out.println("Mes de Outubro, possui 31 dias!");
		} else if (numMes ==11) {			
			System.out.println("Mes de Novembro, possui 30 dias!");
		} else if (numMes ==12) {				
			System.out.println("Mes de Dezembro, possui 31 dias!");
		} 
		
		

		sc.close();
	}

}
