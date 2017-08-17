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
public class Punto {

    private float x;
    private float y;
    
    //private float distancia;

    public float calcularDistancia(Punto p) {
        return (float) (float) Math.sqrt((float) Math.pow((this.x - p.getX()), 2) + (float) Math.pow((this.y - p.getY()), 2));
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y1) {
        this.y = y1;
    }

}
