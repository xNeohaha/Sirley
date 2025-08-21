package Atividade;

import java.util.Scanner;

public class SeisH {
    public static void main(String[] args) {
        // 6H: VOLUME DE UMA CAIXA TRIANGULAR
        System.out.println("Programa para Calcular o volume de uma caixa triangular.");
        Scanner entrada = new Scanner(System.in);
        double cm, lar, alt, vol;
        System.out.println("Digite o comprimento da caixa: ");
        cm = entrada.nextDouble();
        System.out.println("Digite a largura da caixa: ");
        lar = entrada.nextDouble();
        System.out.println("Digite a altura da caixa: ");
        alt = entrada.nextDouble();
        vol = cm * lar * alt;
        System.out.println("O volume da caixa é: " + vol);
        entrada.close();
    }
}
