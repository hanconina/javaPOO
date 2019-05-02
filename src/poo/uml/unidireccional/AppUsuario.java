package poo.uml.unidireccional;

public class AppUsuario {
   public static void main(String[] args) {
        Clave clave
                = new Clave("codigorojo");
        Usuario usuario = new Usuario("juan",clave);
        System.out.println("*****Mostrar Información de Usuario****");
        usuario.verDatosUsuario();
    }
}
