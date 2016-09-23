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
public class FactoriaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tipo = Integer.parseInt(args[0]);
        double lado = Double.parseDouble(args[1]);

        Figura figura = FiguraFactory.getFigura(tipo, lado);

        System.out.println("El area de la figura es: " + figura.getArea());
    }

}
