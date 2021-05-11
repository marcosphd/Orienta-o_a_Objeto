package br.Exercicio_4;

public class ObjetoFuncionário {

	public static void main(String[] args) {
		
		Funcionário fn = new Funcionário();
		
		fn.setNome("Duda Souza");
		fn.setCargo("Finanças");
		fn.setCelular("907897667");
		fn.setDepartamento("Investimentos");
		fn.setRG("534.312.123");
		fn.setSalario("4.500");

		fn.identificacao();
	}

}
