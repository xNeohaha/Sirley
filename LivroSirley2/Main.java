package Aula3Condicional;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double a,b,media;
        a = entrada.nextDouble();
        b = entrada.nextDouble();

        media = (a*3.5 + b*7.5)/11;
        System.out.println("MEDIA = "+media);
    }
 
}