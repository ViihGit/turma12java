package Lista1;

import java.util.Scanner;

public class Exercicio5 {
	//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double n1, n2, n3, media;
		System.out.println("Informe a nota 1: ");
		n1=leia.nextDouble();
		System.out.println("Informe a nota 2: ");
		n2=leia.nextDouble();
		System.out.println("Informe a nota 3: ");
		n3=leia.nextDouble();
		media=(n1+n2+n3)/3;
		System.out.printf("A média é: %.2f",media);
		
		
		
		
		

	}

}
