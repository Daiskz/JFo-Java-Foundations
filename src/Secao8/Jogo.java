package Secao8;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public void jogoPartida(Time time1, Time time2) {
        Scanner entrada = new Scanner(System.in);
        double temperatura;
        int contador = 0;
        System.out.println("Informe a temperatura: ");
        temperatura = entrada.nextDouble();
        if (temperatura > 0 && temperatura < 20) {
            temperaturaNormal(time1, time2);
        }
        else if (temperatura >= 20 && temperatura < 40) {
            temperaturaQuente(time1, time2);
        }
        else {
            System.out.println("Muito frio para jogar");
        }
    }
    private void temperaturaNormal(Time time1, Time time2) {
        Random r = new Random();
        int golsRealizadosTime1 = r.nextInt(1,5);
        int golsRealizadosTime2 = r.nextInt(1, 5);
        levantamentos(time1, time2, golsRealizadosTime1, golsRealizadosTime2);
    }
    private void temperaturaQuente(Time time1, Time time2) {
        Random r = new Random();
        int golsRealizadosTime1 = r.nextInt(1, 5);
        int golsRealizadosTime2 = r.nextInt(1, 5);
        levantamentos(time1, time2, golsRealizadosTime1, golsRealizadosTime2);
    }
    private void levantamentos(Time time1, Time time2, int golsRealizadosTime1, int golsRealizadosTime2) {
        time1.setGolsRealizados(golsRealizadosTime1);
        time2.setGolsRealizados(golsRealizadosTime2);
        time1.setGolsSofridos(golsRealizadosTime2);
        time2.setGolsSofridos(golsRealizadosTime1);
        if (golsRealizadosTime1 > golsRealizadosTime2) {
            time1.setVitorias(time1.getVitorias() + 1);
            time2.setDerrotas(time2.getDerrotas() + 1);
        }
        else if (golsRealizadosTime2 > golsRealizadosTime1) {
            time1.setDerrotas(time1.getDerrotas() + 1);
            time2.setVitorias(time2.getVitorias() + 1);
        }
        else {
            time1.setEmpates(time1.getEmpates() + 1);
            time2.setEmpates(time2.getEmpates() + 1);
        }
    }
}
