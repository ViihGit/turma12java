programa
{
	inclua biblioteca Matematica -->mat 
	
	
	funcao inicio()
	{
		//variaveis
		real p,m,ex
		//entrada
		escreva ("\nPeso do tomate:")
		leia(p)
		limpa()

		//processamento
		se (p>50.0)
		{
			ex= p*4.00
			m= mat.arredondar ((ex-200.0),2)
			escreva ("\n Devido ao excesso de peso o valor da multa a pagar será:" +m)
		}
		senao
		{
			p=0
			m=0
			ex=0
		}
		//saida
		}
		escreva  ( "p "p+p", E "ex+", M: "+m)
		{
		
		
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */