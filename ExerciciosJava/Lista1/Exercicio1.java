package Lista1;

import java.util.Scanner;

//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
public class Exercicio1 {
		public static void main (String[] args) {
			
			Scanner leia = new Scanner (System.in);
			//variaveis
			int idade, meses, dias, res;
			//entradas
			System.out.println("Digite sua idade: ");
			idade=leia.nextInt();
			System.out.println("Digite sua meses: ");
			meses=leia.nextInt();
			System.out.println("Digite seus dias: ");
			dias=leia.nextInt();
			res= (idade*365+(meses*30)+dias);
			System.out.println ("Sua idade em dias é: "+res);
					
			

	}


}
