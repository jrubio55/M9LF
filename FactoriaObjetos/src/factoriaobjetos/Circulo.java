/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoriaobjetos;

/**
 *
 * @author Jorge
 */
public class Circulo implements Figura {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return (3.14 * radio * radio);
    }
}
