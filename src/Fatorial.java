
public class Fatorial {
	public static void main(String[] args) {
		long fatorial = 1;
        for (int n = 1; n <= 20; n++) {
            fatorial = fatorial * n;
            System.out.println("fatorial de (" + n + ") = " + fatorial);
        }
	}
}
