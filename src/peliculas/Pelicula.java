package src.peliculas;


public class Pelicula {

    private int id;
    private String nombre;
    private int año;
    private String categoria;
    private boolean disponible;

    public Pelicula(int id, String nombre, int año, String categoria, boolean disponible){
        this.id = id;
        this.nombre = nombre;
        this.año= año;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    //getters y setters

    public int getId(){
        return id;
    }

    public int getAño(){
        return año;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAño(int año){
        this.año = año;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;

    }

    //fin getters y setters

    public String getInformacion(){
        String resultado = "Id: "+id+" Nombre de la pelicula: " + nombre + " Año de publicacion: " + año + + " Categoria " + categoria + " Disponible: " + disponible;
        return resultado;
    }
    
}