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
public class Triangulo extends Figura{
    public void calcularArea(){
        Punto trasladado = new Punto();
        trasladado.setX(this.punto1.getX());
        trasladado.setY(this.punto2.getY());
        float base = this.punto1.calcularDistancia(trasladado);
        float altura = this.punto2.calcularDistancia(trasladado);
        this.area= base*altura/2;
    }
    public void calcularPerimetro(){
        Punto trasladado = new Punto();
        trasladado.setX(this.punto1.getX());
        trasladado.setY(this.punto2.getY());
        float base = this.punto1.calcularDistancia(trasladado);
        float altura = this.punto2.calcularDistancia(trasladado);
        this.perimetro= base+altura+this.punto1.calcularDistancia(this.punto2);
    }
    
}
