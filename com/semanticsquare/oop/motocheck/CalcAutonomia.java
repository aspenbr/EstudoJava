package com.semanticsquare.oop.motocheck;


//import com.semanticsquare.oop.motocheck.InputForm;

/* Abordagem 02 

public class CalcAutonomia {
    int KmLitro = 24;
    int v_autonomia = 0; 

    int v_autonomia = KmLitro * FormEntrada.CapacidadeTanque ;

}
/*



 /*      v_autonomia = FormEntrada.CapacidadeTanque * KmLitro;  */


/*
       public static void main(String[] args) {
        System.out.println("Dados moto");
        System.out.println("Modelo da moto: " + FormEntrada.ModeloMoto);
        System.out.println("Tamanho do motor: " + FormEntrada.TamanhoMotor);
        System.out.println("Capacidade: " + FormEntrada.CapacidadeTanque);
        System.out.println("Autonomia Calculada: " + v_autonomia);
        }
}

*/


/* abordagem 01 */

public class CalcAutonomia extends FormEntrada {
/*    int KmLitro = 24;
    int v_autonomia = 0; */
    public static void main (String[] args) { 
        System.out.println("Dados moto");
        System.out.println("Modelo da moto: " + FormEntrada.ModeloMoto);
        System.out.println("Tamanho do motor: " + FormEntrada.TamanhoMotor);
        System.out.println("Capacidade: " + FormEntrada.CapacidadeTanque);
        /* System.out.println("Autonomia Calculada: " + v_autonomia);   */ 
    }
}


