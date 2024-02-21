package Es3;

public class Main {
    public static void main(String[] args) {

        Maggiore maggiore = new Maggiore("Maggiore", null, 3000);
        Capitano capitano = new Capitano("Capitano", maggiore, 2000);
        Tenente tenente = new Tenente("Tenente", capitano, 1000);

        tenente.confrontaStipendi(1500);
    }
}
