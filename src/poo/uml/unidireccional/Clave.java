package poo.uml.unidireccional;

public class Clave {
   /**
     * ************ ATRIBUTOS *********************
     */
    private String codigo;
    /**
     * ************ MËTODOS *********************
     */   
    public Clave() {
        this.codigo="";
    }
    public Clave(String codigo) {
        this.codigo = codigo;
    }
    public void verDatosClave(){
        System.out.println("Codigo: "+codigo);
    }
}

