package computer_10_4;

public class Ram extends Komponent{
    private int iloscPamieci;
    private int taktowanie;
    private double temp;
    private double maxTemp;

    public Ram(String producent, String nazwaModelu, String numerSeryjny, int iloscPamieci, int taktowanie, double temp, double maxTemp) {
        super(producent, nazwaModelu, numerSeryjny);
        this.iloscPamieci = iloscPamieci;
        this.taktowanie = taktowanie;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }

    public void setTaktowanie(int taktowanie) {
        if (taktowanie == 0 ){
        if (this.temp + taktowanie/100*15 > maxTemp){
            throw new TooHotException("Za mocne podkręcenie spowoduje zbyt wysoką temperaturę");
        } else {
        this.taktowanie += taktowanie;
        this.temp += taktowanie/100*15;
    }}}

    public int getIloscPamieci() {
        return iloscPamieci;
    }

    public int getTaktowanie() {
        return taktowanie;
    }

    public double getTemp() {
        return temp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }
}
