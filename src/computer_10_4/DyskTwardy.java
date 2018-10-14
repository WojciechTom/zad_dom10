package computer_10_4;

public class DyskTwardy extends Komponent {
    private int pojemnosc;

    public DyskTwardy(String producent, String nazwaModelu, String numerSeryjny, int pojemnosc) {
        super(producent, nazwaModelu, numerSeryjny);
        this.pojemnosc = pojemnosc;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }
}
