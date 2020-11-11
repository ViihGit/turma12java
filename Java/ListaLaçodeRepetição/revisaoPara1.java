package ListaLaçodeRepetição;

import java.util.Scanner;
//2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são 
//múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

public class revisaoPara1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// variaveis
		int contador, soma = 0;
		// processamento
		for (contador = 1; contador <= 500; contador++) {
			if ((contador % 2) != 0 && (contador % 3) == 0) {
				soma = contador + soma;
				// impressao
				System.out.printf("\nA soma de todos números ímpares e múltiplos de 3 é %d", soma);
			}
		}

	}

}
