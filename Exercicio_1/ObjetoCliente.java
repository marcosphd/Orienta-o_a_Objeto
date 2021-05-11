package br.Exercicio_1;

public class ObjetoCliente {

	public static void main(String[] args) {

		Cliente pf1 = new Cliente();
		
		pf1.setNome("Marcos");
		pf1.setCPF("032.132.322");
		pf1.setEmail("marcos2d@gmail.com");
		pf1.setCelular("968354764");
		
		pf1.identificacao();
	}
}
