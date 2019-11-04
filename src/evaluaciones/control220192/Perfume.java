package evaluaciones.control220192;

public class Perfume extends Producto {


    public Perfume(String codigo, String nombreComercial, double precioUnitario, int stock) {
        super(codigo, nombreComercial, precioUnitario, stock);
    }

    public void notificarAlerta() {
        if (super.getStock() < 10) {
            System.out.println("Stock limitado");
        }
    }



}
