package ListaLaçodeRepetição;
/* 3)Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o total de valores lidos.
 * 	 O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
 * 	Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 */

import java.util.Scanner;

public class revisaoEnquanto2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int a = 0, b = 0, c = 0, soma = 0;

		while (a >= 0) {
			System.out.println("Insira um valor: ");
			a = read.nextInt();

			if (a >= 0) {
				soma = soma + a;
				c++;
			}
		}
		System.out.println("Fim de programa!\n");
		b = soma / c;

		System.out.printf("O programa foi executado %d vezes, a soma total é de %d e a média é de %d", c, soma, b);

	}

}
