package actividad05.pkg06;

public class AppMiExcepcion {
    public static void main(String[] args){
        validaPropia(89);
    }
    
    public static void validaPropia(int n){
        try {
            minimo(n);
            System.out.println(n+ " es mayor a 11");
        }
        catch(MiExcepcion e) {
            System.out.println("No me sirve ese numero");   
            System.out.println("Intenta de nuevo: " +  e.getMessage());

        }
    }
   
    public static void minimo(int numero) throws MiExcepcion{
        if(numero <= 11)
            throw new MiExcepcion("Necesito un numero mayor a 11");   
    }
}

