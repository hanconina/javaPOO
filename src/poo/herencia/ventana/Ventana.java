package poo.herencia.ventana;

public class Ventana {

    // ATRIBUTOS
    // Posición de la esquina superior izquierda
    protected int x;
    protected int y;
    // Dimensiones
    private int ancho;
    private int alto;
    // METODOS

    public Ventana() {
        this.x = 0;
        this.y = 0;
        this.ancho = 0;
        this.alto = 0;
    }

    public Ventana(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public void mostrar(){
        System.out.println("Posición: "+"("+x+","+y+")");
        System.out.println("Dimensiones: Ancho = "+ancho+" alto = "+alto);
    }
    public void cambiarDimensiones(int nuevoAncho, int nuevoAlto){
        this.ancho = nuevoAncho;
        this.alto = nuevoAlto;
    }
}
