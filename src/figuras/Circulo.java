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
public class Circulo extends Figura{
    public void calcularArea(){
        float radio = this.punto1.calcularDistancia(this.punto2);
        this.area= (float)Math.PI*radio*radio;
    }
    public void calcularPerimetro(){
        float radio = this.punto1.calcularDistancia(this.punto2);
        this.perimetro= radio*2*(float)Math.PI;
    }
}
