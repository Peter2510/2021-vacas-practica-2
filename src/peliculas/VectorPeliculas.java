package src.peliculas;

import src.tienda.*;

public class VectorPeliculas {


    private Pelicula[] peliculas = new Pelicula[50];

    private int contador;

    public VectorPeliculas(){


        contador = 1;
    }


    public void agregarPelicula(String nombre, int anio, String categoria, boolean disponible){

        if (contador > 50){
            System.out.println("No es posible agreagar mas peliculas ha sido alcanzado");
        }
        else{
            peliculas[(contador-1)] = new Pelicula(contador, nombre, anio, categoria, disponible);
        }
        contador++;
    }

    public void agregarPelicula(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula: ");
        int anio = IngresoDatos.getEntero("Ingrese el año de publicacion de la pelicula: ", false);
        String categoria = IngresoDatos.getTexto("Ingrese la categoria: ");
        boolean disponible = true;
        agregarPelicula(nombre, anio, categoria, disponible);
    }



   public void mostrarPeliculas(){

        System.out.println("\nPeliculas de memorabilia");
        for (int i = 0; i < (contador-1); i++) {
            System.out.println(i+") "+peliculas[i].getInformacion());
            
        }

        System.out.println("\n\n");
    }


    //Ordenamiento
    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (contador-1); i++) {
            for (int j = 0; j < (contador-1-i); j++) {
                
                if (ascendente)
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) > 0 );
                else 
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) < 0 );

                if(cambio ){
                
                    Pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }

    }

    public int getContador(){

        return contador;

    }




    
}
