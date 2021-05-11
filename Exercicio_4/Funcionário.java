package br.Exercicio_4;

public class Funcionário {
		
	private String nome;
	private String RG;
	private String departamento;
	private String cargo;
	private String celular;
	private String salario;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	void identificacao(){
        System.out.println("==============================================");
        System.out.println("=============Cadastro==de=Funcíonario=========");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + RG);
        System.out.println("Departamento: " + departamento);
        System.out.println("Seu cargo de atuação é: " + cargo);
        System.out.println("Celular: (11)" + celular);
        System.out.println("Salario mensal: " + salario);
        System.out.println("==============================================");
    }
	
	
	
	
	
	
}
