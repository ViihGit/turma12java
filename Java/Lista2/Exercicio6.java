package Lista2;
//Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
//Em caso afirmativo, calcular a área do triângulo.	
import java.util.Scanner;

public class Exercicio6 {
	public static void main (String[]args) {
		Scanner leia = new Scanner (System.in);
	
		//variaveis 
		double base=0, altura=0, area=0; 
		//entradas
		System.out.println("Digite a base: ");
		base = leia.nextDouble();
		System.out.println("Digite a altura: ");
		altura=leia.nextDouble();
		
		//processamento
		if (base>0 && altura>0)
		{
			System.out.printf("A área do trinagulo é: %.2f " , ((base * altura)/2));
		
		
		}
		else
		{
			System.out.println("Você digitou um valor inváido!");
		}
		//impressão
	
	
	
	}
}
