package poo.herencia.ventana;

public class VentanaTitulo extends Ventana{
    // ATRIBUTOS
    private String titulo;
    // METODOS

    public VentanaTitulo() {
        super();
    }

    public VentanaTitulo(String titulo, int x, int y, int ancho, int alto) {
        super(x, y, ancho, alto);
        this.titulo = titulo;
    }
    public void desplazar(int dx, int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Titulo: "+titulo);
    }
    
    
}
