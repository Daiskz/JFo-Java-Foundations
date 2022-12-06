package Secao3;

import java.util.Scanner;

public class Secao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Insira seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Insira seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("Insira seu número de matrícula: ");
        String matricula = entrada.nextLine();
        System.out.println("Seja bem vindo "+ nome + " " + sobrenome + " RA: " + matricula);

        System.out.println("Você poderia inserir seu endereço? ");
        String endereco = entrada.nextLine();
        System.out.println("Seu endereço é: " + endereco);

        System.out.println("Você poderia inserir seu número de telefone? ");
        String telefone = entrada.nextLine();
        System.out.println("Seu número de telefone é: " + telefone);

        System.out.println("Digite o primeiro número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int n2 = entrada.nextInt();
        System.out.println("A multiplicação dos números: " + n1 + " e " + n2 + " é: " + (n1 * n2));


        System.out.println("Insira um número decimal: ");
        double num1 = entrada.nextDouble();
        System.out.println("Isira o segundo número decimal: ");
        double num2 = entrada.nextDouble();
        System.out.println("Insira o último número decimal: ");
        double num3 = entrada.nextDouble();
        System.out.println("A soma dos números: " + num1 + ", " + num2 + " e " + num3 + " é: " + (num1 + num2 + num3));
        
        entrada.close();
    }
}