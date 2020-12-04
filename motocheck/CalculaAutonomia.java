//import java.text.DecimalFormat; 

// Classe publica para calculo
public class CalculaAutonomia extends Object { 
  private int capacidadelitros; 
  private int kmporlitros;
  private int autonomia ; 

// inicializa cada vriavel de forma consitente 
 /* public CalculaAutonomia() 
  {
    setCalculaAutonomia(0, 0);
  }
*/
  public void setCalculaAutonomia(int capacidadelitros, int kmporlitros) {
  //setEntrada( 23, 10); 
  autonomia = (capacidadelitros * kmporlitros);
  }
  
  public void print_autonomia() { 
    System.out.println("----------");
    System.out.println("Autonomia  "  + autonomia);
  }

}

/*
public void setEntrada (int c, int k) 
{
   capacidadelitros = ( c ); 
   kmporlitros = ( k ); 
}


*/