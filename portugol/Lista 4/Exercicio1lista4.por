programa
{
	
	funcao inicio()
	{
		// Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
		//Encontre após a maior pontuação e a apresente
		inteiro maiorPont=0,numeros [5]
		para (inteiro x=0; x<5; x++)
		{
			escreva("Entre com o ", (x+1) , "° valor: ": )
			leia(numeros[x])

				se(numeros[x] >maiorPont) {
					maiorPont=numeros[x]
				}
			
		}
			
		escreva("\n O maior número é: " +maiorPont)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 472; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */