package Atividade;
 
import java.util.Scanner;
 
public class SeisC {
 
	public static void main(String[] args) {
		// 6C: CALCULAR VOLUME
		System.out.println("Programa para calcular o volume.");
		Scanner entrada = new Scanner(System.in);
		double vol,alt,raio;
		System.out.println("Insira o raio:");
		raio = entrada.nextDouble();
		System.out.println("Insira a altura:");
		alt = entrada.nextDouble();
		vol = 3.14159 * Math.pow(raio, 2) * alt;
		System.out.println("O volume é de: "+vol);
		entrada.close();
	}
 
}