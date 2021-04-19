package Clases;

public class Barco {
    private int matricula;
    private int eslora;
    private int anioFabricacion;

    public Barco(int matricula, int eslora, int anioFabricacion){
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula=" + matricula +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
