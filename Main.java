package pDesguace;

import pDesguace.PaqDesguace.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Desguace desguace = new Desguace(5, 10);

        for (int i = 0; i < 10; i++) {
            desguace.añadirPieza(new Neumático(200 + i, "Neumático", 300 + i, 10, 10, "H"), 0, i);
        }
        Neumático[] N = new Neumático[10];
        for (int i = 0; i < N.length; i++) {
            N[i] = new Neumático(100 + i, "Neumático", 100 + i, 10, 10, "H");
        }

    }
}
