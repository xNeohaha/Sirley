package Atividade;
 
import java.util.Scanner;

public class SeisF {
       public static void main(String[] args) {
		// 6F: TROCA DE VALORES
        System.out.println("Programa para trocar A por B.");
		Scanner entrada = new Scanner(System.in);
		double a,b,ab;
		int temp;
        System.out.println("Digite o valor de A:");
		a = entrada.nextDouble();
        System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
		ab = a;
		a = b;
		b = ab;
   		System.out.println("Após a troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        entrada.close();
    }
}
