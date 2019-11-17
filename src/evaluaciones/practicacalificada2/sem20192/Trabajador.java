package evaluaciones.practicacalificada2.sem20192;

public class Trabajador {
    private int codigo;
    private String nombres;
    private String tipo;
    private boolean habilitado;
    private Fecha fechaIngreso;

    public Trabajador(int codigo, String nombres, String tipo, boolean habilitado, Fecha fechaIngreso) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.tipo = tipo;
        this.habilitado = habilitado;
        this.fechaIngreso = fechaIngreso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    
    
}
