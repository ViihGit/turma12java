package Lista2;
/*
1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
 Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos)
  deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P 
  (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da
   multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// variaveis
		float pesoTomate, excesso=0, multa=0, valorTotal;
		
		// entradas
		do 
		{
			System.out.println("Peso do tomate: ");
				pesoTomate=leia.nextFloat();
		}while (pesoTomate<0);
		// procedimentos
		if (pesoTomate>50) 
		{
			excesso=pesoTomate-50;
			multa=excesso*4;			
		}
		
		else if (pesoTomate==0)
		{
			System.out.println("Peso do tomate inválido!");
		}
			
		else if (pesoTomate<=50)
		{
			excesso=0;
			multa=0;
			pesoTomate=0;
		}
		valorTotal=pesoTomate*4;
		// impressão
		System.out.println("O peso total do tomate é: "+pesoTomate);
		System.out.println("O valor do excesso é: "+excesso);
		System.out.printf("O valor da multa é: %.2f reais",multa);
		
	
	}	
}
