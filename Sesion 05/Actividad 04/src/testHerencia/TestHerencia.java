package testHerencia;
public class TestHerencia {

    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel Cortina", 12345678, 28);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Juan Mota", 55333222, 30, "noche");
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Antonio Camino", 55333666, 35, "Granada");

        System.out.println("Datos del empleado 01:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("DNI: " + empleado1.getDni());
        System.out.println("Dias de Vacaciones: " + empleado1.getDiasVacaciones());

        System.out.println("\nDatos del empleado 02:");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("DNI: " + empleado2.getDni());
        System.out.println("Dias de Vacaciones: " + empleado2.getDiasVacaciones());
        System.out.println("Turno: " + empleado2.getTurno());

        System.out.println("\nDatos del empleado 03:");
        System.out.println("Nombre: " + empleado3.getNombre());
        System.out.println("DNI: " + empleado3.getDni());
        System.out.println("Dias de Vacaciones: " + empleado3.getDiasVacaciones());
        System.out.println("Region: " + empleado3.getRegion());
    }
}
