package HotelMascotas;


public class Cliente{
    private String nombreCliente;
    private int CantMascotas;


    public Cliente(String nombreCliente, int CantMascotas){
        this.nombreCliente = nombreCliente;
        this.CantMascotas = CantMascotas;

    }

    public String getnombreCliente(){
        return this.nombreCliente;
    }

    public String getCliente(){
        return "Nombre: " + this.name + ". Cantidad de Animales: " + this.CantMascotas + ".";
    }

    public int getCantidadMascotas(){
        return this.CantMascotas;
    }
}