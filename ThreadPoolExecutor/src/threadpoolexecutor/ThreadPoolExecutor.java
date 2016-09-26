package threadpoolexecutor;

public class ThreadPoolExecutor {

    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        for (int i = 0; i < 10; i++) {
            Tarea tarea = new Tarea("Tarea " + i);
            servidor.ejecutaTarea(tarea);
        }
        servidor.terminaServidor();
    }

}
