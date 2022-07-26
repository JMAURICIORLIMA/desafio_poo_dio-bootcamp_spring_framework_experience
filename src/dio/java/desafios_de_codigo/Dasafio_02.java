package dio.java.desafios_de_codigo;

import java.util.Scanner;

public class Dasafio_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();
        int cont = 0;
        while (cont < casos) {

            double a = input.nextDouble() * 2;
            double b = input.nextDouble() * 3;
            double c = input.nextDouble() * 5;

            // TODO: complete os espaços em branco com sua solução para o problema
            double mP = (a + b + c) / (2 + 3 + 5);

            System.out.printf("%.1f",mP);
            System.out.println("");

            cont++;
        }
    }
}
