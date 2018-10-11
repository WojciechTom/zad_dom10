package produkt_10_3;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Koszyk {

    public static void main(String[] args) {

        File plik = new File("src/produkt_10_3/produkty.csv");

        FileReader fr = null;
        try {
            fr = new FileReader(plik);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bfr = new BufferedReader(fr);


        String line = null;
        ArrayList<String> lista = new ArrayList<String>();

        try {
            do {
                line = bfr.readLine();
                if (line != null) {
                    lista.add(line);
                }

            } while (line != null);

        } catch (IOException e) {
            e.printStackTrace();
        }


        Product[] tablica = new Product[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            tablica[i] = new Product(lista.get(i).split(";")[0], lista.get(i).split(";")[1], Double.parseDouble(lista.get(i).split(";")[2]));
        }


        Koszyk k = new Koszyk();
        System.out.println("Suma cen wszystkich produktów w tablicy wnosi " + k.sumaCen(tablica));
        System.out.println("Najdroższy produkt to " + k.najdrozszyProdukt(tablica).getNazwa());
        System.out.println("Nroducent pojawiający sie najczęściej w tablicy to: " + k.najwiecejProduktow(tablica));


    }


    double sumaCen(Product[] tablica) {
        double suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i].getCena();
        }
        return suma;
    }


    Product najdrozszyProdukt(Product[] tablica) {
            Product prod = null;
            double max = 0;

            for (int i = 0; i < tablica.length; i++) {
                if (tablica[i].getCena() > max) {
                    max = tablica[i].getCena();
                    prod = tablica[i];
                }
            }
            return prod;
    }


    String najwiecejProduktow(Product[] tablica) {
        String producent = null;
        String producentNaj = null;
        int licznik = 0;
        int licznikNaj = 0;
        for (int i = 0; i < tablica.length; i++) {
            producent = tablica[i].getProducent();
            for (int j = 0; j < tablica.length; j++){
                if (tablica[i].getProducent() == tablica[j].getProducent()){
                    licznik ++;
                }
            }
            if (licznik > licznikNaj){
                producentNaj = producent;
                licznikNaj = licznik;
            }
        }
        return producent;
    }


}
