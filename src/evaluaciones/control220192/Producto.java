package evaluaciones.control220192;

public class Producto {
    private String codigo;
    private String nombreComercial;
    private double precioUnitario;
    private int stock;

    public Producto(String codigo, String nombreComercial, double precioUnitario, int stock) {
        this.codigo = codigo;
        this.nombreComercial = nombreComercial;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void escribir() {
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre comercia: " + nombreComercial);
        System.out.println("Precio Unitario: "+ precioUnitario);
        System.out.println("Stock: " + stock);
    }
    
    
    
    
    
}
