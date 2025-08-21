package Atividade;

import java.util.Scanner;

public class SeisL {
         public static void main(String[] args) {
        // 6L: CONVERSÃO DE REAL PARA DÓLAR
        System.out.println("Programa para converter real (R$) em dólar (US$).");
        Scanner entrada = new Scanner(System.in);
        double cotacao, real, dolar;
        System.out.println("Digite a cotação do dólar: ");
        cotacao = entrada.nextDouble();
        System.out.println("Digite a quantidade de reais: ");
        real = entrada.nextDouble();
        dolar = real / cotacao;
        System.out.println("O valor em dólares é: US$ " + dolar);
        entrada.close();
    }
}
