package poo.interfaces.ejemplo.animales;


import poo.interfaces.ejemplo.animales.Mascota;

public class Gato extends Animal implements Mascota{
    private String nombre;
    
    public Gato(){
        super(4);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void jugar(){
        System.out.println("JUgar con la pelota y el gato");
    }
    // Implementacion del método abstracto de la clas abstracta animal
    @Override
    public void comer(){
        System.out.println("EL gato como sus comida de gato");        
    }
    
}
