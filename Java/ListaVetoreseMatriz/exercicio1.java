package ListaVetoreseMatriz;

import java.util.Scanner;

//1.      Fa�a um programa que c rie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. 
//Encontre ap�s a maior pontua��o e a apresente.

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
		// impress�o
		System.out.println("\n O maior n�mero �: " + maiorPontuacao);

	}
}