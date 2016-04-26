
public class Empresa {
	String nome;
	int cnpj;
	Funcionario[] funcionario;
	
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
