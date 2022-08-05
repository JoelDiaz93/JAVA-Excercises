package clearminds.cuentas.test;
import clearminds.cuentas.Cuenta;

public class TestCuenta {
	public static void main(String[]args){
		//Coloco el objeto Cuenta y lo referencio
		Cuenta cuenta1 = new Cuenta("03476");
		
		//Coloco un valor de saldo en la cuenta1
		cuenta1.setSaldo(675);
		
		//Creo la Cuenta y lo referencio con cuenta2
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		
		//Creo el objeto Cuenta y lo referencio con cuenta3
		Cuenta cuenta3 = new Cuenta("03476");
		
		//Imprimo cuenta1, cuenta2, cuenta3
		System.out.println("--------- Valores Iniciales ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("--------- Valores modificados ---------");
		
		//Modificando cuenta1, cuenta2, cuenta3
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(576);
		cuenta2.setTipo("D");
		
		//Imprimir valores de cuentas
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		//Coloco el objeto Cuenta y lo referencio con cuenta4
		Cuenta cuenta4 = new Cuenta("0987");
		
		//Modificando los valores de cuenta4
		cuenta4.setSaldo(10);
		
		//Coloco el objeto Cuenta y lo referencio con cuenta5
		Cuenta cuenta5 = new Cuenta("0557", "C", 10);
		
		
		//Coloco el objeto Cuenta y lo referencio con cuenta6
		Cuenta cuenta6 = new Cuenta("0666");
		
		//Imprimir valores de cuentas4, cuenta5, cuenta6
		cuenta4.imprimirConMiEstilo();;
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}
}
