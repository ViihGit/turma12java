package Exerc�ciosdeRevis�o;

import java.util.Scanner;

//2-  	O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de para dar uma indica��o sobre a condi��o de peso de uma pessoa adulta. 
//A f�rmula � IMC = peso / ( altura )2

public class CalculoIMC {

	public static void main(String[] args) {
	Scanner read = new Scanner (System.in);	
		//variaveis
		double peso =0.0;
		double altura = 0.0;
		double imc = 0.0;
		//entradas
		System.out.print("C�lculo do IMC");
		System.out.print("\nDigite seu peso: ");
		peso=read.nextDouble();
		System.out.print("\nDigite sua altura: ");
		altura=read.nextDouble();

		imc= (peso) /Math.pow(altura,2);
		System.out.printf("\nSeu IMC �: "+imc);
		if  (imc <=18.4)
		{	
			System.out.print("\n Seu peso est� abaixo do ideal: ");
		}
		else if ((imc>=18.5) && (imc<=24.99))
		{
			System.out.print("\nMuito bom!! seu peso est� normal.");
		}
		else if ((imc>=25) && (imc<=29.99))
		{
			System.out.print ("\n Aten��o, voc� est� acima do peso!");
		}
		else if (imc>=30);
		{
			System.out.printf ("\nAten��o a sua sa�de, voc� est� obeso!");
		}
	


	}
}






	