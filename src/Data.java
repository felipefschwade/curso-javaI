
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		if (dataValida(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			System.out.println("A data inserida é inválida");
		}
	}
	
	String getFormatada() {
		return "Data de entrada: "+this.dia+"/"+this.mes+"/"+this.ano;
	}
	private boolean dataValida(int dia, int mes, int ano) {
		int ultimoDoMes;
		if (dia <= 0 || mes <= 0 || mes > 12) {
			return false;
		}
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 30) {
			ultimoDoMes = 30;
		} else if (mes == 2 ) {
			ultimoDoMes = 28;
		} else if (mes == 2 && (ano % 400 == 0)) {
			ultimoDoMes = 29;
		} else {
			ultimoDoMes = 31;
		}
		if (dia > ultimoDoMes) {
			return false;
		}
		return true;
	}
}
