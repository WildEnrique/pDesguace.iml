package pDesguace.PaqDesguace;

public abstract class Pieza {
    protected int numPieza;
    protected String descripción;
    protected double precio;
    protected int stock;

    public Pieza(int numPieza, String descripción, double precio, int stock) {
        this.numPieza = numPieza;
        this.descripción = descripción;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.valueOf(numPieza);
    }

    public abstract double calcularPrecio();

}
