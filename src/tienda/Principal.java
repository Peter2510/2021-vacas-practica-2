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

        while(menu != 12){


            System.out.println("\n\n_______________________________   MENU   ______________________________________");
            System.out.println("\nSelecciona una opcion: ");
            System.out.println("\n1. Prestamo de peliculas ");
            System.out.println("2. Devolucion de peliculas ");
            System.out.println("3. Mostrar datos de las peliculas ");
            System.out.println("4. Registrar nueva pelicula ");
            System.out.println("5. Ordenar clientes ascentemente respecto al nombre: " );
            System.out.println("6. Ordenar clientes descendentemente respecto al nombre: " );
            System.out.println("7. Registrar nuevos clientes");
            System.out.println("8. Mostrar clientes registrados");
            System.out.println("9. Ordenar peliculas ascentemente respecto al nombre: " );
            System.out.println("10. Ordenar peliculas descendentemente respecto al nombre: " );
            System.out.println("11. Reportes");
            System.out.println("12. Salir");
    
            menu = IngresoDatos.getEntero("Ingrese una opción: ", false);



        
            if (menu == 1 ){
                
                if (tablaPeliculas.getContador()==1 || tablaClientes.getContador() ==1) {

                    
                    System.out.println("\n************************************");
                    System.out.println("\nDebes registrar al menos un cliente y una pelicula para continuar\n");
                    System.out.println("************************************");

                    
                }

                else{

                    System.out.println("\n______________________________________");
                    System.out.println("\nPeliculas registradas en la tienda\n");
                    tablaClientes.mostrarClientes();
                    System.out.println("Clientes registrados en la tienda");
                    tablaPeliculas.mostrarPeliculas();


                }

                
            }

            if (menu == 2){
                //tablaPeliculas.alquillar();
            }
            if (menu == 3){

                 if (tablaPeliculas.getContador()==1) {

                    
                    System.out.println("\n************************************");
                    System.out.println("\nAun no hay peliculas registradas\n");
                    System.out.println("************************************");

                    
                }

                else {

                    //mostrar peliculas
                    tablaPeliculas.mostrarPeliculas();
                    
                }

                
                
            }

            if (menu== 4 ){
              System.out.println("\n ****   Bienvenido al registro de peliculas   ****\n");
                //crear pelicula
                tablaPeliculas.agregarPelicula();

            }
            if (menu == 5){

                //ordnear ascendente
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 6){
                //ordnear descendente
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }
            if (menu == 7){
                 System.out.println("\nBienvenido al registro de clientes");
                tablaClientes.agregarCliente();
            }


            if (menu == 7){

                

                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }

            if (menu == 8){
                tablaClientes.mostrarClientes();
            
            }

             if (menu == 9){
                
                 //ordenar las peliculas ascendentes
                System.out.println("Desordenado:");
                tablaPeliculas.mostrarPeliculas();
                System.out.println("\n\nOrdenado:");
                tablaPeliculas.ordenarPorNombre(true);
                tablaPeliculas.mostrarPeliculas();
            
            }

             if (menu == 10){
                //ordnear descendentemente las peliculas
                System.out.println("Desordenado:");
                tablaPeliculas.mostrarPeliculas();
                System.out.println("\n\nOrdenado:");
                tablaPeliculas.ordenarPorNombre(false);
                tablaPeliculas.mostrarPeliculas();
            }

             if (menu == 11){
                //Reporte de las peliculas

                System.out.println("\n ***** Reporte de las peliculas ***** ");
                System.out.println("\nCantidad de peliculas en la tienda: " + (tablaPeliculas.getContador()-1) );
                System.out.println("\nPeliculas por categoria\n");
                System.out.println("Peliculas de drama registradas: "+tablaPeliculas.getContadorDrama());
                System.out.println("Peliculas de romance registradas: " +tablaPeliculas.getContadorRomantica());
                System.out.println("Peliculas de accion registradas: " +tablaPeliculas.getContadorAccion());
                System.out.println("Peliculas de comedia registradas: " +tablaPeliculas.getContadorComedia());


            }

              
        }

    }

    
}
