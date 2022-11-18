package Secao8;

import java.util.Scanner;

public class TesteLiga {
    public static void main(String[] args) {
        LigaFutebol liga = new LigaFutebol();

        Scanner entrada = new Scanner(System.in);
        
        int TemperaturasBaixasEmSequencia = 3;
        double TemperaturaDoJogo;

        while (TemperaturasBaixasEmSequencia > 0) {
            //ler os dados dos jogos
            TemperaturaDoJogo = entrada.nextDouble();
            if (TemperaturaDoJogo > 0) {
                //input de 2 jogos
                Jogo jogo1 = new Jogo();
                
                jogo1.setEquipeA(entrada.nextLine());
                jogo1.setEquipeB(entrada.nextLine());
                jogo1.setGolsEquipeA(entrada.nextInt());
                jogo1.setGolsEquipeB(entrada.nextInt());
                jogo1.setTemperatura(TemperaturaDoJogo);

                Jogo jogo2 = new Jogo();
                jogo2.setEquipeA(entrada.nextLine());
                jogo2.setEquipeB(entrada.nextLine());
                jogo2.setGolsEquipeA(entrada.nextInt());
                jogo2.setGolsEquipeB(entrada.nextInt());
                jogo2.setTemperatura(TemperaturaDoJogo);

                liga.tabelaJogos.add(jogo2);

                TemperaturasBaixasEmSequencia = 3;
            } else {
                TemperaturasBaixasEmSequencia--;
            }
            entrada.close();
        }

        Jogo jogo1 = new Jogo();

        jogo1.setEquipeA("Flamengo");
        jogo1.setEquipeB("Palmeiras");
        jogo1.setGolsEquipeA(3);
        jogo1.setGolsEquipeB(3);
        jogo1.setTemperatura(25.0);
        
        Jogo jogo2 = new Jogo();
        jogo2.setEquipeA("Portuguesa");
        jogo2.setEquipeB("Nautico");
        jogo2.setGolsEquipeA(2);
        jogo2.setGolsEquipeB(1);
        jogo2.setTemperatura(18.0);

        liga.tabelaJogos.add(jogo1);

        liga.tabelaJogos.get(0);

        liga.tabelaJogos.remove(0);
    }
}
