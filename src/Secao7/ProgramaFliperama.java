package Secao7;
public class ProgramaFliperama {
    public static void main(String[] args) throws Exception{
        
        Jogo asteroids;
        asteroids = new Jogo();

        asteroids.setNomeJogo("Asteroids Atari");
        asteroids.setQuantidadeCreditos(50);
        
        Cartao cartao1;
        Cartao cartao2;
        cartao1 = new Cartao();
        cartao2 = new Cartao();

        cartao1.setSaldoAtual(100);
        cartao2.setSaldoAtual(200);

        asteroids.passarCartaoParaJogar(cartao1);

        System.out.print(cartao1.getSaldoAtual());

        Terminal t1 = new Terminal();

        t1.transferirCredito(cartao1, cartao2, 100);

    }
}
