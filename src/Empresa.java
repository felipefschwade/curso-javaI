
public class Empresa {
	String nome;
	int cnpj;
	Funcionario[] funcionario;
	
	void adiciona(Funcionario funcionario, int posicao) {
		if (this.funcionario[posicao] == null) {
			this.funcionario[posicao] = funcionario;
		} else {
			System.out.println("A posicao "+posicao+" j� est� ocupada, favor inserir outra.");
		}
		
	}
}
