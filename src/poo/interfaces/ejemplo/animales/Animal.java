package poo.interfaces.ejemplo.animales;

public abstract class Animal {
    protected int patas;
    
    public Animal(int patas){
        this.patas = patas;
    }
    public abstract void comer();
    
    public void caminar(){
        System.out.println("caminar() de la clase padre"+
                "este animal camina sobre "+patas+ "patas");
    }    
    
}
