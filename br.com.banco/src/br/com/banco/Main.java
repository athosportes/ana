package br.com.banco;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Cliente anaClara = new Cliente("Ana Clara", "11111111111", "1111111111", "senha");
		Cliente athosPortes = new Cliente("Athos Portes", "22222222222", "2222222222", "password");

		ContaCorrente contaDaAnaClara = new ContaCorrente(10, 20, anaClara);
		ContaCorrente contaDoAthos = new ContaCorrente(10, 180, athosPortes);
		
		
		System.out.println("Saldo inicial da conta da Ana Clara: R$ " + contaDaAnaClara.getSaldo());
		
		System.out.println("\n---\n");
		contaDaAnaClara.deposito(223.10);
		
		Thread.sleep(150);
		
		System.out.println("\n---\n");
		contaDaAnaClara.deposito(345.90);
		
		System.out.println("\n---\n");
		contaDaAnaClara.saque(500.0);
		
		System.out.println("\n---\n");
		contaDaAnaClara.transferir(40.00, contaDoAthos);
		
	
		
	
	}

}



//System.out.println("Total de contas criadas: " + ContaCorrente.contasCriadas());