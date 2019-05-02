package poo.uml.unidireccional;
public class Usuario {
/**
     * ************ ATRIBUTOS *********************
     */
    private String nombre;
    private Clave clave;

    /**
     * ************ MÉTODOS *********************
     */
    public Usuario() {
        nombre = "";
        clave = null;
    }
    public Usuario(String nombre, Clave clave) {
        this.nombre = nombre;
        this.clave = clave;
    }
    public void verDatosUsuario(){
        System.out.println("Nombre: "+nombre+" Clave: "+clave);
        clave.verDatosClave();
    }
}

