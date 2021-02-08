package dia18_aval_BancoProjetoPratico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//Criar novo banco
		System.out.println("Digite o nome do banco desejado: " );
		String nomeBanco = in.next();
		Banco banco = new Banco(nomeBanco);

		//		cadastro de conta
		String continua ="s";


		do {
			System.out.println("Qual será o tipo de conta Corrente(c) ou Poupança(p)");
			String tipoConta = in.next();

			//		Criar novo cliente
			System.out.println("Digite o nome do novo correntista");
			String nomeDoCliente = in.next();
			Cliente cliente = new Cliente(nomeDoCliente);

			System.out.println("Digite o valor inicial da conta corrente");
			Double saldo = in.nextDouble();
			Conta conta;		
			//      Criar nova conta
			if (tipoConta.equals("c")) {
				conta = new ContaCorrente(saldo, cliente);
			} else {
				conta = new ContaPoupanca(saldo, cliente);
			}

			banco.adicionarConta(conta);

			System.out.println("Deseja cadastrar uma conta? [s] sim [n] não ");
			continua = in.next();

		} while (continua.equals("s"));
		//		 fim do cadastro de contas


		//      operações
		System.out.println("Qual conta vc deseja entrar? ");
		String nome = in.next();
		Conta conta = banco.getContas().get(banco.getConta(nome));

		Boolean realizarOperacoes = true;
		while (realizarOperacoes) {
			System.out.println("Qual operação você deseja realizar?");
			System.out.println("[s] Saque");
			System.out.println("[d] Depósito");
			System.out.println("[e] Extrato");
			System.out.println("[f] Encerrar");
			System.out.println("[t] Transferir");
			System.out.println("[c] Cheque especial (gerente)");

			String opcao = in.next();

			switch (opcao) {
			case "s":
				System.out.println("Valor do saque");
				Double valorSaque = in.nextDouble();
				conta.realizarSaque(valorSaque);
				break;
			case "d":
				System.out.println("Valor do depósito");
				Double valorDeposito = in.nextDouble();
				conta.depositar(valorDeposito);
				break;
			case "e":
				conta.listarExtratoComSaldo();
				break;
			case "t":
				System.out.println("Qual o nome da pessoa para quem você deseja transferir : ");
				String beneficiario = in.next();
				Conta contaBeneficiario = banco.getContas().get(banco.getConta(beneficiario));
				System.out.println("Valor a transferir : ");
				Double valor = in.nextDouble();
				conta.realizarTransferencia(contaBeneficiario, valor);
				break;

			case "f":
				conta.encerrarConta();
				break;
			case "c":
				if (conta instanceof ContaCorrente) {
					System.out.println("Senha do gerente");
					String senhaDoGerente = in.next();
					System.out.println("Novo valor do limite da conta corrente");
					Double novoValorLimite = in.nextDouble();
					((ContaCorrente) conta).adicionarLimiteChequeEspecial(novoValorLimite, senhaDoGerente);
				} else {
					System.out.println("Não é possível fazer operações de cheque especial em conta poupança");
				}

				break;
			default:
				break;
			}

			System.out.println("Deseja continuar fazendo operações (s)/(n)");
			realizarOperacoes = in.next().equals("s");

		}

		in.close();

	}

}