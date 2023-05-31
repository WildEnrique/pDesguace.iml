package pDesguace.PaqDesguace;

import pDesguace.PaqExcepciones.EstanteriaNoVaciaException;
import pDesguace.PaqExcepciones.NoCabeException;
import pDesguace.PaqExcepciones.PiezaIncorrectaException;

public class Desguace {
    private String nombre;
    private String CIF;
    private Pieza[][] piezas;

    public Desguace(int alto, int ancho) {
        piezas = new Pieza[alto][ancho];
    }

    public Desguace(String nombre, String CIF, int anchura, int altura) {
        this(anchura, altura);
        this.nombre = nombre;
        this.CIF = CIF;
    }

    public void añadirPieza(Pieza pieza, int x, int y) {
        piezas[x][y] = pieza;
    }

    public void mostrarPiezas() {
        for (int i = 0; i < piezas.length; i++) {
            for (int j = 0; j < piezas[i].length; j++) {
                if (piezas[i][j] != null) {
                    System.out.print(piezas[i][j].toString() + " ");
                } else System.out.print("null  ");

            }
            System.out.println();
        }
    }

    private boolean comprobarEstanteria(int f){
        try{
            for (int j = 0; j < piezas[f].length; j++) {//rrecorriendo los distintos valores de j
                if(piezas[f][j]!=null) return false;
                }
                return true;
        }catch (ArrayIndexOutOfBoundsException ex){
            return false;
        }
    }

    public double[] colocarPiezas(Pieza[] v , int f) throws EstanteriaNoVaciaException, NoCabeException, PiezaIncorrectaException{
        for (int i = 0; i < v.length; i++) {
            if(!(v[i] instanceof Volante) || !(v[i] instanceof Neumático)){
                throw new PiezaIncorrectaException();
            }
        }
        if(v.length>piezas[f].length){
            throw new NoCabeException();
        }
        if(comprobarEstanteria(f)){
            throw new EstanteriaNoVaciaException();
        }
            double[] p=new double[v.length];
        for (int i = 0, j=piezas[f].length-1; i< v.length;i++ , j--) {
           piezas[f][j]=v[i];
           p[i]=v[i].calcularPrecio();

        }
        return p;
    }
}

