import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        double numeroDois = scanner.nextDouble();

        Calculadora calculadora = new Calculadora(numeroUm, numeroDois);

        System.out.println("Soma: ");
        calculadora.somar();
        calculadora.mostrarResultado();

        System.out.println("Subtração: ");
        calculadora.subtrair();
        calculadora.mostrarResultado();
        
        scanner.close();
    }
}