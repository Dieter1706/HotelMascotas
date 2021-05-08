package HotelMascotas;

public class Reserva{
    private int cantDias;
    private int precioDias;
    private String medio;

    public Reserva(Int cantDias, String medio){
        this.cantDias = cantDias;
        this.medio = medio;
        this.precioDias = 1000*this.cantDias;
    }

    public Int getPrecioAnimal(){
        return this.precio;
    }
}