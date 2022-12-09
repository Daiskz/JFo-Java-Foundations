package Secao7;

import java.util.Scanner;

public class CategoriaPremio {
    public static void ticketPremio(Cartao cartao) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("TROCA DE TICKETS POR PRÊMIOS!");
        System.out.println("Selecione um dos prêmios disponíveis: \n1 - Jogo de tabuleiro (100 Tickets)\n2 - Ursinho de pelúcia (200 Tickets)\n3 - Skate (300 Tickets)");
        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
            if (cartao.getSaldoTicket() < 100) {
                System.out.println("ATENÇÃO!");
                System.out.println("Saldo insuficiente para o prêmio escolhido!");
            }
            else {
                cartao.setSaldoTicket(cartao.getSaldoTicket() - 100);
                System.out.println("PARABÉNS!");
                System.out.println("Você ganhou: Jogo de tabuleiro!");
            }
            break;
            
            case 2:
            if (cartao.getSaldoTicket() < 200) {
                System.out.println("ATENÇÃO!");
                System.out.println("Saldo insufiente para o prêmio escolhido!");
            }
            else {
                cartao.setSaldoTicket(cartao.getSaldoTicket() - 200);
                System.out.println("PARABÉNS!");
                System.out.println("Você ganhou: Ursinho de pelúcia!");
            }
            break;

            case 3:
            if (cartao.getSaldoTicket() < 300) {
                System.out.println("ATENÇÃO!");
                System.out.println("Saldo insuficiente para o prêmio escolhido");
            }
            else {
                cartao.setSaldoTicket(cartao.getSaldoTicket() - 300);
                System.out.println("PARABÉNS!");
                System.out.println("Você ganhou: Skate!");
            }
            break;

            default:
                System.out.println("ATENÇÃO!");
                System.out.println("Escolha inválida, por favor tentar novamente!");
            break;
        }
    }

}
