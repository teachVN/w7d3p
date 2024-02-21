package Es3;

public abstract class Ufficiale {

    private String funzione;
    private Ufficiale responsabile;
    private int stipendio;

    public Ufficiale(String funzione, Ufficiale responsabile, int stipendio) {
        this.funzione = funzione;
        this.responsabile = responsabile;
        this.stipendio = stipendio;
    }

    public String getFunzione() {
        return funzione;
    }

    public void setFunzione(String funzione) {
        this.funzione = funzione;
    }

    public Ufficiale getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(Ufficiale responsabile) {
        this.responsabile = responsabile;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }


    public void confrontaStipendi(int stipendioRiferimento) {
        if(getStipendio()>=stipendioRiferimento){
            System.out.println(getFunzione() + " ha uno stipendio maggiore di " + stipendioRiferimento);
        }
        if(getResponsabile()!=null){
            getResponsabile().confrontaStipendi(stipendioRiferimento);
        }
    }
}
