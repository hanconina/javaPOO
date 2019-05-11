package poo.claseabstracta;
public abstract class Forma {
    private String nombre;
    public Forma() {
    }
    public Forma(String nombre) {
        this.nombre = nombre;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Area: "+area());
    }
    public abstract double area();
}
