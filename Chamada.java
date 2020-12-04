
class Chamada { 
  public static void main(String[] args) { 
    EntradaMoeada operacao_01 = new EntradaMoeda();
    operacao_01.printMoedaEntrada();
    operacao_01.printValorConverter();
    operacao_01.print_conv_euro();
    operacao_01.print_conv_dollar();
    CalculaImposto operacao_02 = new CalculaImposto(); 
    operacao_02.print_calculaimposto();
  }  

}
