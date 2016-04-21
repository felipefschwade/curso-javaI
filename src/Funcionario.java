
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
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
	    System.out.println("Salário: R$" + this.salario);
	    System.out.println("Data de entrada: " + this.entradaNoBanco);
	    System.out.println("RG: " + this.RG);
	    System.out.println("");
	}
}