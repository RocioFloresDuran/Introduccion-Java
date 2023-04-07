package modelo;


public class DescuentoPorcentaje extends Descuento {
    
    public DescuentoPorcentaje(double valor) {
        this.setValor(valor);
    }

    public DescuentoPorcentaje() {
        this.setValor(0);
    }
    
    @Override
    public double valorFinal(double valorInicial){
        return valorInicial - (valorInicial * this.getValor());
    }
    
}
