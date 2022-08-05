package clearminds.cuentas;

public class Cuenta {
	//Atributos
	private String id;
	private String tipo;
	private double saldo;
	
	//Constructor
	public Cuenta(String id) {
		super();
		this.id = id;
		this.tipo = "A";
	}
	
	public Cuenta(String id, String tipo, double saldo) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	//Getters and Setters
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Metodo imprimir
	public void imprimir(){
		System.out.println("************************");
		System.out.println("CUENTA");
		
		System.out.println("************************");
		System.out.println("Numero de cuenta: " + this.id);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("************************");
		
	}
	
	public void imprimirConMiEstilo(){
		System.out.println("****************************");
		System.out.println("|      CUENTA N " + this.id + "       |");
		
		System.out.println("|**************************|");
		System.out.println("| Tipo de cuenta: " + this.tipo + "        |");
		System.out.println("| Saldo disponible: $ " + this.saldo + " |");
		System.out.println("****************************");
		
	}
	
}
