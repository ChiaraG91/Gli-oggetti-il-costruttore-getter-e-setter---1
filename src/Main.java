public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Giulio","Bianchi",150814);
        Studente studente2 = new Studente("Paolo","Rossi",150815);
        Studente studente3 = new Studente("Luca","Verdi",150816);


        System.out.println(studente1.getNome() + " " + studente1.getCognome() + " " + studente1.getId() );
        System.out.println(studente2.getNome() + " " + studente2.getCognome() + " " + studente2.getId() );
        System.out.println(studente3.getNome() + " " + studente3.getCognome() + " " + studente3.getId() );

    }
}
