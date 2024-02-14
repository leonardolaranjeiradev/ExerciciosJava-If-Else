package lista02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**2. Escreva um programa Java para resolver equações quadráticas (use if, else if e else). Ir para o editor
			Dados de teste
			Entrada a: 1
			Entrada b: 5
			Entrada c: 1
			Saída Esperada:
			As raízes são -0,20871215252208009 e -4,7912878474779195
		**/
		
		System.out.print("A:");
		int a = sc.nextInt();
		System.out.print("B:");
		int b = sc.nextInt();
		System.out.print("C:");
		int c = sc.nextInt();
		
		double resultado = b * b - 4.0 * a * c;
		
		if (resultado > 0.0) {
			double resultado1 = (-b + Math.pow(resultado, 0.5)) / (2.0 * a);
			double resultado2 = (-b - Math.pow(resultado, 0.5)) / (2.0 * a);
			System.out.println("As raizes são: " + resultado1 + " e " + resultado2);			
		} else if (resultado == 0){
			double resultado3 = -b / (2.0 * a);
			System.out.println("A raiz é: " + resultado3);			
		} else {
			System.out.println("As equações das raizes não são reais");
		}		
		
		
		sc.close();
		

		
	}

}
