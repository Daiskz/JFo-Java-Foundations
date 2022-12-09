package Secao7;

import java.util.Scanner;

public class Terminal {
    public static void carregarSaldo(Cartao cartao) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("===TERMINAL===");
        System.out.println("Dados do cartão inserido: ");
        System.out.println("Número do cartão: " + cartao.getNumeroCartao());
        System.out.println("Saldo atual de créditos: " + cartao.getSaldoAtual());
        System.out.println("Saldo atual de tickets: " + cartao.getSaldoTicket());
        System.out.println("===RECARGA DE CRÉDITOS===");
        System.out.println("Insira a quantidade de dólares você quer colocar em créditos: ");
        int valor = entrada.nextInt();
        cartao.setSaldoAtual(valor * 2);
        System.out.println("===RECARGA REALIZADA===");
        System.out.println("Dados do cartão inserido: ");
        System.out.println("Número do cartão: " + cartao.getNumeroCartao());
        System.out.println("Saldo atual de créditos: " + cartao.getSaldoAtual());
        System.out.println("Saldo atual de tickets: " + cartao.getSaldoTicket());
        
    }
    public static void transferirSaldo(Cartao c1, Cartao c2) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("===TRANSFERÊNCIA DE CRÉDITOS===");
        System.out.println("Insira a quantidade de créditos que deseja fazer a transferência: ");
        int creditoCartao = entrada.nextInt();
        if (creditoCartao > c1.getSaldoAtual() || creditoCartao <= 0) {
            System.out.println("===AVISO!===");
            System.out.println("Saldo insuficiente para realizar a transferência de creditos");
        }
        else {
            c1.setSaldoAtual(c1.getSaldoAtual() - creditoCartao);
            c2.setSaldoAtual(c2.getSaldoAtual() + creditoCartao);
            System.out.println("===OPERAÇÃO REALIZADA COM SUCESSO!===");
            System.out.println("Novo saldo dos cartões: ");
            System.out.println("Cartão: " + c1.getNumeroCartao());
            System.out.println("Saldo atual: " + c1.getSaldoAtual());
            System.out.println("Cartão: " + c2.getNumeroCartao());
            System.out.println("Saldo atual: " + c2.getSaldoAtual());
        }
    }
}
