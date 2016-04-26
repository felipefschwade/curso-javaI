
public class Empresa {
	String nome;
	int cnpj;
	Funcionario[] funcionario;
	
	void adiciona(Funcionario funcionario, int posicao) {
		if (this.funcionario == null) {
			this.funcionario[posicao] = funcionario;
		}
		
	}
}
