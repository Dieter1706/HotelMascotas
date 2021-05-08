package HotelMascotas;

public class Disponibilidad{
    private int cupoHabitaciones;
    private int horario;
    

    public Disponibilidad(int cupoHabitaciones, int horario){
        this.cupoHabitaciones = cupoHabitaciones;
        this.horario = horario;
    }

    public boolean estaLlena(){
        if (Habitaciones.getCapacidad() == 0){
            return true;
        }else{
            return false;
        }
    }
}