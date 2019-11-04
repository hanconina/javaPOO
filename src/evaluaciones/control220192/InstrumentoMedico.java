package evaluaciones.control220192;

public class InstrumentoMedico extends Producto {

    private String tipoMaterial;

    public InstrumentoMedico(String tipoMaterial, String codigo, String nombreComercial, double precioUnitario, int stock) {
        super(codigo, nombreComercial, precioUnitario, stock);
        this.tipoMaterial = tipoMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

}
