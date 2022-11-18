package Secao8;

import java.util.ArrayList;

public class LigaFutebol {
    private int [][] tabelaClassificacao;

    public ArrayList<Jogo> tabelaJogos;

    public LigaFutebol() {
        tabelaClassificacao = new int[4][6];
        tabelaJogos = new ArrayList<Jogo>();
    }

    public int[][] getTabelaClassificacao() {
        return tabelaClassificacao;
    }

    public void setTabelaClassificacao(int[][] tabelaClassificacao) {
        this.tabelaClassificacao = tabelaClassificacao;
    }
}
