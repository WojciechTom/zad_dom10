package computer_10_4;

public abstract class Komponent {
    private String Producent;
    private String nazwaModelu;
    private String numerSeryjny;

    public Komponent(String producent, String nazwaModelu, String numerSeryjny) {
        Producent = producent;
        this.nazwaModelu = nazwaModelu;
        this.numerSeryjny = numerSeryjny;
    }

    public String getProducent() {
        return Producent;
    }

    public String getNazwaModelu() {
        return nazwaModelu;
    }

    public String getNumerSeryjny() {
        return numerSeryjny;
    }
}
