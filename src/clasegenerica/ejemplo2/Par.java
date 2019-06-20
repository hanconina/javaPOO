/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerica.ejemplo2;

/**
 *
 * @author user
 */
public class Par <T extends Comparable>{
    private T a, b;
    public Par(T a, T b) {
        this.a = a;
        this.b = b;
    }
    public Par<T> intercambiar() {
        return new Par<T>(b, a);
    }
    public T max(){
//        if (a > b){
//            return a;
//        }
//        else{
//            return b;
//        }
        return ((a.compareTo(b))>0?a:b);
    }
    public void mostrar(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
