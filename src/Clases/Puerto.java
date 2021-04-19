package Clases;

import java.util.ArrayList;
import java.util.Arrays;

public class Puerto {
    private Amarre amarres[];
    private ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

    public Puerto(int cantAmarres) {
        amarres = new Amarre[cantAmarres];
        for (int i = 0; i < cantAmarres; i++) {
            amarres[i] = new Amarre(100 + i, i);
        }
    }

    public void amarreStatus(){
        for (Amarre item:amarres) {
            System.out.println(item.toString());
        }
    }

    public void setAlquiler(Cliente cliente, int indexAmarre, int fechaInical, int fechaFinal) {
        alquileres.add(new Alquiler(cliente, amarres[indexAmarre], cliente.getBarco(), fechaInical, fechaFinal));
        amarres[indexAmarre].setBarco(cliente.getBarco());
    }

    public void finalizarAlquiler(int index){
        alquileres.get(index).getAmarre().deleteBarco();
    }

    public Alquiler getAlquiler(int index){
        return alquileres.get(index);
    }

    public Amarre getAmarre(int index){
        return amarres[index];
    }
}
