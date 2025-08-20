package Atividade;

import java.util.Scanner;

public class SeisN {
    public static void main(String[] args) {
        System.out.println("Programa para Calcular o volume de uma caixa triangular.");
        Scanner entrada = new Scanner(System.in);
        int a,b,c,res;
        System.out.println("Digite o comprimento da caixa: ");
        cm = entrada.nextInt();
        System.out.println("Digite a largura da caixa: ");
        lar = entrada.nextDouble();
        System.out.println("Digite a altura da caixa: ");
        alt = entrada.nextDouble();
        vol = cm * lar * alt;
        System.out.println("O volume da caixa é: " + vol);
        entrada.close();
    }
}
