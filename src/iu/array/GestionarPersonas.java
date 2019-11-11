package iu.array;

public class GestionarPersonas {
    private Persona[] arreglo = new Persona[100];
    private int n = 0;

    public Persona[] getArreglo() {
        return arreglo;
    }
   
    public void add(Persona persona){
        if (n<arreglo.length){
            arreglo[n]=persona;
            n++;
        }
    }
    public void remove(int dni){
        
    }
    
}
