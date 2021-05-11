package br.Exercicio_6;

import java.util.Scanner;

public class ContaBancaria {

	private String nome;
	private String CPF;
	private String Rg;
	private String Celular;
	private int senha;
	
	public ContaBancaria (String nome, String CPF, String Rg, String Celular,int senha) {
     
		this. nome = nome;
        this. CPF = CPF;
        this. Rg = Rg;
        this. Celular = Celular;
        this. senha = senha;
	}
	
	 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg = rg;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}




	public void cadastroConta() {
	        
	        Scanner Ct = new Scanner(System.in);
	        
	        
	        System.out.println("Digite seu nome: ");
	        setNome(Ct.nextLine());
	        System.out.println("Digite seu CPF: ");
	        setCPF(Ct.nextLine());
	        System.out.println("Digite seu Rg: ");
	        setRg(Ct.nextLine());
	        System.out.println("Digite seu Celular: ");
	        setCelular(Ct.nextLine());
	        System.out.println("Digite uma senha de 6 Digitos: ");
	        setSenha(Ct.nextInt());
		
	        exibicao();
	
	}
	
	        void exibicao(){
		        System.out.println("===============================================");
		        System.out.println("=============Cadastro==de=Conta==Bancaria======");
		        System.out.println("Nome: " + nome);
		        System.out.println("CPF: " + CPF);
		        System.out.println("RG: " + Rg);
		        System.out.println("Celular: (11)" + Celular);
		        System.out.println("Sua senha: ******" );
		        System.out.println("===============================================");
	            
	 }	
}
