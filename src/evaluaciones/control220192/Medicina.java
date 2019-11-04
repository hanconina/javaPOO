
package evaluaciones.control220192;

public class Medicina extends Producto{
    private Fecha fechaVencimiento;

    public Medicina(Fecha fechaVencimiento, String codigo, String nombreComercial, double precioUnitario, int stock) {
        super(codigo, nombreComercial, precioUnitario, stock);
        this.fechaVencimiento = fechaVencimiento;
    }
    
    @Override
    public void escribir(){
        System.out.println("Medicina: ");
        super.escribir();
        System.out.println("Fecha de vencimiento: ");
        this.fechaVencimiento.escribir();
    }

    
    
    public boolean estaVencido(int anioActual){
        return (anioActual - fechaVencimiento.getAnio())<0;
    }
    
}
