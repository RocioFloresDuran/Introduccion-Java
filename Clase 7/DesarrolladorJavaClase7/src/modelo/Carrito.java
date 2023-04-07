package modelo;

import java.time.LocalDate;


public class Carrito {
    
    private int numeroCarrito;
    private ItemCarrito[] itemsCarrito = new ItemCarrito[3];
    private LocalDate fechaCompra;

    public Carrito() {
    }

    public Carrito(int numeroCarrito) {
        this.numeroCarrito = numeroCarrito;
        this.fechaCompra = LocalDate.now();
    }
    
    public double calcularTotal(Descuento descuento){
        double total = 0;
        for (int i = 0; i<3; i++){
            total += this.itemsCarrito[i].calcularSubTotal();
        }
        return descuento.valorFinal(total);
    }

    public int getNumeroCarrito() {
        return numeroCarrito;
    }

    public void setNumeroCarrito(int numeroCarrito) {
        this.numeroCarrito = numeroCarrito;
    }

    public ItemCarrito[] getItemsCarrito() {
        return itemsCarrito;
    }

    public void setItemsCarrito(ItemCarrito[] itemsCarrito) {
        this.itemsCarrito = itemsCarrito;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }    
    
}
