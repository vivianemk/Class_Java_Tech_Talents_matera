package cttbank;

public class ContaCorrente extends ContaBancaria {
	protected double limite;
    protected double taxa;
    
public ContaCorrente(int agencia, int numero, double saldo, String cliente, Date data, double limite, double taxa) {
	super(agencia, numero, saldo, cliente, data);
	this.limite = limite;
	this.taxa = taxa;
}
public double getLimite() {
	return limite;
}
public void setLimite(double limite) {
	this.limite = limite;
}
public double getTaxa() {
	return taxa;
}
public void setTaxa(double taxa) {
	this.taxa = taxa;
}
}
