

public class CalculaAltura extends Object { 
    private int AlturaMoto; 
    private int AlturaPiloto; 
    private int Coeficiente = 10;
    private int DifMotoPiloto;
  
  
    public void setCalculaAltura(int AlturaMoto, int AlturaPiloto){ 
        DifMotoPiloto = AlturaPiloto - AlturaMoto;
        if (DifMotoPiloto <= Coeficiente )  {
            System.out.print("Moto nao apropriada");
        }
        else { 
            System.out.print("Moto  apropriada");
        }
    }   
}
  
  
  