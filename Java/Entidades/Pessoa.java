package Entidades;

public class Pessoa {
	//atributos da classe
	public String nome;
	public	char genero;
	public	int anoNascimento;
	public String sobrenome;
	public int idade;
	public double altura;
	//construtor
	public Pessoa (){
	}
	public Pessoa(String nome)
	{
		this.nome= nome;
	}
	public Pessoa(String nome, String sobrenome)
	{
		this.nome= nome;
		this.sobrenome= sobrenome;
	}
	public void idade ()
	{
		System.out.println(2020-this.anoNascimento);
	}
	public void idade (int anoAtual)
	{
		this.idade = anoAtual - this.anoNascimento;	
	}
	public int Pegaidade(int anoAtual)
	{
		this.idade = anoAtual - this.anoNascimento;	
		return this.idade;
	}
	public String SeuGenero()
	{
		String nomeGenero = null;
		if (this.genero=='M')
		{
			nomeGenero="Masculino";
		}
		if (this.genero=='F')
		{
			nomeGenero="Femenino";
		}
		if (this.genero=='O')
		{
			nomeGenero="Outros";
		}
		
		
		

		return nomeGenero;
	}
	
}
