public class Cliente{
    private String nombreCliente;
    private int CantMascotas;
    private int CantDias;
    private int Descuentos;
    private int Medio;

    public Cliente(String nombreCliente, int CantMascotas, int CantDias, int Descuentos, int Medio){
        this.nombreCliente = nombreCliente;
        this.CantMascotas = CantMascotas;
        this.CantDias = CantDias;
        this.Descuentos = Descuentos;
        this.Medio = Medio;
    }

    public String getnombreCliente(){
        return this.nombreCliente;
    }

    public String getCliente(){
        return "Nombre: " + this.name + ". Cantidad de Animales: " + this.CantMascotas + ".";
    }

    public int getCantidadMascotas(){
        return this.Cantidad;
    }
}