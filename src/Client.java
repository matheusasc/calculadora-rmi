import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            CalculadoraInterface calculadora = (CalculadoraInterface) registry.lookup("Calculadora");
            double result = calculadora.adicao(5, 3);
            System.out.println("Resultado da adição: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
