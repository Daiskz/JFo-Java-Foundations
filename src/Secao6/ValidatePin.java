package Secao6;

import java.util.Scanner;

public class ValidatePin {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pin = 102030;
        System.out.println("Insira um PIN de 6 digitos: ");
        int pinUsuario = entrada.nextInt();
        while (pinUsuario != pin) {
            System.out.println("PIN inválido, insira o PIN novamente");
            System.out.println("Insira um PIN de 6 digitos: ");
            pinUsuario = entrada.nextInt();
        }
        System.out.println("PIN correto, acesso a conta liberado!");
        entrada.close();
    }
}
