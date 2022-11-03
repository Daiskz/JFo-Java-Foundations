package Secao7;

public class Jogo {
    private String nomeJogo;
    private int quantidadeCreditos;
    private String monitorLCD;
    private String leitorCartaoMagnetico;

    public String getNomeJogo() {
        return nomeJogo;
    }
    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }
    public int getQuantidadeCreditos() {
        return quantidadeCreditos;
    }
    public void setQuantidadeCreditos(int quantidadeCreditos) {
        this.quantidadeCreditos = quantidadeCreditos;
    }
    public String getMonitorLCD() {
        return monitorLCD;
    }
    public void setMonitorLCD(String monitorLCD) {
        this.monitorLCD = monitorLCD;
    }
    public String getLeitorCartaoMagnetico() {
        return leitorCartaoMagnetico;
    }
    public void setLeitorCartaoMagnetico(String leitorCartaoMagnetico) {
        this.leitorCartaoMagnetico = leitorCartaoMagnetico;
    }

    public void passarCartaoParaJogar(Cartao cartao) {
        int saldoDoCartao = cartao.getSaldoAtual();
        if (saldoDoCartao >= quantidadeCreditos) {
            //Isso reduz o saldo de créditos
            cartao.setSaldoAtual(saldoDoCartao - quantidadeCreditos);
            //Mas dá um número aleatório e não negativo de tickets
            int ticketsGanhos = 5;
            //Imprima o número do cartão e o número de tickets ganhos, junto com o novo total
            System.out.format("Pode Jogar! %d %d %d", cartao.getNumeroCartao(), ticketsGanhos, cartao.getSaldoAtual());

        }
        else {
            //Imprima uma mensagem se um cartão tiver saldos insuficientes
            System.out.print("Creditos insuficientes");
        }

    }

}
