package Clases;

public class Alquiler {
    private Cliente cliente;
    private Amarre amarre;
    private Barco barco;
    private int precio = 50;
    private int fechaInicial;
    private int fechaFinal;
    private int total;

    public Alquiler(Cliente cliente, Amarre amarre, Barco barco, int fechaInicial, int fechaFinal){
        this.cliente = cliente;
        this.amarre = amarre;
        this.barco = barco;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        Calcular();
    }

    private void  Calcular(){
        total = ((fechaFinal - fechaInicial) + 2) * precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "cliente=" + cliente +
                ", amarre=" + amarre +
                ", barco=" + barco +
                ", precio=" + precio +
                ", fechaInicial=" + fechaInicial +
                ", fechaFinal=" + fechaFinal +
                ", Total=" + total +
                '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Amarre getAmarre() {
        return amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public int getPrecio() {
        return precio;
    }

    public int getFechaInicial() {
        return fechaInicial;
    }

    public int getFechaFinal() {
        return fechaFinal;
    }

    public int getTotal() {
        return total;
    }
}
