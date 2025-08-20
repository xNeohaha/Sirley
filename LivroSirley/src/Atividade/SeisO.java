package Atividade;

import java.util.Scanner;

public class SeisO {
    public static void main(String[] args) {
        // 6O: A + B + C, RESULTADO NO VALOR QUADRADO DA SOMA DOS TRÊS VALORES
        System.out.println("Programa para A + B + C, resultado do valor quadrado da soma dos três valores.");
        Scanner entrada = new Scanner(System.in);
        int a,b,c,d,p,s;
        System.out.println("Digite o valor de A: ");
        a = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        b = entrada.nextInt();
        System.out.println("Digite o valor de C: ");
        c = entrada.nextInt();
        System.out.println("Digite o valor de D: ");
        d = entrada.nextInt();
        p = (a * c);
        s = (b + d);
        System.out.println("O resultado P é: " + p);
        System.out.println("O resultado P é: " + s);
        entrada.close();
    }
}