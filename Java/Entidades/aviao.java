package Entidades;

public class aviao {
	//atrib
	public String modelo;
	public String fabricante;
	public String peso;
	public int quantideAssentos;
	public String tipoMotor;
	public boolean voando;
	public int velocidade;
	
	
	//const
	
	public aviao ()
	{
		
	}
	
	public aviao(String modelo, String fabricante, String peso, int quantideAssentos, String tipoMotor) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.peso = peso;
		this.quantideAssentos = quantideAssentos;
		this.tipoMotor = tipoMotor;
	}
	

	//metodos
	public void decolar ()
	{
		this.voando = true;
	} 
	public void pouso ()
	{
		this.voando = false;
	} 
	public void aumentarVelocidade()
	{
		this.velocidade=this.velocidade +1;
	}
	public void diminuirVelocidade()
	{
		this.velocidade=this.velocidade -1;
	}
	

}