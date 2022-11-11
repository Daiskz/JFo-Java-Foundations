package Secao4;

public class TestClass {
    public static void main(String[] args) {
        ComputeMethods calculadora = new ComputeMethods();
        System.out.print("Converte: " + calculadora.fToC(150) + " Graus ");
        System.out.print("Hipotenusa: " + calculadora.hypotenuse(5, 6) + " ");
        System.out.print("Dados: " + calculadora.roll() + " "); 
   }
}