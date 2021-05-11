package br.Exercicio_2;

public class ObjetoAvião {

	public static void main(String[] args) {
		
		Avião a1 = new Avião();
		
		a1.setModelo ("Nasa");
		a1.setQuantidadeLigares("50");
		a1.setVelocidade(30);
		a1.acelerar(40);
		a1.exibicaoo();
	}

}
