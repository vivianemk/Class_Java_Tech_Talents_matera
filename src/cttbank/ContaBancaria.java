package cttbank;

import java.sql.Date;

public class ContaBancaria {
	
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected String cliente;
	protected Date data;
	
	public ContaBancaria(int agencia, int numero, double saldo, String cliente, Date data) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.data = data;
	
	public protect getDate() {
		return Date;
	}
	public void setDate(protect date) {
		Date = date;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	}	

}
