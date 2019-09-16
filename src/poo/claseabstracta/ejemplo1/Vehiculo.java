
package poo.claseabstracta.ejemplo1;

public class Vehiculo {
    private String placa;
    private int capacidadMotor;
    
    public Vehiculo(String placa, int capacidadMotor){
        this.placa = placa;
        this.capacidadMotor = capacidadMotor;
    }
    
    public String getInfo(){
        String info = "Placa: "+placa+"\n"+
                "motor: "+capacidadMotor;
        return info;
    }
   
}