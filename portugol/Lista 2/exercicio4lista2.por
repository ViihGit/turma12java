programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
		inteiro numero
		escreva("Digite um numero [+/-]: ")                                    
		leia(numero)
		//processamentos
		se (numero <0)
			{
		escreva("\nO Numero digitado é negativo")
			}
		senao se  (numero > 0){
			se ((numero % 2)==0){
			escreva ("\nNumero digitado é positivo e par!")
			}
		 	senao {
			escreva("\nNumero positivo e impar")
			}
			
			}
			senao se (numero ==0)
			{
			escreva("\nVocê digitou um numero neutro")
			}
		

			
		
					
				
			
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 570; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */