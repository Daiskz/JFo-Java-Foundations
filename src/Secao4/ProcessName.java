package Secao4;

import java.util.Scanner;

public class ProcessName {
    public static void processadorNome() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        int space = nome.indexOf(" ");
        char nomePrimario = nome.charAt(0);
        String nomeSobrenome = nome.substring(space + 1);
        System.out.println("Seu nome é: " +nomeSobrenome+", "+nomePrimario);
        entrada.close();
    }
}
