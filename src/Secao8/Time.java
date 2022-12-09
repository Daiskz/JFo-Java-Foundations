package Secao8;

public class Time {
    private String nome;
    private int vitorias = 0;
    private int derrotas = 0;
    private int empates = 0;
    private int golsRealizados = 0;
    private int golsSofridos = 0;
    public Time(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getGolsRealizados() {
        return golsRealizados;
    }
    public void setGolsRealizados(int golsRealizados) {
        this.golsRealizados = golsRealizados;
    }
    public int getGolsSofridos() {
        return golsSofridos;
    }
    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }
    @Override
    public String toString() {
        return "time [Nome = " + nome + ", vitorias = " + vitorias + ", derrotas = " + derrotas + ", empates = " + empates
                + ", golsRealizados = " + golsRealizados + ", golsSofridos = " + golsSofridos + "]";
    }
}
