package Atividade;

import java.util.Scanner;

public class SeisP {
      public static void main(String[] args) {
        System.out.println("Programa para calcular o novo salário com reajuste.");
        Scanner entrada = new Scanner(System.in);
        double sm, pr, ns;      
        System.out.println("Digite o salário mensal atual: ");
        sm = entrada.nextDouble();       
        System.out.println("Digite o percentual de reajuste (%): ");
        pr = entrada.nextDouble();
        ns = sm + (sm * pr / 100);
        System.out.println("O novo salário é: R$ " + ns);
        entrada.close();
    }
}

