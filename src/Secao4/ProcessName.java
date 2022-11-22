package Secao4;

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        String ultimoNome = nome.substring(6);
        String primeiraLetra = nome.substring(0, 1);
        System.out.println(ultimoNome + " , " + primeiraLetra + ".");
        entrada.close();
    }
}
