//Crie uma classe Televisão e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:
//
//aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
//aumentar e diminuir o número do canal em uma unidade
//trocar para um canal indicado;
//informar o valor do volume de som e o canal selecionado.
//Um ControleRemoto tem uma Televisão

package aval01_04;

public class Televisao {
	private int canal;
	private int volume;
	
	public int aumentarVolume() {
		this.volume++;
		return this.volume;
	}
	public int diminuirVolume() {
		this.volume--;
		return this.volume;
	}
	public int aumentarCanal() {
		this.canal++;
		return this.canal;
	}
	public int diminuirCanal() {
		this.canal--;
		return this.canal;
	}
	public int mudarCanal(int canalDesejado) {
		this.canal= canalDesejado;
		return this.canal;
		
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	

}
