package Logica;
public class Subtrair extends Operadores{

    private double X;
    private double Y;

    public Subtrair(){}

    @Override
    public double calcularResultado() {
        
        return X - Y;
    }

    @Override
    public String PreencherOperador() {
        // TODO Auto-generated method stub
        return "Subtração";
    };

    
}
