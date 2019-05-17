package evaluaciones.parcial1;

import java.util.LinkedList;

public abstract class Libro {
    // ATRIBUTOS
    private String titulo;
    private double precioUnitario;
    private int nroPaginas;
    // Lista de Autores del Libro
    private LinkedList<Autor> autores;
    // MÉTODOS
    // Constructor predeterminado
    public Libro() {
        this.titulo = "";
        this.precioUnitario = 0;
        this.nroPaginas = 0;
        autores = new LinkedList<Autor>();
    }

    // Constructor con parámetros
    public Libro(String titulo, double precioUnitario, int nroPaginas, LinkedList<Autor> autores) {
        this.titulo = titulo;
        this.precioUnitario = precioUnitario;
        this.nroPaginas = nroPaginas;
        this.autores = autores;
    }
    public double recuperarPrecioUnitario(){
        return precioUnitario;
    }
    public int recuperarNroPaginas(){
        return nroPaginas;
    }
    // Método para registrar un autor del Libro
    public void registrarAutor(Autor autor){
        autores.add(autor);
    }
    // Método para eliminar el último autor del libro
    public void removerAutor(){
        autores.remove();
    }
    // Método para mostrar todos los autores del libro
    private void mostrarAutores(){
        for (int i=0;i<autores.size();i++){
            Autor autorTemp = autores.get(i);
            autorTemp.mostrarAutor();
        }
    }
    // Método para mostrar la información del libro y sus autores
    public void mostrarLibro(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Precio Unitario: "+precioUnitario);
        System.out.println("Nro. de Páginas: "+nroPaginas);
        mostrarAutores();
    }
    // Método abstracto para calcular el precio de venta
    // Según los requerimientos no es posible determinar el 
    // precio de venta del libro porque los productos que se venden
    // son Libro Impreso y Electrónico
    public abstract double calcularPrecioVenta();       
}
