package Secao5;

import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um comprimento de onda: ");
        double ondaComprimento = entrada.nextDouble();
        if (ondaComprimento >= 380 && ondaComprimento <= 450) {
            System.out.println("A cor é violeta");
        }
        if (ondaComprimento > 450 && ondaComprimento <= 495) {
            System.out.println("A cor é azul");
        }
        if (ondaComprimento > 495 && ondaComprimento <= 570) {
            System.out.println("A cor é verde");
        }
        if (ondaComprimento > 570 && ondaComprimento <= 590) {
            System.out.println("A cor é amarela");
        }
        if (ondaComprimento > 590 && ondaComprimento <= 620) {
            System.out.println("A cor é laranja");
        }
        if (ondaComprimento > 620 && ondaComprimento <= 750) {
            System.out.println("A cor é vermelho");
        }
        if (ondaComprimento < 380 || ondaComprimento > 750) {
            System.out.println("O comprimento de onda inserido não faz parte do espectro visível");
        }
        entrada.close();
    }
}
