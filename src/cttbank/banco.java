package cttbank;

import java.time.LocalDate;
import java.util.Scanner;

public class banco {
	public void adicionarConta(ContaBancaria conta) {
		
	
	
	Scanner sc= new Scanner(System.in);
	
	conta.setData(LocalDate.now().getDayOfMonth()+"/"LocalDate.now().getMonth()+)
	System.out.println("Digite o nome do cliente");
	String nomeCliente = sc.next();
	
	System.out.println("Digite o saldo ");
	double saldoInicial = sc.nextDouble();
	
	System.out.println("Informe o tipo de conta : conta corrente [1] [conta poupança ] [2]");
	int tipoConta = sc.next();
	
    
	}
}
