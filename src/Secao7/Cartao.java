package Secao7;

public class Cartao {
    private int saldoAtual;
    private int saldoTickets;
    private int numeroCartao;


    public int getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(int novoNumeroCartao) {
        numeroCartao = novoNumeroCartao;
    }
    public int getSaldoTickets() {
        return saldoTickets;
    }
    public void setSaldoTickets(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }
    public int getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}
