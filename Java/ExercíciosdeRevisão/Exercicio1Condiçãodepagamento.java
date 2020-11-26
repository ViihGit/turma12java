package ExercíciosdeRevisão;
/*1-  	Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10% */

import java.util.Scanner;

public class Exercicio1Condiçãodepagamento {

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
		System.out.print("\nEscolha sua forma de pagamento: digite 1- para dinheiro, 2 - para cheque 3 - para cartão de crédito");
		System.out.print("\nDigite o numero da opção que deseja: ");
		formaP=read.nextInt();
		//processamento
		if (formaP>=1 && formaP<=2)
		{
			System.out.print("\nVocê recebeu 20% de desconto!\n");
			desconto=valor*0.20;
			valor=valor-desconto;
			System.out.print("\nO valor a ser pago é de: R$ " + valor );
			System.out.print("\nParabéns pela compra, volte sempre!");
		}
		if (formaP>2 && formaP<=3)
		{
			System.out.print("\nDeseja parcelar\n S/N: ");
			produto=read.next().charAt(0);
			System.out.print(produto =='N' || produto=='n');
			{
				desconto=valor*0.15;
				valor=valor-desconto;
				System.out.print("\nO valor a ser pago é de: R$ " + valor);
				System.out.print("\nParabéns pela compra você ganhou 15% de desconto!");
			}
			if (produto =='S' || produto=='s')
			{
				System.out.print("Em quantas vezes deseja parcelar: 2 ou 3 vezes? ");
			qtdP=read.nextInt();
			}
		}	
		if ( qtdP==2)
		{
			System.out.print("Não há descontos para essa forma de pagamento \nO valor á pagar é de: R$"+valor);
		}	
		else if(qtdP==3)
		{
			desconto=valor*0.10;
			valor=valor+desconto;
			System.out.print ("\nO valor a ser pago é de: R$ " + valor);
			System.out.print("\nObrigada por comprar conosco! \nO parcelamnto em 3x há juros de 10%! \nO valor a ser pago é R$"+valor);
	
		}
		//impressao
		System.out.print("\nFim de programa!");
	
	}

}



