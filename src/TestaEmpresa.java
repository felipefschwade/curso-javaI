
public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.funcionario = new Funcionario[10];
	    for (int i = 0; i < 5; i++) {
	        Funcionario f = new Funcionario();
	        f.salario = 1000 + i * 100;
	        Data data = new Data();
			data.dia = i + 1;
			data.mes = 12;
			data.ano = 2012;
			f.entradaNoBanco = data;
	        empresa.adiciona(f, i);
	    }
	    empresa.mostraEmpregados();
	}
}
