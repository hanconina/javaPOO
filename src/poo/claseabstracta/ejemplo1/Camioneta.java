
package poo.claseabstracta.ejemplo1;

public class Camioneta extends Vehiculo{
    Camioneta(String placa, int capacidadMotor, float carga){
        super(placa, capacidadMotor);
        this.carga = carga;
    }
    private float carga;    
    public String getInfo(){
        return super.getInfo() + "\n"+
                "Carga: "+carga;
    }
}
