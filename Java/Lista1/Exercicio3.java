package Lista1;

import java.util.Scanner;

/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma 
 * f�brica expressa em segundos e 
 * mostre-o expresso em horas, minutos e seconds*/
public class Exercicio3 {

	public static void main(String[] args) {
		//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
		//expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 
		Scanner leia = new Scanner(System.in);
	
		int duracaoSegundos;
		int horas;
		int minutos;
		int segundos;
		System.out.println("Tempo de dura��o do evento em segundos: ");
		duracaoSegundos=leia.nextInt();
		horas = duracaoSegundos /3600;
		minutos = (duracaoSegundos %3600) /60;
		segundos = ((duracaoSegundos % 3600) %60);
		
		System.out.println("---------------");
		System.out.println("Horas: "+horas);
		System.out.println("Minutos: "+minutos);
		System.out.println("Segundos: "+segundos);
	}

}
