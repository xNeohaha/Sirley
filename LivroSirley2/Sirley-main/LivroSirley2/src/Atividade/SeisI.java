package Atividade;

import java.util.Scanner;

public class SeisI {
      public static void main(String[] args) {
        // 6I: QUADRADO DE UM NÚMERO
        System.out.println("Programa para calcular o quadrado de um número.");
        Scanner entrada = new Scanner(System.in);
        int num, quad;      
        System.out.println("Digite um número inteiro: ");
        num = entrada.nextInt();  
        quad = num * num;     
        System.out.println("O quadrado de " + num + " é: " + quad);
        entrada.close();
    }
}
