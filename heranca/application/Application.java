package application;

import contas_2.Conta;
import contas_2.ContaPremium;
import contas_2.ContaPoupanca;

public class Application {

	public static void main(String[] args) {
		Conta acc = new Conta(1001, "Ivan", 0.0);
		ContaPremium accP = new ContaPremium(1002, "Ivan Jr", 0.0, 1000.0);
		
		// UPCASTING
		
		Conta acc1 = accP;
		Conta acc2 = new ContaPremium(1004, "João", 0.0, 10.5);
		Conta acc3 = new ContaPoupanca(1003, "Pedro", 10.0, 999.9);
		Conta acc4 = new ContaPoupanca(1005, "Erick", 500.00, 5.00);

		// DOWNCASTING
		
		ContaPremium acc5 = (ContaPremium)acc1;
		acc5.emprestimo(500.00);
		
		// ContaPremium acc6 = (ContaPremium)acc4;
		// testando com instanceof
		
		if (acc4 instanceof ContaPremium) {
			ContaPremium acc6 = (ContaPremium)acc4;
			acc6.emprestimo(500.00);
			System.out.println("Emprestimos");
		}
		
		if (acc4 instanceof ContaPoupanca) {
			ContaPoupanca acc6 = (ContaPoupanca)acc4;
			acc6.atualizarSaldo();
			System.out.println("Saldo atualizado!");
		}

	}

}
