package Secao7;
public class ProgramaFliperama {
    public static void main(String[] args) {
        Cartao cartao1 = new Cartao();
        Cartao cartao2 = new Cartao();
        cartao1.geraCartao();
        cartao2.geraCartao();
        Terminal.carregarSaldo(cartao1);
        Terminal.carregarSaldo(cartao2);
        Jogo.jogarJogo(cartao1);
        Jogo.jogarJogo(cartao2);
        Jogo.jogarJogo(cartao1);
        Jogo.jogarJogo(cartao2);
        Terminal.transferirSaldo(cartao1, cartao2);
        CategoriaPremio.ticketPremio(cartao2);
        Jogo.jogarJogo(cartao1);
        Jogo.jogarJogo(cartao1);
        CategoriaPremio.ticketPremio(cartao1);
    }
}
