package com.adc.models;

public abstract class User {
	private String user;
	private String senha;
	private String nome;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean autenticadorLogin(String senha) {
		return(this.senha.equals(senha));
	}
}
