package Es2;

import java.util.List;

public class Sezione extends ComponenteLibro{

    private List<ComponenteLibro> componenti;

    public Sezione(List<ComponenteLibro> componenti){
        this.componenti=componenti;
    }

    @Override
    public int getNumeroPagine() {
        return componenti.stream().mapToInt(componente->componente.getNumeroPagine()).sum();
    }
}
