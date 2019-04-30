package poo.herencia;

public class ClasePadre {
    // ATRIBUTOS
    private int atributoSuperClase;
    // MÉTODOS
    public ClasePadre() { // Constructor de ClasePadre
        this.atributoSuperClase = 0;
    }

    public ClasePadre(int atributoSuperClase) {
        this.atributoSuperClase = atributoSuperClase;
    }

    public void metodoClasePadre(){
        this.atributoSuperClase++;
    }
}
