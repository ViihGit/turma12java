programa
{
	
	funcao inicio()
	{
		//declaro as variaveis
		real a,b,c,d,ex,f,x,y
		//entradas 
		escreva("Valor de a: ")
		leia(a)
		escreva("Valor de b: ")
		leia(b)
		escreva("Valor de c: ")
		leia(c)
		escreva("Valor de d: ")
		leia(d)
		escreva("Valor de e: ")
		leia(ex)
		escreva("Valor de f: ")
		leia(f)
		//processamento 
		x= ((c*ex)-(b*f)) / ((a*ex)-(b*d))
		y= ((a*f)-(c*d))/((a*ex)-(b*d))

		escreva("RESULTADOS:\n")
		escreva("Valor de X: ",x)
		escreva("\nValor de Y: ", y)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */