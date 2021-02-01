package cttbank;

public class ContaPoupanca extends ContaBancaria {
	
	private  int diaRendimento;
	private double taxaRendimento;
	
	public ContaPoupanca(int agencia, int numero, float saldo, String cliente, Date data, int diaRendimento,
			double taxaRendimento) {
		super(agencia, numero, saldo, cliente, data);
		this.diaRendimento = diaRendimento;
		this.taxaRendimento = taxaRendimento;
		if(taxaRendimento <1) {
			this.taxaRendimento +=1;
		}else {
			this.taxaRendimento=taxaRendimento;
			
		}
	}
}
