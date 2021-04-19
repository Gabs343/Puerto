package Clases;

public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    private Barco barco;

    public Cliente(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setBarco(int matricula, int eslora, int anioFabricacion){
        barco = new Barco(matricula, eslora, anioFabricacion);
    }

    public Barco getBarco() {
        return barco;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", barco=" + barco +
                '}';
    }
}
