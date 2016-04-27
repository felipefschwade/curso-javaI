
public class Empresa {
	private String nome;
	private int cnpj;
	private Funcionario[] funcionario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public Funcionario getFuncionario(int posicao) {
		return this.funcionario[posicao];
	}
	public void setFuncionarios(int quantidade) {
		this.funcionario = new Funcionario[quantidade];
	}
	void adiciona(Funcionario funcionario, int posicao) {
		if (this.funcionario[posicao] == null) {
			this.funcionario[posicao] = funcionario;
		} else {
			System.out.println("A posicao "+posicao+" já está ocupada, favor inserir outra.");
		}
		
	}
	void mostraEmpregados() {
		for (int i = 0; i < this.funcionario.length; i++) {
			if (this.funcionario[i] == null) {
				continue;
			}
			this.funcionario[i].mostra();
		}
	}
	boolean contem(Funcionario f) {
		for (int i = 0; i < this.funcionario.length; i++) {
			if (f == this.funcionario[i]) {
				return true;
			}
		}
		return false;
	}
}
