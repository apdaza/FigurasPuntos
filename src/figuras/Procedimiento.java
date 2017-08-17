/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;
import figuras.Figura;

/**
 *
 * @author crist
 */
public class Procedimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura f;
        int op = 0;
        Scanner sc = new Scanner(System.in);
        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        while (op <= 4) {
            System.out.println("1.Cuadrado");
            System.out.println("2.Circulo");
            System.out.println("3.Rectangulo");
            System.out.println("4.Triangulo");
            System.out.println("¿A QUE FIGURA DESEA CALCULAR EL AREA Y EL PERIMETRO?  (NUMERO)");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    f = new Cuadrado();
                    break;

                case 2:
                    f = new Circulo();
                    break;

                case 3:
                    f = new Rectangulo();
                    break;

                default:
                    f = new Triangulo();
                    break;
            }
            System.out.println("Ingrese coordenadas para el primer punto");
            punto1.setX(sc.nextFloat());
            punto1.setY(sc.nextFloat());
            System.out.println("Ingrese coordenadas para el segundo punto");
            punto2.setX(sc.nextFloat());
            punto2.setY(sc.nextFloat());
            f.setPunto1(punto1);
            f.setPunto2(punto2);
            f.calcularArea();
            f.calcularPerimetro();
            System.out.println("area:" + f.getArea());
            System.out.println("perimetro:" + f.getPerimetro());
            System.out.println();

        }
        // TODO code application logic here
    }

}
