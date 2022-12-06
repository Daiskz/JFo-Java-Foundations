package Secao4;

public class TestClass {
    public static void main(String[] args) {
        ComputeMethods calculadora = new ComputeMethods();
        System.out.println("Temperatura em celsius é: " + calculadora.fToC(100.4) + " Graus ");
        System.out.println("A hipotenusa é: " + calculadora.hypotenuse(9, 6) + " ");
        System.out.println("A soma dos dados é: " + calculadora.roll() + " ");
        ProcessName.processadorNome();
   }
}