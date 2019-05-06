package poo.polimorfismo;

public class Consultor extends Persona {
    private String ruc;
    private String tipo;

    public Consultor() {
        
    }

    public Consultor(int dni, String nombres, String ruc, String tipo) {
        super(dni, nombres);
        this.ruc = ruc;
        this.tipo = tipo;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RUC: "+ruc);
        System.out.println("tipo: "+tipo);
    }
    
}
