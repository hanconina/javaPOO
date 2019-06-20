/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerica.ejemplo2;

public class ParEnteros {
    private int a, b;
    public ParEnteros(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public ParEnteros intercambiar() {
        return new ParEnteros(b, a);
    }
}
