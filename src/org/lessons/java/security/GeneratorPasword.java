package org.lessons.java.security;

import java.util.Scanner;

public class GeneratorPasword {
    public static void main (String[]args){
     Scanner  tastiera =new Scanner(System.in);

    String name;
    String surname;
    String colors;
    int giorno;
    int mese;
    int anno;
        System.out.println("inserisci il tuo nome");
    name=tastiera.nextLine();
        System.out.println("inserisci il tuo cognome");
    surname= tastiera.nextLine();
System.out.println("inserisci il tuo colore preferito ");
    colors=tastiera.nextLine();
    //dichiaro la varibaile per la data di nascita///

System.out.println("inserisci giorno ");
 giorno=tastiera.nextInt();
        System.out.println("inserisci mese ");
        mese=tastiera.nextInt();
        System.out.println("inserisci anno");
        anno=tastiera.nextInt();
    //dichiaro variabile della pasword//
        int sum= giorno+ mese+ anno ;
    String pasword = name+"/"+surname+ "/"+colors+ "/"+sum;
        System.out.println("pasword :" + pasword);


    }
}
