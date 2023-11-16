public class Studente {

    public   String nome;
    public String cognome;
    public int id;

    public Studente(String nome, String cognome, int id){
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
    }

    public String getNome(){

        return nome;
    }

    public String getCognome(){

        return cognome;
    }

    public int getId(){

        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", id=" + id +
                '}';
    }
}

