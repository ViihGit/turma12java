package Lista1;

import java.util.Scanner;

//Exercicio7 - Lista 1
//Escreva um sistema que lê os coeficientes  e calcula e mostra os valores de x e y. 
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		// variaveis

		double a, b, c, d, e, f, x, y;

		// entradas

		System.out.println("Entre com o valor de A: ");
		a = read.nextDouble();
		System.out.println("Entre com o valor de B: ");
		b = read.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c = read.nextDouble();
		System.out.println("Entre com o valor de D: ");
		d = read.nextDouble();
		System.out.println("Entre com o valor de E: ");
		e = read.nextDouble();
		System.out.println("Entre com o valor de F: ");
		f = read.nextDouble();

		// processamento

		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);

		// impressões

		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: " + y);

	}

}
