import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            CalculadoraInterface calculadora = new Calculadora();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("Calculadora", calculadora);
            System.out.println("Servidor RMI está em execução...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}