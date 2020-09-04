package com.wellynton.projetoindividualwellyntondias;

public class Teste {
    public static void main(String[] args) {

        Monstros m1 = new Dragoes("Felgrand", "Dragão", 2500.0, 1900.0);
        Monstros m2 = new Magos("Mago Negro", "Mago", 2400.0, 2100.0);
        Monstros m3 = new Cavaleiro("Master Peace", "Cavaleiro", 2600.0, 2000.0);


        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
