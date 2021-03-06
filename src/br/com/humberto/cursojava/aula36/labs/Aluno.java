package br.com.humberto.cursojava.aula36.labs;

import java.util.Arrays;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double[] notas;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notas=" + Arrays.toString(notas) + "]";
	}
	
}
