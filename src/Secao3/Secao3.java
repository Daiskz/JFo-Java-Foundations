package Secao3;

import java.util.Scanner;

public class Secao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome1 = entrada.next();
        System.out.println("Digite sua mátricula: ");
        String matricula1 = entrada.next();
        System.out.println("Digite o primeiro número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int n2 = entrada.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        int n3 = entrada.nextInt();
        System.out.println("Insira um número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Isira o segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.println("Insira o último número: ");
        double num3 = entrada.nextDouble(); 
        System.out.println("Você poderia digitar seu endereço? ");
        String endereço1 = entrada.next();
        System.out.println("Você poderia inserir seu telefone? ");
        String numeroTelefone = entrada.next();
        int somaInteiro = (n1 + n2 + n3);
        double subtracaoDouble = (num1 - num2 - num3);

        System.out.println("Seu nome é: " + nome1);
        System.out.println("Sua mátricula é: " + matricula1);
        System.out.println("Seu endereço é: " + endereço1);
        System.out.println("Seu telefone é: " + numeroTelefone);
        System.out.println("A soma dos número inteiros é de: " + somaInteiro);
        System.out.println("A subtração dos números é de: " + subtracaoDouble);
        entrada.close();
    }
}