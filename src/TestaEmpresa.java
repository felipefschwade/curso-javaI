
public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.funcionario = new Funcionario[10];
	    for (int i = 0; i < 5; i++) {
	        Funcionario f = new Funcionario();
	        f.salario = 1000 + i * 100;
	        empresa.adiciona(f, i);
	    }
	    
	}
}
