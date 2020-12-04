// Classe Test Autonomia 
// Test Autonomia 
import javax.swing.JOptionPane;

public class TesteAutonomia { 
    public static void main(String args[] )
    {
        CalculaAutonomia oca = new CalculaAutonomia(); // chama o construtor CalculaAutonomia
        oca.setCalculaAutonomia(23, 10);
        oca.print_autonomia();
        CalculaSeguro consCalculaSeguro = new CalculaSeguro(); 
        consCalculaSeguro.setCalculaSeguro(24000, 40); 
    }
}