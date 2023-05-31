package pDesguace.PaqDesguace;

public class Volante extends Pieza {
    
    private String material;
    private int numeroRadios;
    private int porcentajeDescuento;

    public Volante(int numPieza, String descripción, double precio, int stock, String material, int numeroRadios) {
        super(numPieza, descripción, precio, stock);
        this.material = material;
        this.numeroRadios = numeroRadios;
    }

    @Override
    public double calcularPrecio() {
        return precio - porcentajeDescuento*precio/100;
    }


}
