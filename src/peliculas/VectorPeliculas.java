package src.peliculas;

import src.tienda.*;

public class VectorClientes {
    private Pelicua[] peliculas = new Pelicua[50];
    private int siguienteCodigo;

    public VectorPelicula(){
        siguienteCodigo = 1;
    }

    //agregar peliculas
    public void agregarPelicula(String nombre, int año, String categoria, boolean disponible){
        if (siguienteCodigo > 50){
            System.out.println("Límite de las peliculas ha sido alcanzado");
        }
        else{
            peliculas[(siguienteCodigo-1)] = new Pelicua(siguienteCodigo, nombre, año, categoria, disponible);
        }
        siguienteCodigo++;
    }

    public void agregarPelicula(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        int año = IngresoDatos.getEntero("Ingrese el año de publicacion de la pelicula", false);
        String categoria = IngresoDatos.getTexto("Ingrese la categoria");
        boolean disponible = true;
        agregarCliente(nombre, año, categoria, disponible);
    }



    // fin agregar clientes

    public void mostrarClientes(){
        System.out.println("\n\n Peliculas de memorabilia");
        for (int i = 0; i < (siguienteCodigo-1); i++) {
            System.out.println(i+") "+peliculas[i].getInformacion());
            //System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());
            
        }

        System.out.println("\n\n");
    }


    //Ordenamiento
    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguienteCodigo-1); i++) {
            for (int j = 0; j < (siguienteCodigo-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) > 0 );
                else 
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Cliente aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }

    }


    
}
