package Secao8;

public class TesteLiga {
    public static void main(String[] args) {
        Time equipeA = new Time("Equipe A");
        Time equipeB = new Time("Equipe B");
        Time equipeC = new Time("Equipe C");
        Time equipeD = new Time("Equipe D");

        Jogo jogo1 = new Jogo();
        jogo1.jogoPartida(equipeA, equipeB);

        Jogo jogo2 = new Jogo();
        jogo2.jogoPartida(equipeC, equipeD);

        Jogo jogo3 = new Jogo();
        jogo3.jogoPartida(equipeB, equipeC);

        Jogo jogo4 = new Jogo();
        jogo4.jogoPartida(equipeA, equipeD);

        System.out.println(equipeA.toString());
        System.out.println(equipeB.toString());
        System.out.println(equipeC.toString());
        System.out.println(equipeD.toString());
    }
}
