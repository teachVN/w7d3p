package Es2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pagina p1 = new Pagina();
        Pagina p2 = new Pagina();
        Pagina p3 = new Pagina();
        Pagina p4 = new Pagina();
        Pagina p5 = new Pagina();
        Pagina p6 = new Pagina();
        Pagina p7 = new Pagina();

        Sezione sottoSezione1 = new Sezione(List.of(p1, p2));
        Sezione sottoSezione2 = new Sezione(List.of(p3, p4));
        Sezione sottoSezione3 = new Sezione(List.of(p5, p6));

        Sezione sezione1 = new Sezione(List.of(sottoSezione1, sottoSezione2));
        Sezione sezione2 = new Sezione(List.of(sottoSezione3, p7));

        Libro l1 = new Libro("vuoto", List.of("Carli", "Sada"), List.of(sezione1, sezione2));

        System.out.println(l1.getNumeroPagine());

        System.out.println(sezione1.getNumeroPagine());
    }
}
