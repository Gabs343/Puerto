package com.mybank;
import Clases.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Puerto pt = new Puerto(10);

        Cliente cte = new Cliente(12345678, "Gabriel", "Lopez");
        Cliente cte2 = new Cliente(34398273, "Juan", "Martinez");

        cte.setBarco(1234567, 343, 2000);
        cte2.setBarco(93847293, 150, 2015);

        pt.setAlquiler(cte, 0, 25, 31);
        pt.setAlquiler(cte2, 5, 12, 25);

        System.out.println(pt.getAlquiler(0).toString());
        System.out.println(pt.getAlquiler(1).toString());

        pt.finalizarAlquiler(0);

        pt.amarreStatus();
    }
}
