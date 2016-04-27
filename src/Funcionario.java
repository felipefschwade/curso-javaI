
public class Funcionario {
	public String nome;
	private double salario;
	public String departamento;
	public Data entradaNoBanco;
	private String RG;
	
	void recebeAumento(double valorDoAumento) {
		this.salario += valorDoAumento;
	}
	double getGanhoAnual() {
		return salario * 12;
	}
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
	    System.out.println("Salário: R$" + this.salario);
	    System.out.println("RG: " + this.RG);
	    System.out.println(this.entradaNoBanco.getFormatada());
	    System.out.println("");
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getRG() {
		return RG;
	}
}