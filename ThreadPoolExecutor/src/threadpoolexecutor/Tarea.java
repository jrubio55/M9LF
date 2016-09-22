/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpoolexecutor;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Jorge
 */
public class Tarea implements Runnable {

    private String nombre;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " - " + this.nombre + ", creado: " + new Date());
        try {
            TimeUnit.SECONDS.sleep((long) (Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " - " + this.nombre + ", terminado: " + new Date());
    }
}
