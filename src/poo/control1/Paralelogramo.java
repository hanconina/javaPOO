/*
 * Clase paralelogramo:
 * Un Paralelogramo es un cuadrilátero cuyos lados opuestos 
 * son paralelos. Podemos representar un Paralelogramo con 
 * cuatro vértices que son pares ordenados (x,y)
 */
package poo.control1;

/**
 *
 * @author Hernan Nina
 */
public class Paralelogramo {

    /**
     * ************** Atributos ****************
     */
    // Vértice A
    private double ax;
    private double ay;
    // Vértice B
    private double bx;
    private double by;
    // Vértice C
    private double cx;
    private double cy;
    // Vértice D
    private double dx;
    private double dy;

    /**
     * ************** Métodos ****************
     */
    /*================ Constructores =============*/
 /*
    * Constructor por defecto o predeterminado
     */
    public Paralelogramo() {
        this.ax = 0;
        this.ay = 0;
        this.bx = 0;
        this.by = 0;
        this.cx = 0;
        this.cy = 0;
        this.dx = 0;
        this.dy = 0;
    }

    public Paralelogramo(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
        this.dx = dx;
        this.dy = dy;
    }
    /*================ Accesadores y modificadores =============*/
    /*Para el caso del ejercicio solo se necesita accesadores*/

    public double getAx() {
        return ax;
    }

    public double getAy() {
        return ay;
    }

    public double getBx() {
        return bx;
    }

    public double getBy() {
        return by;
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }
    /****************** Otros Métodos ****************/
    /*
    * Distancia entre dos vertices
    */
    private double distancia(double ax, double ay, double bx, double by){
        double temp = Math.pow((bx-ax),2)+Math.pow((by-ay),2);
        return Math.sqrt(temp);
    }
    /*
    * Verificar si es un paralelogramo
    */
   private boolean esParalelogramo(){
       // Si las diagonales son el mismo punto entonces es un paralelogramo
       // Diagonales de AC y BD 
       // Hallar el punto medio entre AC
       Double mACx = (ax+cx)/2;
       Double mACy = (ay+cy)/2;
       // Hallar el punto medio entre BD
       Double mBDx = (bx+dx)/2;
       Double mBDy = (by+dy)/2;
       return (mACx.compareTo(mBDx)==0 && mACy.compareTo(mBDy)==0);
   }
    /*
    * Verificar si dos vectores son perpendiculares
    */
   private boolean sonPerpendiculares(
           double ax, double ay, double bx, double by,
           double cx, double cy, double dx, double dy
   ){
       // Si las diagonales son el mismo punto entonces es un paralelogramo
       // Diagonales de AC y BD 
       // Hallar las componentes del vector AB
       Double ABx = (bx-ax);
       Double ABy = (by-ay);
       // Hallar las componentes del vector CD
       Double CDx = (dx-cx);
       Double CDy = (dy-cy);
       // Producto escalar de AB y CD
       Double p = (ABx*CDx+ABy*CDy);
       return (p.compareTo(0.00000000d)==0);
   }   
   /*
   * Perimetro del Paralelogramo
   */
   public double perimetro(){
       double lado1 = distancia(ax,ay,bx,by);
       double lado2 = distancia(bx,by,cx,cy);
       return 2*lado1+2*lado2;       
   }
    
   /*
   * Área del Paralelogramo
   */
   public double area(){
       double a = distancia(ax,ay,bx,by); // Lado 1
       double b = distancia(bx,by,cx,cy); // Lado 2
       double c = distancia(ax,ay,cx,cy); // Diagonal
       double sp = (a+b+c)/2;
       double areaTriangulo = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
       return 2*areaTriangulo;       
   }
   
   /*
   * Verificar si el Paralelogramo es un Rectangulo
   */
   public boolean esRectangulo(){
       return sonPerpendiculares(ax, ay, bx, by, bx, by, cx, cy) &&
              sonPerpendiculares(bx, by, cx, cy, cx, cy, dx, dy); 
   }
   public void leer(){
       java.util.Scanner entrada = new java.util.Scanner(System.in);
       boolean flag;
       do{
           System.out.println("Ingrese la ordenada x del primer vertice: ");
           this.ax = entrada.nextDouble();
           System.out.println("Ingrese la ordenada y del primer vertice: ");
           this.ay = entrada.nextDouble();
           System.out.println("Ingrese la ordenada x del segundo vertice: ");
           this.bx = entrada.nextDouble();
           System.out.println("Ingrese la ordenada y del segundo vertice: ");
           this.by = entrada.nextDouble();
           System.out.println("Ingrese la ordenada x del tercer vertice: ");
           this.cx = entrada.nextDouble();
           System.out.println("Ingrese la ordenada y del tercer vertice: ");
           this.cy = entrada.nextDouble();
           System.out.println("Ingrese la ordenada x del cuarto vertice: ");
           this.dx = entrada.nextDouble();
           System.out.println("Ingrese la ordenada y del cuarto vertice: ");
           this.dy = entrada.nextDouble();           
           flag = esParalelogramo();
           if (!flag)
                System.out.println("Error. volver a ingresar los datos..");
           
       } while (!flag);
   }
}
