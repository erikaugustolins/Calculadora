package Logica;
public class Division extends Operadores{

    private double X;
    private double Y;

    public Division(){}

    @Override
    public double calcularResultado() {
        
        return X / Y;
    }

    @Override
    public String PreencherOperador() {
        // TODO Auto-generated method stub
        return "Divisão";
    };

    
}
