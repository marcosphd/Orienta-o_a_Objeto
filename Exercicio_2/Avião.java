package br.Exercicio_2;

public class Avião {
	
	private String modelo;
	private String quantidadeLugares;
	private int velocidade;

	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getQuantidadeLigares() {
		return quantidadeLugares;
	}
	public void setQuantidadeLigares(String quantidadeLigares) {
		this.quantidadeLugares = quantidadeLigares;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	// metodo
	
	public void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
		
	}
	
	void exibicaoo(){
        System.out.println("==============================================");
        System.out.println("=============Modelo==de==Avião================");
        System.out.println("Modelo do avião: " + modelo);
        System.out.println("Acentos: " + quantidadeLugares);
        System.out.println("Velocidade do Avião: " + velocidade);
        System.out.println("==============================================");
    }
	

	
	
	
	
}
