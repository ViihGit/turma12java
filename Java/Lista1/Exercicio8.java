package Lista1;

import java.util.Scanner;

/*
 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica
 *  com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
 */
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// variaveis
		int custoFabrica, distribuidor = 28, imposto = 45, consumidor;

		// entradas
		System.out.println("Qual o valor do carro novo: ");
		custoFabrica = read.nextInt();

		// processamento
		custoFabrica = custoFabrica + (distribuidor * 100 / distribuidor);
		imposto = custoFabrica + (imposto * 100 / imposto);
		consumidor = custoFabrica + imposto + distribuidor;
		// impress�o

		System.out.println("O valor total do consmidor �: " + consumidor);

	}

}
