/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;
import figuras.Punto; 
/**
 *
 * @author crist
 */
public class Cuadrado extends Figura{
    
    public void calcularArea(){
        float lado = this.punto1.calcularDistancia(this.punto2);
        this.area= lado*lado;
    }
    public void calcularPerimetro(){
        float lado = this.punto1.calcularDistancia(this.punto2);
        this.perimetro= lado*4;
    }
    
}
