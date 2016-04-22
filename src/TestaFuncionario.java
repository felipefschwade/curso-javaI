
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
		System.out.println("Data de entrada: "+f1.entradaNoBanco.dia+"/"+f1.entradaNoBanco.mes+"/"+f1.entradaNoBanco.ano );
	}
}
