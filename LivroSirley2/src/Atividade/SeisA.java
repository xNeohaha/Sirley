package Atividade;
 
import java.util.Scanner;
 
public class SeisA {
	public static void main(String[] args) {
		// 6A: CELSIUS PARA F
		System.out.println("Programa para calcular Celsius PARA Fahrenheit.");
		Scanner entrada = new Scanner(System.in);
		double cel,fah;
		System.out.println("Insira a temperatura em Celsius:");
		cel = entrada.nextDouble();
		fah =  (9 * cel + 160) / 5;
		System.out.println("A temperatura em Fahrenheit(F) é de: "+fah);
		entrada.close();
	}
 
}