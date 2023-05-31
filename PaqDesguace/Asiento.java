package pDesguace.PaqDesguace;

public class Asiento extends Pieza{

    private String material;
    private String color;
    private String tipo;
    private int incremento;

    public Asiento(int numPieza, String descripción, double precio, int stock, String material, String color, String tipo) {
        super(numPieza, descripción, precio, stock);
        this.material = material;
        this.color = color;
        this.tipo = tipo;
    }

    @Override
    public double calcularPrecio() {
        return precio + incremento;
    }

    }
