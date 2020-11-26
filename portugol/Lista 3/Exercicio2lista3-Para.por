programa
{
	
{
	// Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos
	//de três e que se encontram no conjunto dos números de 1 até 500
            	
            	funcao inicio()
            	{           
        //variaveis
      
   		inteiro cont, soma = 0, n
    	//processamento
    	    	para (cont = 0; cont <=500; cont ++){
     	  	se ((cont % 2)!=0 e (cont % 3) ==0){	
            	soma = cont + soma
         
           	
     	       escreva ("\n", cont , " A soma de todos números ímpares múltiplo de 3 é de: "+soma)
            	}
        	}
            	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 612; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */