package evaluaciones.sem2020.evaluacion3;
public abstract class Multa implements MultaBase{
    protected String placa;
    protected long ticket;
    protected int codBarra;
    protected String distrito;
    protected double pesoVehiculo;
    protected Policia policia;
    
    public static int numMultas=0;

    public Multa(String placa, int codBarra, String distrito, double pesoVehiculo,
            Policia policia) {
        this.placa = placa;
        this.ticket = generarTicket();
        this.codBarra = codBarra;
        this.distrito = distrito;
        this.pesoVehiculo = pesoVehiculo;
        this.policia = policia;
        numMultas++;
    }
    public abstract long generarTicket();

    public Policia getPolicia() {
        return policia;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getTicket() {
        return ticket;
    }

    public void setTicket(long ticket) {
        this.ticket = ticket;
    }

    public int getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(int codBarra) {
        this.codBarra = codBarra;
    }

    public double getPesoVehiculo() {
        return pesoVehiculo;
    }

    public void setPesoVehiculo(double pesoVehiculo) {
        this.pesoVehiculo = pesoVehiculo;
    }

    public static int getNumMultas() {
        return numMultas;
    }

    public static void setNumMultas(int numMultas) {
        Multa.numMultas = numMultas;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
    public String mostrar(){
        return "Placa: "+placa+"\n"+
                "Ticket: "+ticket+"\n"+
                "Cod. Barra: "+codBarra+"\n"+
                "Distrito: "+distrito+"\n"+
                "Policia; "+policia.mostrar();
    }
    
    
    
    
}
