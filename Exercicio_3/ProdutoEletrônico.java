package br.Exercicio_3;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoEletr�nico {

	private String nome;
    private String descricao;
    private int valor;
    
    //Construtor 
    
    public ProdutoEletr�nico(String nome, String descricao, int valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    public void cadastrarProduto() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        setNome(input.nextLine());
        
        System.out.println("Digite a descri��o: ");
        setDescricao(input.nextLine());
        
        System.out.println("Digite o valor: ");
        setValor(input.nextInt());
        
        mostraProdutos(nome, descricao, valor);
    }
    
    public void mostraProdutos(String nome, String descricao, int valor) {
        
        System.out.println("Nome: " + nome); 
        System.out.println("Descri��o: " + descricao); 
        System.out.println("Valor: " + valor);
        System.out.println("Cadastro Comcluido!!");
    }
}
