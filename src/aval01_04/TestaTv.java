package aval01_04;

public class TestaTv {
public static void main(String[] args) {
	Televisao televisao = new Televisao();
	ControleRemoto controle = new ControleRemoto();
	
	controle.setTelevisao(televisao);
	controle.televisao.aumentarCanal();
	System.out.println("Canal: "+ televisao.getCanal());
	controle.televisao.aumentarVolume();
	System.out.println("Volume da tv :"+ televisao.getVolume());
	controle.televisao.mudarCanal(5);
	System.out.println("Canal:" + televisao.getCanal());
}
}
