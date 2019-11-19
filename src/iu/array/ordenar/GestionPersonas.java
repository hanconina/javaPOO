package iu.array.ordenar;

public class GestionPersonas {

    private Persona[] lista;
    private int n;

    public GestionPersonas() {
        lista = new Persona[100];
    }

    public void adicionar(Persona persona) {
        if (n < lista.length) {
            lista[n] = persona;
            n++;
        }
        
    }

    public int ubicacion(int dni) {
        for (int i = 0; i < lista.length; i++) {
            Persona p = (Persona) lista[i];
            if (p.getDni() == dni) {
                return i;
            }
        }
        return -1;
    }
    public Persona iesimo(int pos){
        return lista[pos];
    }
    public Persona[] listar(){
        return lista;
    }
    public int longitud(){
        return n;
    }

}
