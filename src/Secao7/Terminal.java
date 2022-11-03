package Secao7;

public class Terminal {
    public void transferirCredito(Cartao c1, Cartao c2, int creditos) {
        int saldoDoCartaoC1 = c1.getSaldoAtual();
        int saldoDoCartaoC2 = c2.getSaldoAtual();
        if (saldoDoCartaoC1 >= creditos) {
            //transferir
            c1.setSaldoAtual(saldoDoCartaoC1 - creditos);
            c2.setSaldoAtual(saldoDoCartaoC2 + creditos);
            System.out.format("Saldo C1: %d Saldo C2: %d", c1.getSaldoAtual(), c2.getSaldoAtual());
        }
        else {
            //imprime mensagem que a transferência não é permitida
            System.out.println("Transferência não pode ser realizada");
        }
    }
    
}
