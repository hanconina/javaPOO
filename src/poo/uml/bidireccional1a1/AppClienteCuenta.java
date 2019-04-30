package poo.uml.bidireccional1a1;

public class AppClienteCuenta {

    public static void main(String[] args) {
        Cliente cliente
                = new Cliente(24002542, "Juan", null);
        Cuenta cuenta = new Cuenta(10, 200.0f, cliente);
        cliente.cambiarCuenta(cuenta);
        System.out.println("*****Mostrar Información de Cliente****");
        cliente.verDatosCliente();
        cliente.verCuentaBancaria();
        System.out.println("*****Mostrar Información de Cuenta****");
        cuenta.verDatosCuenta();
        cuenta.verPropietario();
    }
}
