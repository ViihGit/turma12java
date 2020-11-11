package ListaLaçodeRepetição;
//6- Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 

//Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

import java.util.Scanner;

public class revisaoFaçaEnquanto6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		// variaveis
		int valorUsuario = 0, contador = 0, totalSoma = 0;

		System.out.println("Digite um valor inteiro positivo: ");
		valorUsuario = read.nextInt();
		// processamento
		do {

			contador++;
			totalSoma = totalSoma + contador;

			System.out.printf("%d\n", contador);

		} while ((contador < valorUsuario));

		System.out.print("= " + totalSoma);

	}

}
