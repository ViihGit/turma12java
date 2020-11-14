package Lista1;

import java.util.Scanner;

/*6.Construa um programa em c que, tendo como dados 
 * 	de entrada dois pontos
 *  quaisquer no plano, P(x1, y1) e P(x2, y2),
 *  escreva a distância entre eles.
 *  A fórmula que efetua tal cálculo é: 
 */
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		//variaveis
		double   x1,x2,y1,y2,d;
		
		//entradas
		System.out.println("Entre com um valor x1: ");
		x1=read.nextDouble();
		System.out.println("Entre com um valor x2: ");
		x2=read.nextDouble();
		System.out.println("Entre com um valor y1: ");
		y1=read.nextDouble();
		System.out.println("Entre com um valor y2: ");
		y2=read.nextDouble();
		//processameto
		
		d=Math.sqrt(Math.pow(x2-x1 , 2) + Math.pow (y2-y1, 2));
		
		//imprssão
	
		System.out.printf("A distância entre eles: %.2f",d);
		
	}

}
