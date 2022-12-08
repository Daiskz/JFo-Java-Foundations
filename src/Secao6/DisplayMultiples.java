package Secao6;

import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número para saber seus multiplos de 1 a 12: ");
        int num = entrada.nextInt();
        System.out.println("Multiplos:");
        for (int i = 1; i < 13; i++) {
            int multiplos = num * i;
            System.out.println(num + "x" + i + " = " + multiplos);
        }
        entrada.close();
    }
}
