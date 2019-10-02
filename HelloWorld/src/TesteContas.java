
public class TesteContas {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		c1.deposita();
		c1.saque();
		System.out.println(c1.getSaldo());
		
		c2.deposita();
		c2.saque();
		System.out.println(c2.getSaldo());
	}
}
