package array.casoalmacen;
public class InventarioDeProductos {
    public static void main(String[] args) {
        ControlAlmacen ca = new ControlAlmacen();
        ca.leerDatosTipos();
        ca.leerTabla();
        ca.reporteTotales();
        ca.mostrar();
        ca.mostrarAlmacenes();
        ca.mostrarTiposProductos();
    }
    
}
