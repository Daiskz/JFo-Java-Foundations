package Secao6;

public class LoopShape {
    public static void criarRetangulo (int largura, int altura) {
        for (int i = 0; i < largura ; i++) {
            if (i == largura - 1) {
                System.out.println("#");
            }
            else {
                System.out.print("#");
            }
        }
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("#");

            for (int j = 0; j < largura - 2; j++) {
                String espaco = " ";
                System.out.print(espaco);
            }
            System.out.println("#");
        }
        for (int i = 0; i < largura; i++) {
            if (i == largura - 1) {
                System.out.println("#");
            }
            else {
                System.out.print("#");
            }
        }
    }
    public static void criarTriangulo(int altura) {
        System.out.println("#");
        for (int i = 0; i < altura -2; i++) {
            System.out.print("#");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if (i != altura) {
                System.out.println("#");
            }
        }
        for (int i = 0; i < altura; i++) {
            System.out.print("#");
        }
        System.out.println("");
    }
}
