package contas_2;

public class ContaPremium extends Conta{
	
	private Double limiteEmprestimo;
	
	public ContaPremium() {
		super();
	}

	public ContaPremium(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getlimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setlimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(Double quantidade) {
		if (this.limiteEmprestimo >= quantidade) {
			deposito(quantidade);
			// saldo += quantidade - 10.00; Emprestimo com desconto 
		}
	}
	
	
}
