package ExercíciosdeRevisão;

import java.util.Scanner;

//2-  	O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. 
//A fórmula é IMC = peso / ( altura )2

public class CalculoIMC {

	public static void main(String[] args) {
	Scanner read = new Scanner (System.in);	
		//variaveis
		double peso =0.0;
		double altura = 0.0;
		double imc = 0.0;
		//entradas
		System.out.print("Cálculo do IMC");
		System.out.print("\nDigite seu peso: ");
		peso=read.nextDouble();
		System.out.print("\nDigite sua altura: ");
		altura=read.nextDouble();

		imc= (peso) /Math.pow(altura,2);
		System.out.printf("\nSeu IMC é: "+imc);
		if  (imc <=18.4)
		{	
			System.out.print("\n Seu peso está abaixo do ideal: ");
		}
		else if ((imc>=18.5) && (imc<=24.99))
		{
			System.out.print("\nMuito bom!! seu peso está normal.");
		}
		else if ((imc>=25) && (imc<=29.99))
		{
			System.out.print ("\n Atenção, você está acima do peso!");
		}
		else if (imc>=30);
		{
			System.out.printf ("\nAtenção a sua saúde, você está obeso!");
		}
	


	}
}






	