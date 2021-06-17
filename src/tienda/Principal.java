package src.tienda;

import src.peliculas.VectorPeliculas;
import src.clientes.VectorClientes;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private VectorPeliculas tablaPeliculas = new VectorPeliculas();
    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("\n\n  ***  Bienvenido a memorabilia  *** \n\n");
            System.out.println("1) Crear clinente ");
            System.out.println("2) Mostrar clientes registrados");
            System.out.println("3) Ordenar Clientes Ascentemento respecto al nombre");
            System.out.println("4) Ordenar Clientes Descendente respecto al nombre");
            System.out.println("5) crear peliculas");
            System.out.println("6) mostrar peliculas registradas"); 
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

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
