package ListaLa�odeRepeti��o;
/* 3)Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no final o total do somat�rio, a m�dia e o total de valores lidos.
 * 	 O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores positivos. 
 * 	Ou seja, o programa deve parar quando o usu�rio fornecer um valor negativo.
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

		System.out.printf("O programa foi executado %d vezes, a soma total � de %d e a m�dia � de %d", c, soma, b);

	}

}
