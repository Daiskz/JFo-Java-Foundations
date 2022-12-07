package Secao5;

import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("IF");
        System.out.println("Insira um valor de cor: ");
        int corValor = entrada.nextInt();
        if (corValor == 1) {
            System.out.println("A próxima cor do farol é verde");
        }
        if (corValor == 2) {
            System.out.println("A próxma cor do farol é amarelo");
        }
        if (corValor == 3) {
            System.out.println("A próxima cor do farol é vermelho");
        }
        if (corValor < 1 || corValor > 3) {
            System.out.println("Cor inválida");
        }
        System.out.println("SWITCH");
        System.out.println("Insira um valor de cor: ");
        int corAtual = entrada.nextInt();
        switch (corAtual) {
            case 1:
                System.out.println("A próxima cor do farol é verde");
                break;
            case 2:
                System.out.println("A próxima cor do farol é amarelo");
                break;
            case 3:
                System.out.println("A próxima cor do farol é vermelho");
                break;
            default:
                System.out.println("Cor inválida");
        }
        entrada.close();
    }
}
