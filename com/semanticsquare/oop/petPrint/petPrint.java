package com.semanticsquare.oop.petPrint;

import com.semanticsquare.oop.pet.PetControleVacina;
import com.semanticsquare.oop.pet.PetFichaDados;

public class petPrint {
   public static void main(String[] args) {
    System.out.println(":::::::::::Imprime dados da vacina ::::::");
    System.out.println("Nome da Vacina............." + PetControleVacina.PetVacina);
    System.out.println("Data da Vacina............." + PetControleVacina.PetDataVacina);
    System.out.println(":::::::::::Imprime dados pet::::::");
    System.out.println("Nome do pet............." + PetFichaDados.NomePet);
    System.out.println("Especie do pet:........." + PetFichaDados.EspeciePet);
    System.out.println("Idade do Pet em anos:..." + PetFichaDados.IdadeAnosPet);
    System.out.println("Race do pet:............" + PetFichaDados.RacaPet);  
}


}