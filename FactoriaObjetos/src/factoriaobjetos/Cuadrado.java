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
public class Cuadrado implements Figura {
    double lado;
 
 public Cuadrado(double lado) {
  this.lado = lado;
 }
 
 public double getArea() {
  return lado * lado;
 }
}
