programa
{
	inclua biblioteca Util		
		//objetivo: Obtenha um numero digitado pelo usuário e repita a operação de multiplicar ele por três 
		//(imprimindo o novo valor) até que ele seja maior do que 100. Ex: se o usuário digita 5, deveremos observar na tela
		// a seguinte sequência 5,15,45,135
	
	funcao inicio()
	{	//variaveis
		inteiro num=0, res=0
		escreva("Digite um número na tela:")
		leia(num)

		//entradas
		enquanto (num>0)
		{
			res=res*num
			num=num*3
			se (num>500)
			pare 
				
				escreva("\nO valor do numero escolhido multiplicado por 3 é: ", num)
			
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */