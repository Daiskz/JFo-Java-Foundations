package Secao4;
import java.lang.Math;
import java.util.Random;

public class ComputeMethods {
    public double fToC(double degreesF){
        double degreesC = 0;
        degreesC = 5 / 9 * (degreesF - 32);
        return degreesC;
    }

    public double hypotenuse(int a, int b) {
        double c = 0;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;

    }

    public int roll() { 
        Random dado1 = new Random();
        Random dado2 = new Random();

        int soma;
        soma = 2 + dado1.nextInt(6) + dado2.nextInt(6);
        return soma;
    }
    
}
