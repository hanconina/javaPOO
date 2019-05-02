
package poo.uml.unidireccionalUnoVarios;
import java.util.LinkedList;

public class Persona {
    /********* ATRIBUTO ************/
    private String nombre;
    // Lista vacia
    private LinkedList<Perro> mascotas = new LinkedList<Perro>();

    // MÉTODOS
    public Persona() {
        nombre = "";
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public void adicionarMascota(Perro mascota){
        this.mascotas.add(mascota);
    }
    public void eliminarMascota(){
        this.mascotas.remove();
    }
    public void mostrarPersona(){
        System.out.println("Nombre: " +nombre);
    }
    public void mostrarMascotas(){
        for (int i=0;i<mascotas.size();i++){
            Perro oPerro = mascotas.get(i);
            oPerro.mostrarPerro();
        }        
    }
}