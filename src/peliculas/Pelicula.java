package src.peliculas;


public class Pelicula {

    private int id;
    private String nombre;
    private int anio;
    private String categoria;
    private boolean disponible;

    public Pelicula(int id, String nombre, int anio, String categoria, boolean disponible){
        this.id = id;
        this.nombre = nombre;
        this.anio= anio;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    //getters y setters

    public int getId(){
        return id;
    }

    public int getAnio(){
        return anio;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;

    }

    //fin getters y setters

    public String getInformacion(){
        System.out.println("\n");
        String resultado = "Id: "+id+ " Año de publicacion: " + anio  +" Categoria " + categoria +  " Nombre de la pelicula: " + nombre +" Disponible: " + disponible ;
        return resultado;
    }
    
}