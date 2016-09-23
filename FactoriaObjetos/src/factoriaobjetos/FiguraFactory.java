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
public abstract class FiguraFactory {

    public final static int CUADRADO = 0;
    public final static int CIRCULO = 1;

    public static Figura getFigura(int tipo, double lado) {
        switch (tipo) {
            case CUADRADO:
                return new Cuadrado(lado);
            case CIRCULO:
                return new Circulo(lado);
        }
        return null;
    }
}
