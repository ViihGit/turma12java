package ListaLa�odeRepeti��o;

import java.util.Scanner;
//2- Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o 
//m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.

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
				System.out.printf("\nA soma de todos n�meros �mpares e m�ltiplos de 3 � %d", soma);
			}
		}

	}

}
