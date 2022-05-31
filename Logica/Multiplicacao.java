package Logica;
public class Multiplicacao extends Operadores{

    private double X;
    private double Y;

    public Multiplicacao(){}

    @Override
    public double calcularResultado() {
        
        return X * Y;
    }

    @Override
    public String PreencherOperador() {
        // TODO Auto-generated method stub
        return "Multiplicação";
    };

    
}
