package Entidades;

public class produto {
	public String nomeProduto;
	public String medida; 
	public double ValorProdutoUn; 
	public int  quantidade; 

	//construtor
	public produto ()
	{
		
	}

	public produto(String nomeProduto, String medida, double valorProdutoUn, int quantidade) {
		this.nomeProduto = nomeProduto;
		this.medida = medida;
		ValorProdutoUn = valorProdutoUn;
		this.quantidade = quantidade;
	}
	



}
