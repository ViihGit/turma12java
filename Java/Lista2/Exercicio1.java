package Lista2;
/*
1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho.
 Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos)
  deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P 
  (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da
   multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.*/

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
			System.out.println("Peso do tomate inv�lido!");
		}
			
		else if (pesoTomate<=50)
		{
			excesso=0;
			multa=0;
			pesoTomate=0;
		}
		valorTotal=pesoTomate*4;
		// impress�o
		System.out.println("O peso total do tomate �: "+pesoTomate);
		System.out.println("O valor do excesso �: "+excesso);
		System.out.printf("O valor da multa �: %.2f reais",multa);
		
	
	}	
}
