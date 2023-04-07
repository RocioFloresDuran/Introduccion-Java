package modelo;


public class DescuentoFijo extends Descuento {

    public DescuentoFijo(double valor) {
        this.setValor(valor);
    } 

    public DescuentoFijo() {
        this.setValor(0);
    }
    
    @Override
    public double valorFinal(double valorInicial){
        return valorInicial - this.getValor();
    }
    
}
