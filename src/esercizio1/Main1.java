package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int Num = 0;
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Inserisci il numero di parole da inserire: ");
            if (scanner.hasNextInt()) {
                Num = scanner.nextInt();
                scanner.nextLine();
                inputValido = true;
            } else {
                System.out.println("Per favore, inserisci un numero intero valido.");
                scanner.nextLine();
            }
        }

        ArrayList<String> parole = new ArrayList<>();

        System.out.println( "Inserisci " + Num + "parole");
        for (int i = 0; i < Num; i++) {
            parole.add(scanner.nextLine());
        }

        Set <String> paroleUniche = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for (String parola: parole) {
            if (!paroleUniche.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        if (!paroleDuplicate.isEmpty()) {
            System.out.println("Parole duplicate: ");
            for (String parola : paroleDuplicate) {
                System.out.println(parola);
            }
        }else {
            System.out.println("Non ci sono parole duplicate");
        }

        System.out.println("Numero di parole distinte: " + paroleUniche.size());

        System.out.println("Elenco delle parole uniche: ");
        for (String parola : paroleUniche) {
            System.out.println(parola);
        }

        scanner.close();
    }

}

