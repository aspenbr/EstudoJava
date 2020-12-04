class Cachorro { 
    String raca = "foxpaulistinha"; 
    String nome = "betina";
    int idade = 10; 
    String raca2 = "foxpaulistinha"; 
    String nome2 = "chico";
    int idade2 = 1; 

    void pet01 () { 
        System.out.println("Nome: " + nome);
        System.out.println("raca do dog: " + raca);
        System.out.println("idade: " + idade);

    }

    void pet02 () { 
        System.out.println("Nome: " + nome2);
        System.out.println("raca do dog: " + raca2);
        System.out.println("idade: " + idade2);
    }

    public static void main (String[] args) { 
        Cachorro betina = new Cachorro(); 
        betina.pet01();
        Cachorro chico = new Cachorro(); 
        chico.pet02();
    }

 /*   public static void main (String[] args) { 
        Cachorro chico = new Cachorro(); 
        chico.pet02();
    } */
   
}

