package threadpoolexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Servidor {
    private final ThreadPoolExecutor executor;
    //private final ExecutorService executor;
    
    public Servidor() {  
        executor = (ThreadPoolExecutor)Executors.newCachedThreadPool(); //Crea el objeto executor o un pool de threads  
        //executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5); //Crea el objeto executor con 5 threads
        //executor = (ExecutorService) Executors.newSingleThreadExecutor(); //Crea el objeto executor con 1 thread
    }  
    public void ejecutaTarea(Tarea tarea) {  
        executor.execute(tarea);// Ejecuta una tarea 
    }  
    public void terminaServidor () {  
        executor.shutdown();// Este metodo termina el executor
    }  
 }
