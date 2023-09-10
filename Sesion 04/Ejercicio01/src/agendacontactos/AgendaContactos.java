/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendacontactos;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContactos {
public static void main(String[] args) {
        ArrayList<Contacto> agenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu para la agenda de contactos");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Eliminar contactos");
            System.out.println("6. Mostrar contactos");
            System.out.println("7. Salir de la agenda");
            System.out.println("Ingrese una opcion: ");
            int opcion = scanner.nextInt();

            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese la dirección del contacto: ");
                    String direccion = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono, direccion);
                    agenda.add(nuevoContacto);
                    System.out.println("El contacto fue agregado ");
                    break;
                case 2:
                    System.out.print("\nIngrese el nombre del contacto que quiere buscar en la agenda: ");
                    String nombreBusqueda = scanner.nextLine();
                    boolean encontrado = false;
                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                            System.out.println("Contacto encontrado en la agenda:\n" + contacto);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contacto no encontrado en la agenda");
                    }
                    break;                  
                case 3:
                    System.out.print("\nIngrese el nombre del contacto que desea modificar: ");
                    String nombreModificar = scanner.nextLine();
                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.print("Ingresa un nuevo nombre: ");
                            String nuevoNombre = scanner.nextLine();
                            System.out.print("Ingresa un nuevo teléfono: ");
                            String nuevoTelefono = scanner.nextLine();
                            System.out.print("Ingresa una nueva dirección: ");
                            String nuevaDireccion = scanner.nextLine();

                            contacto.setNombre(nuevoNombre);
                            contacto.setTelefono(nuevoTelefono);
                            contacto.setDireccion(nuevaDireccion);

                            System.out.println("Contacto modificado ");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("\nIngrese el nombre del contacto que quiere borrar: ");
                    String nombreBorrar = scanner.nextLine();
                    Contacto contactoBorrar = null;
                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreBorrar)) {
                            contactoBorrar = contacto;
                            break;
                        }
                    }
                    if (contactoBorrar != null) {
                        agenda.remove(contactoBorrar);
                        System.out.println("\nContacto borrado de la agenda");
                    } else {
                        System.out.println("\nContacto no encontrado.");
                    }
                    break;
                case 5:
                    agenda.clear();
                    System.out.println("\nSe eliminaron todos los contactos");
                    break;
                case 6:
                    if (agenda.isEmpty()){
                        System.out.println("\nNo hay contactos");

                    } else {
                        System.out.println("\nLista de contactos:");
                        for (Contacto contacto : agenda) {
                            System.out.println(contacto);
                        }
                    }
                    break;
                case 7:
                    System.out.println("---------Salio de la agenda---------");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción invalida, seleccione un numero del 1 al 7");
            }
        }
    }
}
