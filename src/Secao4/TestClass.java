package Secao4;

public class TestClass {
    public static void main(String[] args) {
        ComputeMethods calculadora = new ComputeMethods();
        System.out.println("Converte: " + calculadora.fToC(100.4) + " Graus ");
        System.out.println("Hipotenusa: " + calculadora.hypotenuse(9, 6) + " ");
        System.out.println("Dados: " + calculadora.roll() + " ");
        ProcessName.processadorNome();
   }
}