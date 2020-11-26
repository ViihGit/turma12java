package Lista2;

import java.util.Scanner;

//4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e
//se é positivo ou negativo.

public class Exercicio4 {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		// variaveis
		int num=0;
		//entradas // pedir ao usuario 
		System.out.println("Digite um numero [+/-]: ");
		num = leia.nextInt(); 
		//processamento
		if ( num <0)
		{
	System.out.print("\nO Numero digitado é negativo");
		}
		else if  (num > 0){
		if ((num % 2)==0){
		System.out.print("\nNumero digitado é positivo e par!");
		}
		else {
		System.out.print("\nNumero positivo e impar.");
		}
		
		}
	
		else if (num==0){
		System.out.print("\nVocê digitou um numero neutro!.");
		}
	
	
	
	}

}
