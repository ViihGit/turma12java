package Exerc�ciosdeRevis�o;
/*1-  	Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento. 
 * Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado.
C�digo Condi��o de pagamento
1 � vista em dinheiro ou cheque, recebe 20% de desconto
2 � vista no cart�o de cr�dito, recebe 15% de desconto
3 Em duas vezes, pre�o normal de etiqueta sem juros
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10% */

import java.util.Scanner;

public class Exercicio1Condi��odepagamento {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		//variaveis
		int formaP=0 , qtdP=0;
		int  dinheiro=0, cheque=0, credito = 0;
		char produto;
		double valor=0.0 , desconto = 0.0;
		//entradas
		System.out.println("Insira o valor do produto: ");
		valor=read.nextDouble();
		System.out.print("\nEscolha sua forma de pagamento: digite 1- para dinheiro, 2 - para cheque 3 - para cart�o de cr�dito");
		System.out.print("\nDigite o numero da op��o que deseja: ");
		formaP=read.nextInt();
		//processamento
		if (formaP>=1 && formaP<=2)
		{
			System.out.print("\nVoc� recebeu 20% de desconto!\n");
			desconto=valor*0.20;
			valor=valor-desconto;
			System.out.print("\nO valor a ser pago � de: R$ " + valor );
			System.out.print("\nParab�ns pela compra, volte sempre!");
		}
		if (formaP>2 && formaP<=3)
		{
			System.out.print("\nDeseja parcelar\n S/N: ");
			produto=read.next().charAt(0);
			System.out.print(produto =='N' || produto=='n');
			{
				desconto=valor*0.15;
				valor=valor-desconto;
				System.out.print("\nO valor a ser pago � de: R$ " + valor);
				System.out.print("\nParab�ns pela compra voc� ganhou 15% de desconto!");
			}
			if (produto =='S' || produto=='s')
			{
				System.out.print("Em quantas vezes deseja parcelar: 2 ou 3 vezes? ");
			qtdP=read.nextInt();
			}
		}	
		if ( qtdP==2)
		{
			System.out.print("N�o h� descontos para essa forma de pagamento \nO valor � pagar � de: R$"+valor);
		}	
		else if(qtdP==3)
		{
			desconto=valor*0.10;
			valor=valor+desconto;
			System.out.print ("\nO valor a ser pago � de: R$ " + valor);
			System.out.print("\nObrigada por comprar conosco! \nO parcelamnto em 3x h� juros de 10%! \nO valor a ser pago � R$"+valor);
	
		}
		//impressao
		System.out.print("\nFim de programa!");
	
	}

}



