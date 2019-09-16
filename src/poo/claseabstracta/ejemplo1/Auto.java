package poo.claseabstracta.ejemplo1;

public class Auto extends Vehiculo{
    private boolean descapotable;
    Auto(String placa, int capacidadMotor, boolean descapotable){
        super(placa, capacidadMotor);
        this.descapotable = descapotable;
    }
    public String getInfo(){
        return super.getInfo() + "\n"+
                "Descapotable: "+descapotable;
    }
    public void descapotar(boolean descapotable){
        this.descapotable = descapotable;
    }
            
}
