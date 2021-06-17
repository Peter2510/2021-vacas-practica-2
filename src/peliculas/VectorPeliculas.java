package src.peliculas;

import src.tienda.*;

public class VectorPeliculas {


    private Pelicula[] peliculas = new Pelicula[50];

    private int contador;
    private int contadorDrama = 0;
    private int contadorAccion=0;
    private int contadorRomantica=0;
    private int contadorComedia=0;
    


    public VectorPeliculas(){


        contador = 1;
    }


    public void agregarPelicula(String nombre, int anio, String categoria, boolean disponible){

        if (contador > 50){
            System.out.println("No es posible agregar mas peliculas ha sido alcanzado");
        }
        else{
            peliculas[(contador-1)] = new Pelicula(contador, nombre, anio, categoria, disponible);
        }
        contador++;
    }

    public void agregarPelicula(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula: ");
        int anio = IngresoDatos.getEntero("Ingrese el año de publicacion de la pelicula: ", false);
        //String categoria = IngresoDatos.getTexto("Ingrese la categoria: ");
        System.out.println("\nCategorias disponibles");
        System.out.println("1. Drama");
        System.out.println("2. Accion");
        System.out.println("3. Romantica");
        System.out.println("4. Comedia");
        System.out.println("categorias disponibles");
        int categoria = IngresoDatos.getEntero("La categoria correspondiente: ", false);
        boolean disponible = true;
            if (categoria == 1) {

            agregarPelicula(nombre, anio, "Drama", disponible);
            contadorDrama++;
    
            }

            if (categoria==2) {

                agregarPelicula(nombre, anio, "Accion", disponible);
                contadorAccion++;

           
                
            }

            if (categoria==3) {

                agregarPelicula(nombre, anio, "Romantica", disponible); 
                contadorRomantica++;   
          
                
            }

            if (categoria==4) {

                agregarPelicula(nombre, anio, "Comedia", disponible); 
                contadorComedia++;   
          
            }

        
    }



   public void mostrarPeliculas(){

        for (int i = 0; i < (contador-1); i++) {
            System.out.println(peliculas[i].getInformacion());
            
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

    public void cantidadPeliculas(){

     System.out.println("\nCantidad de peliculas en la tienda: " + (getContador()-1) );
    }

    public int getContadorDrama(){
        return contadorDrama;
    }

    public int getContadorAccion(){
        return contadorAccion;
    }

    public int getContadorRomantica(){
        return contadorRomantica;
    }

    public int getContadorComedia(){
        return contadorComedia;
    }



    
}
