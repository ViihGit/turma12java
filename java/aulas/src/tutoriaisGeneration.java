import java.util.Scanner;

public class tutoriaisGeneration {
	public static void main (String[]args)
	{
		
		Scanner ler = new Scanner (System.in);
		int a, b, soma;
		System.out.println("Entre com um valor de A: ");
		a = ler.nextInt();
		System.out.println("Entre com um valor de B: 10");
		b = ler.nextInt();
		soma = a+b;
		System.out.println ("Valor total da soma: " + soma); 
	}
	
}
