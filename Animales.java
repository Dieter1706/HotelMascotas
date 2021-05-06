

public class Animales{
    private String nombreAnimal;
    private int tamañoAnimal;
    private String especie;
    private int comportamiento;
    private String categoria;
    private String tipo;
    private int precio;


    public Animales(String nombreAnimal, int tamañoAnimal, String especie, int comportamiento, String categoria){
        this.nombreAnimal = nombreAnimal;
        this.tamañoAnimal = tamañoAnimal;
        this.especie = especie;
        this.comportamiento = comportamiento;
        this.categoria = categoria;
    }

    public String getNombreAnimal(){
        return this.nombreAnimal;
    }

    public String getAnimal(){
        return "Nombre: " + this.name + ". Tamaño: " + this.tamañoAnimal + ". Especie: " + this.especie + ". Comportamiento: " + this.comportamiento + ". Categoria: " + this.categoria + ".";
    }

    public String getPrecioAnimal(){
        return this.precio;
    }

    public String getTamañoAnimal(){
        return this.tamañoAnimal
    }
}