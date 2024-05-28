package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> rubrica;

    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, String numeroTelefono) {
        rubrica.put(nome, numeroTelefono);
    }

    public void cancellaContatto(String nome) {
        rubrica.remove(nome);
    }

    public String cercaNomeDaNumero(String numeroTelefono) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numeroTelefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String cercaNumeroDaNome(String nome) {
        return rubrica.get(nome);
    }

    public void stampaRubrica() {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        rubrica.inserisciContatto("bob", "1234567890");
        rubrica.inserisciContatto("armando", "0987654321");
        rubrica.inserisciContatto("alberto", "1112223333");

        System.out.println("Stampa dei contatti:");
        rubrica.stampaRubrica();

        System.out.println("\nNumero di telefono di armando: " + rubrica.cercaNumeroDaNome("armando"));
        System.out.println("Nome associato al numero 1112223333: " + rubrica.cercaNomeDaNumero("1112223333"));

        rubrica.cancellaContatto("alberto");
        System.out.println("\nDopo la cancellazione di alberto:");
        rubrica.stampaRubrica();
    }
}
