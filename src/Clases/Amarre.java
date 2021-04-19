package Clases;

public class Amarre {

    private int identificador;
    private int posicion;
    private boolean isFree = true;
    private Barco barco;

    public Amarre(int identificador, int posicion) {
        this.identificador = identificador;
        this.posicion = posicion;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
        isFree = false;
    }

    public void deleteBarco(){
        barco = null;
        isFree = true;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean isFree() {
        return isFree;
    }

    public Barco getBarco() {
        return barco;
    }

    @Override
    public String toString() {
        return "Amarre{" +
                "identificador=" + identificador +
                ", posicion=" + posicion +
                ", isFree=" + isFree +
                ", barco=" + barco +
                '}';
    }
}
