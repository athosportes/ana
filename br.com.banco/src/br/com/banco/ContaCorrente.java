package br.com.banco;

public class ContaCorrente extends Conta {
	
	private Integer agencia = 1;

	private double taxa;	
	private static Integer numeroDeContasCriadas = 0;
	
	public ContaCorrente(Integer agencia, Integer numeroConta, Cliente cliente) {
		super(agencia, numeroConta, cliente);
		numeroDeContasCriadas ++;
	}

	
	public static Integer contasCriadas() {
		return numeroDeContasCriadas;
	}

}
