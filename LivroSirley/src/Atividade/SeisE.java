package Atividade;
 
import java.util.Scanner;

public class SeisE {
    public static void main(String[] args) {
        System.out.println("Programa para calcular o valor de uma prestação em atraso.");
		Scanner entrada = new Scanner(System.in);
		double val,tx,pre;
		int temp;
        System.out.println("Digite o valor da prestação:");
		val = entrada.nextDouble();
        System.out.println("Digite a taxa de juros (% ao mês): ");
		tx = entrada.nextDouble();
        System.out.println("Digite o tempo de atraso (em meses): ");
		temp = entrada.nextInt();
        pre = val + (val * (tx / 100) * temp);
		System.out.println("O valor da prestação em atraso é:"+pre);
        entrada.close();
    }
}
