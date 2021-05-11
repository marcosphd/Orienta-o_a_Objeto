package br.Exercicio_1;

public class Cliente {

	//Atributos
	
	private String nome;
	private String Email;
	private String Celular;
	private String CPF;
	
	
	
	
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email)
	{
		Email = email;
	}
	public String getCelular()
	{
		return Celular;
	}
	public void setCelular(String celular) 
	{
		Celular = celular;
	}
	public String getCPF()
	{
		return CPF;
	}
	public void setCPF(String cPF) 
	{
		CPF = cPF;
	}
	
	// Métodos
	
	 void identificacao(){
	        System.out.println("==============================================");
	        System.out.println("=============Cadastro==de=Cliente=============");
	        System.out.println("Nome: " + nome);
	        System.out.println("CPF: " + CPF);
	        System.out.println("Email: " + Email);
	        System.out.println("Celular: (11)" + Celular);
	        System.out.println("==============================================");
	    }
	
	
}
