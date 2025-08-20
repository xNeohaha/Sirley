package Atividade;

import java.util.Scanner;

public class SeisN {
    public static void main(String[] args) {
        System.out.println("Programa para A + B + C, resultad no valor quadrado da soma dos três valores.");
        Scanner entrada = new Scanner(System.in);
        int a,b,c,res;
        System.out.println("Digite o valor de A: ");
        a = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        b = entrada.nextInt();
        System.out.println("Digite o valor de C: ");
        c = entrada.nextInt();
        res = (a*a) + (b*b) + (c*c)
        System.out.println("O resultado é: " + res);
        entrada.close();
    }
}
