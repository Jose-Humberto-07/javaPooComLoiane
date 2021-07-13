package br.com.humberto.cursojava.aula36;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public void exibirContato() {
		System.out.println("Nome: " + this.nome);
	}
	
	
}
