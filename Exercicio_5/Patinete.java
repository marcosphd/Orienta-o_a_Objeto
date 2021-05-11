package br.Exercicio_5;

public class Patinete {
	
	private String tipo;
	private int preco;
	private String modelo;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	   void exibicao(){
	        System.out.println("===============================================");
	        System.out.println("=============Cadastro==de=Conta==Bancaria======");
	        System.out.println("Patinete: " + tipo);
	        System.out.println("Preço: " + preco);
	        System.out.println("Modelo do Patinete: " + modelo);
	        System.out.println("===============================================");
           
}	
	

}
