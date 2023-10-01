package testComposicion;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    
    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
         this.cuenta = new Cuenta(0);
    }
    
     public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\n" + cuenta;
    }
}
