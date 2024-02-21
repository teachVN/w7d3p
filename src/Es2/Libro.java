package Es2;

import java.util.List;

public class Libro extends ComponenteLibro{

    private String nome;
    private List<String> autori;

    private double prezzo;

    private List<ComponenteLibro> componenti;

    public Libro(String nome, List<String> autori, List<ComponenteLibro> componenti) {
        this.nome = nome;
        this.autori = autori;
        this.componenti = componenti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public int getNumeroPagine() {
        return componenti.stream().mapToInt(componente->componente.getNumeroPagine()).sum();
    }
}
