package evaluaciones.practicacalificada1.sem20192;
import java.util.Scanner;

public class Auto {
    // ATRIBUTOS
    private String placa;
    private String marca;
    private String modelo;
    // CONTRUCTORES
    public Auto() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
    }

    public Auto(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    // ACCESADORES Y MODIFICADORES

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    // OTROS
    public void imprimir(){
        System.out.println("Auto{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + '}');
    }
    public void leer(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese datos del Auto: ");
        System.out.print("Placa: ");
        this.placa = entrada.nextLine();
        System.out.print("Marca: ");
        this.marca = entrada.nextLine();
        System.out.print("Modelo: ");
        this.modelo = entrada.nextLine();
    }
}
