
package poo.uml.unidireccionalUnoVarios;

public class Perro {
    /*************ATRIBUTOS ***************/
    private String nombre;
    private String raza;
    // METODOS
    public Perro(){
        nombre = "";
        raza = "";
    }
    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    public void mostrarPerro(){
        System.out.println("Nombre Mascota: "+nombre+" Raza: "+raza);
    }
}
