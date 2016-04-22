
public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		data.dia = 01;
		data.mes = 12;
		data.ano = 2012;
		f1.nome = "Hugo";
		f1.salario = 100;
		f1.entradaNoBanco = data;
		f1.mostra();
	}
}
