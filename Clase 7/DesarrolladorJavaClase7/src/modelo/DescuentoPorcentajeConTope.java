package modelo;

public class DescuentoPorcentajeConTope extends Descuento {
    
    double tope;

    public DescuentoPorcentajeConTope(double valor, double tope) {
        this.setValor(valor);
        this.tope = tope;
    }

    public DescuentoPorcentajeConTope() {
        this.setValor(0);
        this.tope = 0;
    }
    
    @Override
    public double valorFinal(double valorInicial){
        
        double desc = valorInicial * this.getValor();
        
        if(desc < tope){
            return valorInicial - desc;
        }
        else {
            return valorInicial - tope;
        }
    }

    public double getTope() {
        return tope;
    }

    public void setTope(double tope) {
        this.tope = tope;
    }      
}
