package Lista2;
//Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos (positivos maiores que zero). 
//Em caso afirmativo, calcular a �rea do tri�ngulo.	
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
			System.out.printf("A �rea do trinagulo �: %.2f " , ((base * altura)/2));
		
		
		}
		else
		{
			System.out.println("Voc� digitou um valor inv�ido!");
		}
		//impress�o
	
	
	
	}
}
