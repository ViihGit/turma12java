package ListaLa�odeRepeti��o;
//6- Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros  de 1 at� ele. 

//Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

import java.util.Scanner;

public class revisaoFa�aEnquanto6 {

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
