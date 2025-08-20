package Atividade;

import java.util.Scanner;

public class SeisQ {
    public static void main(String[] args) {
        System.out.println("Programa para calcular a área de uma circunferência.");
        Scanner entrada = new Scanner(System.in);
        double r, a;
        System.out.println("Digite o raio da circunferência: ");
        r = entrada.nextDouble();
        a = 3.14159 * r * r;
        System.out.println("A área da circunferência é: " + a);
        entrada.close();
    }
}

