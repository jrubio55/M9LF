package semaforo;

import java.util.concurrent.Semaphore;

public class SemaforoEjemplo {
    static int i = 0;
    public static void main(String[] args) {
        final SemaforoEjemplo example = new SemaforoEjemplo();
        final Semaphore semaforo = new Semaphore(1, true);
        final Runnable r = new Runnable() {
            public void run() {
                while (i < 10) {
                    try {
                        semaforo.acquire();
                        //Sección crítica a proteger
                        example.printSomething();
                        //Thread.sleep(100);
                        semaforo.release();
                    } catch (Exception ex) {}
                }
            }
        };
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
    }
    public void printSomething() {
        i++;
        System.out.println(Thread.currentThread().getName()+ " — current value of the i :" + i);
    }

}
