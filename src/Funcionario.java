
public class Funcionario {
	String nome;
	double salario;
	String departamento;
	String entradaNoBanco;
	String RG;
	
	void recebeAumento(double valorDoAumento) {
		this.salario += valorDoAumento;
	}
	double calculaGanhoAnual() {
		return salario * 12;
	}
}