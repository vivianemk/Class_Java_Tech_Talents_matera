package aval01_05;

public class TestaAgenda {
	public static void main(String[] args) {
	
		Agenda agenda = new Agenda("Agenda da vivi");
		Contato contato = new Contato("Zulu","000-0000", "zulu70@etanol.com");
		Agenda agenda1 = new Agenda("Agenda da lulu");
		Contato contato1 = new Contato ("Sakura Momoko", "+81- 123-4567", "marukotchan@mail.co.jp");
		agenda.adicionaContato(contato);
		agenda.exibirContato(contato);
		agenda.adicionaContato(contato1);
		agenda.exibirContato(contato1);
		agenda1.adicionaContato(contato1);
		System.out.println("");
		agenda1.exibirContato(contato1);
	}

}
