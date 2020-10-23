package poo.interfaces.ejemplo.acumulador;

public class Acumulador implements Modificacion{
    private int valor;
    // Constructor
    public Acumulador (int valor){
        this.valor = valor;
    }
    public int darValor(){
        return this.valor;
    }
    @Override
    public void incremento(int a){
        //this.valor = this.valor + a;
        this.valor +=a;        
    }
   
}
