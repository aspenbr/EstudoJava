class EntradaMoeada {
     double qt_Real = 350;
     double Dollar_Arg = 65.00;
     double Dollar_Real = 5.40;
     double Euro_Real = 7.60; 
     double Euro_Arg = 80.00; 
     double qt_PesoArg = 350;
  /*   double convEuroPesoArg; 
   double convEuroRealBra; */
     double convEuroPesoArg = qt_PesoArg / Euro_Arg ; 
     double convDollarPesoArg = qt_PesoArg / Dollar_Arg  ;
     double convEuroReal = qt_Real / Euro_Real  ; 
     double convDollarReal = qt_Real / Dollar_Real;



     void printMoedaEntrada() { 
         System.out.println("Valor do Euro para Peso: " + Euro_Arg);
         System.out.println("Valor do Dollar para Peso: " + Dollar_Arg);
         System.out.println("Valor do Euro para Real: " + Euro_Real); 
         System.out.println("Valor do Dollar para Real: " + Dollar_Real);
         System.out.println("----------");
     }

     void printValorConverter() { 
        System.out.println("Valor em  Peso para converter :" + qt_PesoArg);
        System.out.println("Valor em  Real para converter :" + qt_Real);
        System.out.println("----------");
    }

     void print_conv_euro() { 
         
         System.out.println("Conversao Peso Argetino para Euro  "  + convEuroPesoArg);
         System.out.println("Conversao Peso Argetino para Dollar   "  + convDollarPesoArg);
     }

     void print_conv_dollar() { 
        System.out.println("----------");
        System.out.println("Conversao Real Brasileiro para Euro  "  + convEuroReal);
        System.out.println("Conversao Real Brasileiro para Dollar  "  + convDollarReal);
    }


    public static void main (String[] args) {
        EntradaMoeada operacao_01 = new EntradaMoeada();
        operacao_01.printMoedaEntrada();
        operacao_01.printValorConverter();
        operacao_01.print_conv_euro();
        operacao_01.print_conv_dollar();
        
     }
}
  
  