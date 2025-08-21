package Atividade;
 
import java.util.Scanner;

public class SeisD {
    public static void main(String[] args) {
        // 6D: GASTO DE COMBUSTIVEL
        System.out.println("Programa para calcular o gasto de combustivel.");
		Scanner entrada = new Scanner(System.in);
		double temp,vl,dist,lt;
        System.out.print("Informe o tempo gasto na viagem (horas): ");
		temp = entrada.nextDouble();
        System.out.print("Informe a velocidade média (km/h): ");
        vl = entrada.nextDouble();
		dist = temp*vl;
		lt = dist/12;
        System.out.println("Velocidade média: " + vl + " km/h");
        System.out.println("Tempo gasto: " + temp + " horas");
        System.out.println("Distância percorrida: " + dist + " km");
        System.out.println("Combustível gasto: " + lt + " litros");
        entrada.close();
    }
}
