package br.com.banco;

public abstract class Conta {

	private Integer agencia;
	private Integer numeroConta;
	private Double saldo = 0.0;
	private Cliente cliente;

	public Conta(Integer agencia, Integer numeroConta, Cliente cliente) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
	}

	public void deposito(Double valorDeposito) {
		if (valorDeposito <= 0)
			System.out.println("Valor para dep?sito precisa ser maior do que ZERO!");
		else {
			this.saldo += valorDeposito;
			System.out.print("Dep?sito de R$ " + valorDeposito + " realizado com sucesso!" + "\nNovo saldo de : R$ "
					+ String.format("%.2f", getSaldo()));
		}
	}

	public void saque(Double valorASacar) {
		if (valorASacar > this.saldo)
			System.out.println("Saldo insuficiente! \nTentativa de saque: R$ " + valorASacar + "\nSaldo: R$ " + saldo);
		else {
			double valorSacado = this.saldo -= valorASacar;
			System.out.println("Valor sacado: R$ " + valorASacar + "\nNovo Saldo: R$ " + String.format("%.2f", getSaldo()));
		}
	}

	public void transferir(Double valorATransferir, ContaCorrente destinatario) {
		if (getSaldo() < valorATransferir) {
			System.out.println("Valor insuficiente para transfer?ncia! \nSaldo dispon?vel: R$ " + String.format("%.2f", getSaldo()));
		} else {
			this.saldo -= valorATransferir;
			destinatario.setSaldo(valorATransferir += destinatario.getSaldo());
			System.out.println("Valor enviado: R$ " + valorATransferir + "\nPara a conta: " + destinatario.getNumeroConta()
					+ "\nAg?ncia: " + destinatario.getAgencia() + "\nNovo saldo: R$ " + getSaldo());

		}

	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Conta [Ag?ncia: " + agencia + ", Conta: " + numeroConta + ", Saldo: " + saldo + ", " + cliente + "]";
	}

}
