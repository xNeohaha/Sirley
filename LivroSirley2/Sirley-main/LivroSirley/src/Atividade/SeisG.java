package Atividade;

import java.util.Scanner;

public class SeisG {
    public static void main(String[] args) {
        // 6G: SOMA E MULTIPLICAÇÃO DE VARIÁVEIS
        System.out.println("Programa para somar e multiplicar variáveis.");
        Scanner entrada = new Scanner(System.in);
        int A, B, C, D;
        System.out.println("Digite o valor de A: ");
        A = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        B = entrada.nextInt();
        System.out.println("Digite o valor de C: ");
        C = entrada.nextInt();
        System.out.println("Digite o valor de D: ");
        D = entrada.nextInt();
        System.out.println("\nResultados das somas e multiplicações:");
        System.out.println("A + B = " + (A + B));
        System.out.println("A * B = " + (A * B));
        System.out.println("A + C = " + (A + C));
        System.out.println("A * C = " + (A * C));
        System.out.println("A + D = " + (A + D));
        System.out.println("A * D = " + (A * D));
        System.out.println("B + C = " + (B + C));
        System.out.println("B * C = " + (B * C));
        System.out.println("B + D = " + (B + D));
        System.out.println("B * D = " + (B * D));
        System.out.println("C + D = " + (C + D));
        System.out.println("C * D = " + (C * D));

        entrada.close();
    }
}
