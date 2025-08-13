package model;

public class Cadastro {
	
	private int idCadastro;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	
	public Cadastro() {
		
	}
	
	public Cadastro(String nome, String email, String telefone, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}



	public Cadastro(int idCadastro, String nome, String email, String telefone, String senha) {
		this.idCadastro = idCadastro;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}
	
	public int getIdCadastro() {
		return idCadastro;
	}
	
	public void setIdCadastro(int idCadastro) {
		this.idCadastro = idCadastro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
