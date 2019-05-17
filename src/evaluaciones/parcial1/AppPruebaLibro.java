package evaluaciones.parcial1;

import java.util.LinkedList;

public class AppPruebaLibro {

    public static void main(String[] args) {
        // Crear un libro Impreso
        // Crear una lista para autores del Libro
        LinkedList<Autor> autoresLibroImpreso = new LinkedList<Autor>();
        Libro libroImpreso = new LibroImpreso("POO", 85.00, 365, autoresLibroImpreso, 20, 40, 1.5);

        //Crear un libro electrónico
        // Crear un a lista para autores del Libro electrónico
        LinkedList<Autor> autoresLibroElectronico = new LinkedList<Autor>();
        Libro libroElectronico = new LibroElectronico("Base de Datos", 185.00, 569, autoresLibroElectronico, "PDF");

        // Crear los Autores para el Libro impreso y añadirlos a su lista
        Autor oAutor1 = new Autor("Juan", "Lima");
        Autor oAutor2 = new Autor("Ana", "Cusco");
        Autor oAutor3 = new Autor("Pepe", "Lima");
        libroImpreso.registrarAutor(oAutor1);
        libroImpreso.registrarAutor(oAutor2);
        libroImpreso.registrarAutor(oAutor3);
        

        // Crear los Autores para el Libro Electrónico y añadirlos a su lista
        Autor oAutor4 = new Autor("Carlos", "Lima");
        Autor oAutor5 = new Autor("Sonia", "Cusco");
        Autor oAutor6 = new Autor("Robert", "Lima");
        Autor oAutor7 = new Autor("Paul", "Lima");
        libroElectronico.registrarAutor(oAutor4);
        libroElectronico.registrarAutor(oAutor5);
        libroElectronico.registrarAutor(oAutor6);
        libroElectronico.registrarAutor(oAutor7);
        // Mostrar indormación del libro impreso y su precio de venta        
        System.out.println("=============Libro Impreso =================");
        libroImpreso.mostrarLibro();
        System.out.println("Precio de Venta: "+libroImpreso.calcularPrecioVenta());
        // Mostrar indormación del libro electrónico y su precio de venta
        System.out.println("=============Libro Electrónico =================");
        libroElectronico.mostrarLibro();
        System.out.println("Precio de Venta: "+libroElectronico.calcularPrecioVenta());
    }

}
