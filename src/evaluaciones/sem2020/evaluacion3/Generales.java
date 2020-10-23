
package evaluaciones.sem2020.evaluacion3;
public class Generales extends Multa{
    private String marca;
    private String tipoCarroceria;

    public Generales(String marca, String tipoCarroceria, String placa, int codBarra, String distrito, double pesoVehiculo, Policia policia) {
        super(placa, codBarra, distrito, pesoVehiculo, policia);
        this.marca = marca;
        this.tipoCarroceria = tipoCarroceria;
    }

  

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }
    
    

    @Override
    public long generarTicket() {
        
        long id = (long) (8000 + Math.random()*(9500-8000));
        if (id%2 ==0) id=id+1;
        return id;
    }

    @Override
    public String mostrar() {
        return super.mostrar()+"\n"+
                "Marca: "+marca+"\n"+
                "Tipo Carroceria: "+tipoCarroceria;
                
    }
    
    
    
}
