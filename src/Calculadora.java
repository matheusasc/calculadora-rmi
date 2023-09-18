import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements CalculadoraInterface {
    public Calculadora() throws RemoteException {
        // Construtor vazio
    }

    @Override
    public double adicao(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtracao(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiplicacao(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double divisao(double a, double b) throws RemoteException {
        return a / b;
    }
}
