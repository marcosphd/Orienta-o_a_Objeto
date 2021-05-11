package br.Exercicio_7;

import java.util.Scanner;

public class Paciente {
	
	private String nome;	
	private String Rg;
	private String Descricao;
	private String celular;
	
	
	public Paciente (String nome, String Rg, String Descricao, String Celular) {
	     
		this. nome = nome;
		this. Rg = Rg;
        this. Descricao = Descricao;
        this. celular = Celular;  
	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg = rg;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public void CadastroPaciente () {
		
		Scanner Cp = new Scanner(System.in);
		
		System.out.println("Informe seu nome: " + nome);
		setNome(Cp.next());
		System.out.println("Informe seu RG: " + Rg);
		setRg(Cp.next());
		System.out.println("Digite o Diaguinostico: " + Descricao);
		setDescricao(Cp.next());
		System.out.println("Digite um numero de celular: " + celular);
		setCelular(Cp.next());
		
	}
			void exiba(){
	        System.out.println("===============================================");
	        System.out.println("=============Cadastro==de=Conta==Bancaria======");
	        System.out.println("Nome do(a) Paciente: " + nome);
	        System.out.println("Seu RG: "+ Rg);
	        System.out.println("Descrição do Diaguinostico: " + Descricao);
	        System.out.println("Seu celular é: " + celular);
	        System.out.println("===============================================");
	 }
}
