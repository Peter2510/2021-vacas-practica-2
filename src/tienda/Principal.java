package src.tienda;

import src.peliculas.VectorPeliculas;
import src.clientes.VectorClientes;

public class Principal {

    public static void main(String[] args){
        Principal paginaPrincipal = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private VectorPeliculas tablaPeliculas = new VectorPeliculas();
    public Principal(){

        int menu = 0;

        while(menu != 9){
            System.out.println("\n\n  ***  Bienvenido a memorabilia  *** ");
            System.out.println("\n ***  SELECCIONA  UNA OPCION  *** \n\n");
            System.out.println("1. Crear registro de cliente ");
            System.out.println("2. Mostrar clientes registrados en la tienda");
            System.out.println("3. Ordenar clientes ascentemente respecto al nombre");
            System.out.println("4. Ordenar clientes descendente respecto al nombre");
            System.out.println("5. Crear registro de pelicula");
            System.out.println("6. Mostrar peliculas registradas"); 
            System.out.println("9) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", false);

            if (menu == 1 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }
            if (menu == 5){
                //crear pelicula
                tablaPeliculas.agregarPelicula();
            }
            if (menu == 6){
                //mostrar peliculas
                tablaPeliculas.mostrarPeliculas();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }

        }

    }

    
}
