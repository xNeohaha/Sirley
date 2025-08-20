package Atividade;

import java.util.Scanner;

public class SeisJ {
      public static void main(String[] args) {
        // 6J: QUADRADO DA DIFERENÇA ENTRE DOIS NÚMEROS
        System.out.println("Programa para calcular o quadrado da diferença entre dois números.");
        Scanner entrada = new Scanner(System.in);
        int A, B, diff, res;
        System.out.println("Digite o valor de A: ");
        A = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        B = entrada.nextInt();
        diff = A - B;
        res = diff * diff;
        System.out.println("O quadrado da diferença entre A e B é: " + res);
        entrada.close();
    }
}
