programa
{
	
	funcao inicio()
	{
		cadeia nomeUsuario
		inteiro anoNascimentoUsuario
		inteiro idadeUsuario
		const inteiro ANOATUAL = 2020
	//entrada
	escreva("Digite o nome: ")
	leia(nomeUsuario)
	escreva("Digite o ano de nascimento:")
	leia(anoNascimentoUsuario)
	escreva("Digite a idade:")
	leia(idadeUsuario)

	//processamento
	idadeUsuario = ANOATUAL -anoNascimentoUsuario
	se (idadeUsuario < 18)
	{
		escreva("Oi Sr(a) " + nomeUsuario +" você é menor de 18 anos e sua idade é: " + idadeUsuario+"anos")
	}
	senao se(idadeUsuario==18)
	{	
	escreva("Oi Sr(a) " + nomeUsuario +"você é maior de idade,sua idade é: " + idadeUsuario+"anos")
	}
	
	senao 
	{
		escreva("Oi Sr(a) " + nomeUsuario +"você é maior de idade,sua idade é: " + idadeUsuario+"anos")
	
	}
		escreva("\nFIM DE PROGRAMA")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 694; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */