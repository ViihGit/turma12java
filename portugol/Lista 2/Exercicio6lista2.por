programa
{
	
	funcao inicio()
	{
		//Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		caracter nome
		inteiro idade
		escreva ("Entre com seu nome: ")
		leia(nome)
		escreva ("Entre com a sua idade: ")
		leia(idade)
		se (idade <=4)
		{
		escreva ("\nDaqui a pouco tempo você será um nadador da categoria Infantil A!")
		}
		senao se (idade >=5 e idade<=7)
			{
				escreva("Olá de acordo com sua idade, sua categoria de nadador é Infantil A, que demais!!") 
			}
		senao se (idade >=8 e idade<=11)
			{
				escreva("Olá de acordo com sua idade, sua categoria de nadador é Infantil B, excelente!!") 
			}
		senao se (idade >=12 e idade<=13)
			{
				escreva("Olá de acordo com sua idade, sua categoria de nadador é Juvenil A, Ual!!") 
			}	
		senao se (idade >=14 e idade<=17)
			{
				escreva("Olá de acordo com sua idade, sua categoria de nadador é Juvenil B, muito experiente!!") 
			}
		senao se (idade >=18)
			{
				escreva("Olá de acordo com sua idade, sua categoria de nadador é Adulto, incrível!!") 
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