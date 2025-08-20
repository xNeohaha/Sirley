package Atividade;

import java.util.Scanner;

public class SeisQ {
        public static void main(String[] args) {
        System.out.println("Programa para calcular a soma dos quadrados de três números inteiros.");
        Scanner entrada = new Scanner(System.in);
        int a, b, c, soma;
        
        System.out.println("Digite o valor de A: ");
        a = entrada.nextInt();
        
        System.out.println("Digite o valor de B: ");
        b = entrada.nextInt();
        
        System.out.println("Digite o valor de C: ");
        c = entrada.nextInt();
        
        soma = (a * a) + (b * b) + (c * c);
        
        System.out.println("A soma dos quadrados é: " + soma);
        entrada.close();
    }
}

