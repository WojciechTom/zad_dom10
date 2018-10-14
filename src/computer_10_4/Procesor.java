package computer_10_4;

public class Procesor extends Komponent {

    private int taktowanie;
    private double temp;
    private double maxTemp;

    public Procesor(String producent, String nazwaModelu, String numerSeryjny, int taktowanie, double temp, double maxTemp) {
        super(producent, nazwaModelu, numerSeryjny);
        this.taktowanie = taktowanie;
        this.temp = temp;
        this.maxTemp = maxTemp;
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

    public void setTaktowanie(int taktowanie) {
        if (taktowanie != 0 ){
        if (this.temp + taktowanie / 100 * 10 > maxTemp) {
            throw new TooHotException("Za mocne podkręcenie spowoduje zbyt wysoką temperaturę");
        } else {
            this.taktowanie += taktowanie;
            this.temp += taktowanie / 100 * 10;
        }}
    }


}
