package com.semanticsquare.oop.pet;

public class PetPrint extends PetFichaDados {
    public static void main(String[] args) {
        System.out.println(":::::::::::Imprime dados pet::::::");
        System.out.println("Nome do pet............." + NomePet);
        System.out.println("Especie do pet:........." + EspeciePet);
        System.out.println("Idade do Pet em anos:..." + IdadeAnosPet);
        System.out.println("Race do pet:............" + RacaPet);
    }
        

}

public class PetPrintVacina extends PetControleVacina {
    public static void main(String[] args) {
        System.out.println(":::::::::::Imprime dados da vacina ::::::");
        System.out.println("Nome da Vacina ............." + PetVacina);
        System.out.println("Data Vacina................." + PetDataVacina);
    }
        

}