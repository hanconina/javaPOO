package evaluaciones.practicacalificada1.sem20192;

public class JefeZona extends Empleado{

    private Secretaria secretaria;

    public JefeZona() {
        super();
        this.secretaria = null;
    }
    
    
    
    public JefeZona(Secretaria secretaria, String nombres, int DNI, String direccion, int antiguedad, String telefonoContacto, double salario) {
        super(nombres, DNI, direccion, antiguedad, telefonoContacto, salario);
        this.secretaria = secretaria;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    @Override
    public void imprimir() {
        System.out.println("Jefe de Zona: ");
        super.imprimir();
        System.out.println("Secreatria del Jefe de Zona: ");
        secretaria.imprimir();
    }
    
    @Override
    public void incrementarSalario(){
        super.setSalario(super.getSalario()+(1+0.2/12));
    }
    
    @Override
    public void leer(){
        System.out.println("Ingrese datos del Jefe de Zona: ");
        super.leer();
        secretaria= new Secretaria();
        System.out.println("Ingrese datos de la secretaria del Jefe de Area");
        secretaria.leer();
    }
    
    
    
    
    
}
