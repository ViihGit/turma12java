programa
{
	inclua biblioteca Matematica --> mat
	/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde 
	 * para dar uma indicação sobre a condição de peso de uma pessoa adulta. 
	 * A fórmula é IMC = peso / ( altura )2
	Elabore um programa que leia o peso e a altura de um adulto e mostre sua 
	condição de acordo com a tabela abaixo.
	IMC em adultos Condição
	Abaixo de 18,5 Abaixo do peso
	Entre 18,5 e 25 Peso normal
	Entre 25 e 30 Acima do peso
	Acima de 30 obeso EXERCICIO 2*/

	 
	funcao inicio()
	{
		real peso =0.0
		real altura = 0.0
		real imc = 0.0
		escreva("Cálculo do IMC")
		escreva("\nDigite seu peso: ")
		leia(peso)
		escreva("\nDigite sua altura: ")
		leia(altura)
		imc= (peso) / (altura*altura)
		
		escreva("\n Seu IMC é: "+ imc) 
		
		se (imc <=18.4)
		{
			escreva ("\n Seu peso está abaixo do ideal: ")
		}
		senao se ((imc>=18.5) e (imc<=24.99))
		{
			escreva("\nMuito bom!! seu peso está normal.")
		}
		senao se ((imc>=25) e (imc<=29.99))
		{
			escreva ("\n Atenção, você está acima do peso!")
		}
		senao se (imc>30)
			escreva ("\nAtenção a sua saúde, você está obeso!")
		
		
		
		
		

		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */