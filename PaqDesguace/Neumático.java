package pDesguace.PaqDesguace;

public class Neumático extends Pieza {

    int pulgadas;
    String marca;

    int siu;
    private final int costeFijo = 10;

    public Neumático(int numPieza, String descripción, double precio, int stock, int pulgadas, String marca) {
        super(numPieza, descripción, precio, stock);
        this.pulgadas = pulgadas;
        this.marca = marca;

    }

    @Override
    public double calcularPrecio() {
        return precio + costeFijo;
    }

}
