package actividades;
// Probamos la interfaz PorPagar
public class PruebaInterfazPorPagar {

    public static void main(String[] args) {
        // Creamos un arreglo PorPagar con cuatro elementos
        PorPagar[] objetosPorPagar = new PorPagar[5];
        //LLenamos el arreglo con objetos que implementan la interfaz PorPagar
        objetosPorPagar[0] = new Factura ("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura ("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado ("John", "Smith","111-11-1111" ,800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado ("Lisa", "Barnes","888-88-8888", 1200.00);
        //Añadimos un objeto de Prestamo
        objetosPorPagar[4] = new Prestamo(12, 1240.00);

        System.out.println("Facturas y Empleados procesados en forma polimorfica: \n");
        //Procesamos de forma génerica cada elemento en el arreglo
        for (PorPagar porPagarActual : objetosPorPagar){
            System.out.printf("%s \n%s: $%,.2f\n\n", porPagarActual.toString(), "Pago vencido", 
                    porPagarActual.obtenerMontoPago());
        }
    }  
}
