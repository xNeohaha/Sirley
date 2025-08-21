package Atividade;
 
import java.util.Scanner;
 
public class SeisB {
	public static void main(String[] args) {
		// 6B: CELSIUS PARA F
		System.out.println("Programa para calcular Fahrenheit PARA Celsius.");
		Scanner entrada = new Scanner(System.in);
		double cel,fah;
		System.out.println("Insira a temperatura em Fahrenheit:");
		fah = entrada.nextDouble();
		cel = ((fah - 32) * 5/9);
		System.out.println("A temperatura em Celsius(C) é de: "+cel);
		entrada.close();
	}
 
}