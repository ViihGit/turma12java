package Lista1;
//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int total, anos, meses, dias; 
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva quantos dias você tem em anos: ");
		dias=ler.nextInt();
		System.out.println("sua idade é: \n ");
		anos=dias/365;
		meses=(dias % 365)/30;
		dias=(dias%365)%30;
		System.out.println(" anos: "+anos);
		System.out.println("\n meses: "+meses)	;
		System.out.println("\n dias: " +dias);
	
		
				
				
		
	}

}
