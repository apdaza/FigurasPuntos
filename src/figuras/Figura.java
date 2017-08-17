/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author crist
 */
public abstract class Figura {
    protected float area;
    protected float perimetro;
    protected Punto punto1;
    protected Punto punto2;
    
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    
    
    public float getArea(){
        return this.area;
    }
    public float getPerimetro(){
        return this.perimetro;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    
    
}
