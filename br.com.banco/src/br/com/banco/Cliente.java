package br.com.banco;

public class Cliente extends Pessoa {

	private String senha;

	public Cliente(String nome, String cpf, String rg, String senha) {
		super(nome, cpf, rg);
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Cliente [Nome: " + getNome() + ", Senha:  " + getSenha() + ", CPF: " + getCpf() + ", RG: " + getRg() + "]";
	}

}
