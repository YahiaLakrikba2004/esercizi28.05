package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main1 {
    public static List<Integer> GeneratoreNumCasuali(int N) {
        List<Integer> numeriCasuali = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            numeriCasuali.add(random.nextInt(101));
        }


        return numeriCasuali;
    }


    public static List<Integer> listaInvertita(List<Integer> lista) {
        List<Integer> listaInvertita = new ArrayList<>();

        for (int i  = lista.size() - 1; i >= 0; i--) {
            listaInvertita.add(lista.get(i));
        }

        listaInvertita.addAll(lista);
        return listaInvertita;
    }



    public static void stampaValori(List<Integer> lista, boolean pari) {
        System.out.println("Valori in posizioni " + (pari ? "pari" : "dispari") + ":");
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println(lista.get(i));
            } else if (!pari && i % 2 != 0) {
                System.out.println(lista.get(i));
            }
        }
    }



    public static void main(String[] args) {
        int N = 10;
        List<Integer> numeriCasuali = GeneratoreNumCasuali(N);
        System.out.println("Lista di numeri casuali ordinati:");
        System.out.println(numeriCasuali);

        List<Integer> listaInvertita = listaInvertita(numeriCasuali);
        System.out.println("\nLista invertita:");
        System.out.println(listaInvertita);

        System.out.println("\nStampa valori in posizioni pari:");
        stampaValori(numeriCasuali, true);

        System.out.println("\nStampa valori in posizioni dispari:");
        stampaValori(numeriCasuali, false);
    }


}
