package flujos;

public class E03ConversionTipos02 {
    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 323.142;
        double d2;
        float f = 5.65f;
        char c = 'c';
        short s = 1024;

        b = (byte) i;//efecto: se devuelve (i modulo 256), rango de byte.
        System.out.println(b);
        i = (int) d;//efecto: truncamiento de la parte decimal.
        System.out.println(i);
        b = (byte) d;//efecto: truncamiento y luego (result_truncado modulo 256)
        System.out.println(b);
        i = (int) f;//efecto: truncamiento de la parte decimal
        System.out.println(i);
        i = c;//correcto por ser int, pero un byte o short necesitaría un cast explícito.
        System.out.println(i);
        f = c;
        d = c;//correcto.
        i = b * c;//efecto: la operación promociona a int.
        System.out.println(i);
        d2 = (f * b) + (i / c) - (d * s);
        /*
            efecto: el resultado de la promoción de todas las expresiones es un double:
            (f*b) promociona a float, (i/c) promociona a int y (d*s) promociona a double. Luego,
            float + int - double promociona a double.
         */
        System.out.println(d2);
    }
}
