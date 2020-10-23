package evaluaciones.sem2020.evaluacion3;

public class VelocidadMulta extends Multa implements NuevoCalculo {

    private String calle;
    private double velocidadMax;
    private double velocidadVehiculo;

    public VelocidadMulta(String calle, double velocidadMax, double velocidadVehiculo, String placa, int codBarra, String distrito, double pesoVehiculo, Policia policia) {
        super(placa, codBarra, distrito, pesoVehiculo, policia);
        this.calle = calle;
        this.velocidadMax = velocidadMax;
        this.velocidadVehiculo = velocidadVehiculo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getVelocidadVehiculo() {
        return velocidadVehiculo;
    }

    public void setVelocidadVehiculo(double velocidadVehiculo) {
        this.velocidadVehiculo = velocidadVehiculo;
    }

    @Override
    public long generarTicket() {
        long id = (long) (4000 + Math.random() * (8000 - 4000));
        if (id % 2 != 0) {
            id = id + 1;
        }
        return id;
    }

    @Override
    public double calcularMulta() {
        double velocidadExceso = 0;
        if (this.velocidadVehiculo > this.velocidadMax) {
            velocidadExceso = this.velocidadVehiculo - this.velocidadMax;
        }
        return MultaBase.base * (1 + velocidadExceso * MultaBase.base * 2 / 100);
    }

    @Override
    public String mostrar() {
        return super.mostrar() + "\n"
                + "Calle: " + calle + "\n"
                + "Velocidad Max: " + velocidadMax +"\n"+
                "Velocidad registrada: "+velocidadVehiculo;
    }
}
