package modelo;


public abstract class Descuento {
    
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public abstract double valorFinal(double valorInicial);
    
}
