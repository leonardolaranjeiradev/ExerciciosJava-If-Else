package lista02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.Escreva um programa Java para obter um número do usuário e imprimir se é positivo ou negativo
		
		System.out.print("Entre com número:");
		int n1 = sc.nextInt();		
		
		if (n1 > 0) {
			System.out.println("Esse número é POSITIVO!");			
		}else if (n1 == 0){
			System.out.println("Esse número é NEUTRO!");
		} else {
			System.out.println("Esse número é NEGATIVO!");
		}
				
		sc.close();		

	}

}
