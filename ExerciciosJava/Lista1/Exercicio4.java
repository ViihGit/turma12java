package Lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// 4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
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
		System.out.println("O valor de D �: "+ R);
		


	}

}
