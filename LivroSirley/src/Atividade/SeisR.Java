package Atividade;

import java.util.Scanner;

public class SeisP {
        public static void main(String[] args) {
        System.out.println("Programa para apuração de votos de três candidatos.");
        Scanner entrada = new Scanner(System.in);
        int votosA, votosB, votosC, nulos, brancos, total, validos;
        double percValidos, percA, percB, percC, percNulos, percBrancos;        
        System.out.println("Digite a quantidade de votos para o candidato A: ");
        votosA = entrada.nextInt();      
        System.out.println("Digite a quantidade de votos para o candidato B: ");
        votosB = entrada.nextInt();       
        System.out.println("Digite a quantidade de votos para o candidato C: ");
        votosC = entrada.nextInt();       
        System.out.println("Digite a quantidade de votos nulos: ");
        nulos = entrada.nextInt();
        System.out.println("Digite a quantidade de votos em branco: ");
        brancos = entrada.nextInt();
        total = votosA + votosB + votosC + nulos + brancos;
        validos = votosA + votosB + votosC;
        percValidos = (double) validos / total * 100;
        percA = (double) votosA / total * 100;
        percB = (double) votosB / total * 100;
        percC = (double) votosC / total * 100;
        percNulos = (double) nulos / total * 100;
        percBrancos = (double) brancos / total * 100;
        System.out.println("\n===== RESULTADO FINAL =====");
        System.out.println("Total de eleitores: " + total);
        System.out.println("Percentual de votos válidos: " + percValidos + "%");
        System.out.println("Percentual de votos do candidato A: " + percA + "%");
        System.out.println("Percentual de votos do candidato B: " + percB + "%");
        System.out.println("Percentual de votos do candidato C: " + percC + "%");
        System.out.println("Percentual de votos nulos: " + percNulos + "%");
        System.out.println("Percentual de votos em branco: " + percBrancos + "%");
        entrada.close();
    }
}
