import java.util.Scanner;

public class  EntradaDadosCondutor {
        public static void main(String[] args) {
             Scanner  sc = new Scanner(System.in);
             System.out.print("Entre com nome do condutor..:");
             String NomeCondutor = sc.nextLine(); 
             System.out.print("Entre com a sua altura......:");
             String AlturaCondutor = sc.nextLine(); 
             System.out.print("Entre com a sua idade......:");
             String IdadeCondutor = sc.nextLine(); 
             System.out.print("Qual é o seu proposito......:");
             String PropositoCondutor = sc.nextLine();
             System.out.println("..............................");
             System.out.println("..............................");
             System.out.println(".........DADOS MOTO01.........");
             System.out.println("Entre nome e modelo da sua moto.......:");
             String NomeModeloMoto1 = sc.nextLine();
             System.out.println("Entre com CC motor....................:");
             String MotorCCMoto1 = sc.nextLine();
             System.out.println("Entre tamanho do tanque em litros.....:");
             String TanqueLitrosMoto1 = sc.nextLine();
             System.out.println("Entre km por  litros.....:");
             String KMLitrosMoto1 = sc.nextLine();
             System.out.println("Entre com altura da moto..............:");
             String AlturaMoto1 = sc.nextLine();
             System.out.println("Entre com valor em R$ da moto..............:");
             String ValorMoto1 = sc.nextLine();
             System.out.println("..................................");
             System.out.println("..................................");
             System.out.println("                                  ");
             System.out.println(".........DADOS DO CONDUTOR.........");
             System.out.println("Nome do condutor......:" +NomeCondutor);
             System.out.println("Altura condutor.......:" +AlturaCondutor);
             System.out.println("Proposito condutor....:" +PropositoCondutor);
             System.out.println("Idade do condutor....:" +IdadeCondutor);
             System.out.println("                                  ");
             System.out.println("                                  ");
             System.out.println(".........DADOS DA MOTO.............");
             System.out.println("Modelo da sua moto........:" +NomeModeloMoto1);
             System.out.println("Motor da moto em CC.......:" +MotorCCMoto1);
             System.out.println("Capacidade em litros......:" +TanqueLitrosMoto1);
             System.out.println("KM por Litro..............:" +KMLitrosMoto1);
             System.out.println("Altura da moto............:" +AlturaMoto1);
             System.out.println("Valor  da moto............:" +ValorMoto1);     
             System.out.println("                                  ");
             System.out.println("                                  ");
             System.out.println(".........PROCESSAMENTO DADOS..........");
             int v_TanqueLitrosMoto1 = Integer.parseInt(TanqueLitrosMoto1);
             int v_KMLitrosMoto1 = Integer.parseInt(KMLitrosMoto1);
             int v_ValorMoto1 = Integer.parseInt(ValorMoto1);
             int v_IdadeCondutor = Integer.parseInt(IdadeCondutor);
             CalculaAutonomia oca = new CalculaAutonomia(); // chama o construtor CalculaAutonomia
             oca.setCalculaAutonomia(v_TanqueLitrosMoto1, v_KMLitrosMoto1);
             /*.........Construtor Autonomia..........*/
             oca.print_autonomia();
             /*.........Construtor Seguro............*/
             CalculaSeguro consCalculaSeguro = new CalculaSeguro(); 
             consCalculaSeguro.setCalculaSeguro(v_ValorMoto1, v_IdadeCondutor);


             
        }
}
/* inserir condicional de Dados ok */
/* chamar constructor */  



    
