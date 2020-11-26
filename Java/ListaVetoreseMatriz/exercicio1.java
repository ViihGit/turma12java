package ListaVetoreseMatriz;

import java.util.Scanner;

//1.      Faça um programa que c rie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
//Encontre após a maior pontuação e a apresente.

public class exercicio1 {

	public static void main(String[] args) {
		// variaveis
		Scanner leia = new Scanner(System.in);
		int pontuacao[] = new int[5];
		int maiorPontuacao = 0;
		String usuario;

		for (int x = 0; x < 5; x++) 
		{

			System.out.print("\n" + "Entre com o valor " + (x + 1) + ":");
			pontuacao[x] = leia.nextInt();
			if (pontuacao[x] > maiorPontuacao) 
			{
				maiorPontuacao = pontuacao[x];
			}
		}
		// impressão
		System.out.println("\n O maior número é: " + maiorPontuacao);

	}
}