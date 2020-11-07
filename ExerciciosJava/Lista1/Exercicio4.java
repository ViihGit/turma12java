package Lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// 4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
		Scanner leia = new Scanner (System.in);
		int A,B,C,D,R,S;
		
		System.out.println(" Digite o valor A: ");
		A=leia.nextInt();
		System.out.println(" Digite o valor B: ");
		B=leia.nextInt();
		System.out.println(" Digite o valor C: ");
		C=leia.nextInt();
				R=(A+B)^2;
				S=(B+C)^2;
				D=(R+S)/2;
		System.out.println("O valor de D é: "+ R);
		


	}

}
