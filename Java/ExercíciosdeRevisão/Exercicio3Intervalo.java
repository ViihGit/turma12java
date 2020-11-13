package ExercíciosdeRevisão;

import java.util.Scanner;

/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos 
 * deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100].
 * A entrada de dados deve terminar quando for lido um número negativo.
 * EXERCICIO 3*/
public class Exercicio3Intervalo {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		int x, contador = 0;

      	do
      	{      	
                 	System.out.print("\nEscreva um número: ");
                 	x=read.nextInt();
                 	if (x >= 0 && x<= 25)
                 	{
                             	contador ++;
                 	}
                 	if (x >= 26 && x <= 50)
                 	{
                             	contador ++ ;	
                 	}
                 	if (x >= 51 && x <= 75)
                 	{
                             	contador ++;
                 	}
                 	if (x >= 76 && x<= 100)
                 	{                                         	
                 	contador ++;
                 	}
                 	
      	}while (x>0);

      	System.out.print("\nQuantidade de números entre [0-25], [26-50], [51-75] e [76-100]: " + contador);

	}

}
