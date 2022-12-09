package Secao7;

import java.util.Random;

public class Cartao {
    private int saldoAtual;
    private int saldoTicket;
    private int numeroCartao;
    
    public void geraCartao() {
        Random random = new Random();
        this.numeroCartao = 0;
        for (int i = 0; i < 10; i++) {
            this.numeroCartao += random.nextInt(1, 99);
        }
        this.saldoAtual = 0;
        this.saldoTicket = 0;
    }
    public int getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    public int getSaldoTicket() {
        return saldoTicket;
    }
    public void setSaldoTicket(int saldoTicket) {
        this.saldoTicket = saldoTicket;
    }
    public int getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
