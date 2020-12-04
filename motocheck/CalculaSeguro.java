

public class CalculaSeguro extends Object { 
  private int ValorMoto; 
  private int UsuarioIdade; 


  public void setCalculaSeguro(int ValorMoto, int UsuarioIdade){ 
    if (ValorMoto <= 50000) { 
      if (UsuarioIdade <= 45) {  
        System.out.println(" Seguro 3000"); 
       }
    }   
    else { 
        System.out.println("Seguro 1500");
    }
    }
}


