
public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa(10);
	    for (int i = 0; i < 5; i++) {
	        Funcionario f = new Funcionario();
	        f.setSalario(1000 + i * 100);
			int dia = i + 1;
			int mes = 12;
			int ano = 2012;
			Data data = new Data(dia, mes, ano);
			f.entradaNoBanco = data;
	        empresa.adiciona(f, i);
	    }
	    empresa.mostraEmpregados();
	    Funcionario f = new Funcionario();
	    f.setSalario(10000);
	    int dia = 1;
	    int mes = 12;
		int ano = 2012;
		Data data = new Data(dia, mes, ano);
		f.entradaNoBanco = data;
		System.out.println(empresa.contem(f));
	}
}
