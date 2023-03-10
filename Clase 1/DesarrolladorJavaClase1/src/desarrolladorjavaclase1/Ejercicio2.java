package desarrolladorjavaclase1;


public class Ejercicio2 {
    
     public static void main(String[] args) {

        double ingresosMensuales = 500000;
        int numeroVehiculos = 0;
        int numeroInmuebles = 0;
        boolean activos = false;
        boolean embarcaciones = true;
        boolean aeronaves = false;
        
        if(ingresosMensuales >= 489083 || numeroVehiculos >= 3 
           || numeroInmuebles >=3 || activos || embarcaciones || aeronaves){
            System.out.print("La persona pertenece al segmento de Ingresos Altos ");
        }
        else{
            System.out.print("La persona NO pertenece al segmento de Ingresos Altos ");
        }
            
    }
}
