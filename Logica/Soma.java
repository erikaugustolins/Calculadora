package Logica;
public class Soma extends Operadores{

    private double X;
    private double Y;

    public Soma(){}

    @Override
    public double calcularResultado() {
        
        return X + Y;
    }

    @Override
    public String PreencherOperador() {
        // TODO Auto-generated method stub
        return "Soma";
    };

    
}
