package Secao8;

public class Jogo {
    private int id;
    private String equipeA;
    private String equipeB;
    private int golsEquipeA;
    private int golsEquipeB;
    private double temperatura;

    public String getEquipeA() {
        return equipeA;
    }
    public String getEquipeB() {
        return equipeB;
    }
    public int getGolsEquipeA() {
        return golsEquipeA;
    }
    public int getGolsEquipeB() {
        return golsEquipeB;
    }
    public int getId() {
        return id;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public void setEquipeA(String equipeA) {
        this.equipeA = equipeA;
    }
    public void setEquipeB(String equipeB) {
        this.equipeB = equipeB;
    }
    public void setGolsEquipeA(int golsEquipeA) {
        this.golsEquipeA = golsEquipeA;
    }
    public void setGolsEquipeB(int golsEquipeB) {
        this.golsEquipeB = golsEquipeB;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
