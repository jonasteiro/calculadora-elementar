public class Calculadora {
    private double primeiroNumero;
    private double segundoNumero;
    private double resultado;

    public Calculadora(double a, double b){
        this.primeiroNumero = a;
        this.segundoNumero = b;
        this.resultado = 0.0;
    }

    public void somar(){
        this.resultado = this.primeiroNumero + this.segundoNumero;
    }

    public void subtrair(){
        this.resultado = this.primeiroNumero - this.segundoNumero;
    }

    public void mostrarResultado(){
        System.out.println(this.resultado);
    }
}