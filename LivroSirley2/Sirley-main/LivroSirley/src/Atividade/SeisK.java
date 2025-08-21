package Atividade;

import java.util.Scanner;

public class SeisK {
        public static void main(String[] args) {
        // 6K: CONVERSÃO DE DÓLAR PARA REAL
        System.out.println("Programa para converter dólar (US$) em real (R$).");
        Scanner entrada = new Scanner(System.in);
        double cotacao, dolar, real;
        System.out.println("Digite a cotação do dólar: ");
        cotacao = entrada.nextDouble();
        System.out.println("Digite a quantidade de dólares: ");
        dolar = entrada.nextDouble();
        real = dolar * cotacao;
        System.out.println("O valor em reais é: R$ " + real);
        entrada.close();
    }
}
