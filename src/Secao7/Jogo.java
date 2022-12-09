package Secao7;

import java.util.Random;

public class Jogo {
    public static void jogarJogo(Cartao cartao) {
        int valorParaJogar = 100;
        if (cartao.getSaldoAtual() < 100) {
            System.out.println("AVISO!");
            System.out.println("Você não tem a quantidade de créditos necessários para jogar");
        }
        else {
            System.out.println("TUDO CERTO!");
            System.out.println("Você usou 50 crétidos para jogar!");
            cartao.setSaldoAtual(cartao.getSaldoAtual() - valorParaJogar);
            System.out.println("Saldo atual: " + cartao.getSaldoAtual());
            Random random = new Random();
            int ticketsGanhados = random.nextInt(20, 100);
            cartao.setSaldoTicket(cartao.getSaldoTicket() + ticketsGanhados);
            System.out.println("Cartão: " + cartao.getNumeroCartao());
            System.out.println("Tickets ganhados: " + ticketsGanhados);
            System.out.println("Quantidade de tickets atual: " + cartao.getSaldoTicket());
        }
    }

}
