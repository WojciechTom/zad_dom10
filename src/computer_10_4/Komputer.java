package computer_10_4;

import produkt_10_3.Product;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Komputer {
    private String nazwa;
    private Procesor proc;
    private Ram ram;
    private DyskTwardy dysk;

    public Komputer(String nazwa, Procesor proc, Ram ram, DyskTwardy dysk) {
        this.nazwa = nazwa;
        this.proc = proc;
        this.ram = ram;
        this.dysk = dysk;
    }

    public void uruchom() {
        Scanner scan = new Scanner(System.in);
        int komenda = 0;
        do {
            System.out.println("\nCo chcesz zrobić? Podaj komendę: \n 1 - SPRAWDŹ PARAMETRY KOMPUTERA \n 2 - PODKRĘĆ PROCESOR \n 3 - PODKRĘĆ RAM \n 4 - KONIEC ");


            try {
                komenda = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.nextLine();
                komenda = 0;
            }


            if (komenda == 1) {
                System.out.println("KOMPUTER: " + this.getNazwa() + "\nPROCESOR: " + this.getProc().getProducent() + " " + this.getProc().getNazwaModelu() + ", taktowanie: " + this.getProc().getTaktowanie() + " (temp: " + this.getProc().getTemp() + "`C / " + this.getProc().getMaxTemp() + "`C)," + " \nRAM: " + this.getRam().getProducent() + " " + this.getRam().getNazwaModelu() + ", taktowanie ramu: " + this.getRam().getTaktowanie() + " (temp: " + this.getRam().getTemp() + "`C / " + this.getRam().getMaxTemp() + "`C)");
            } else if (komenda == 2) {
                System.out.println("Podkręcanie procesora - prosze podać o ile podkręcić procesor [MHz]:");
                int wartosc = 0;
                int check= 0;
                do {
                    try {
                        wartosc = scan.nextInt();
                        this.getProc().setTaktowanie(wartosc);
                        System.out.println("Podkręcono Procesor o " + wartosc + " MHz");
                        check =1;
                    } catch (TooHotException e) {
                        System.out.println("Za duża wartość podkręcenia - proszę podać mniejszą wartość");
                        check = 0;
                    } catch (InputMismatchException e) {
                        System.out.println("Wpisano ciąg znaków który nie jest liczbą całkowitą - proszę wpisać ponownie wartość podkręcenia");
                        scan.nextLine();
                        check = 0;
                    }
                } while (check == 0);

            } else if (komenda == 3) {
                System.out.println("Podkręcanie ramu - prosze podać o ile podkręcić ram [MHz]:");
                int wartosc = 0;
                int check = 0;
                do {
                    try {
                        wartosc = scan.nextInt();
                        this.getRam().setTaktowanie(wartosc);
                        System.out.println("Podkręcono ram o " + wartosc + " MHz");
                        check = 1;
                    } catch (TooHotException e) {
                        System.out.println("Za duża wartość podkręcenia - proszę podać mniejszą wartość");
                        check = 0;
                    } catch (InputMismatchException e) {
                        System.out.println("Wpisano ciąg znaków który nie jest liczbą całkowitą - proszę wpisać ponownie wartość podkręcenia");
                        scan.nextLine();
                        check = 0;
                    }
                } while (check == 0);

            } else if (komenda == 4){

            } else {
                System.out.println("NIEPRAWIDŁOWA KOMENDA - SPROBUJ JESZCZE RAZ");
            }


        } while (komenda != 4);

    }


    public String getNazwa() {
        return nazwa;
    }

    public Procesor getProc() {
        return proc;
    }

    public Ram getRam() {
        return ram;
    }

    public DyskTwardy getDysk() {
        return dysk;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setProc(Procesor proc) {
        this.proc = proc;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setDysk(DyskTwardy dysk) {
        this.dysk = dysk;
    }
}
