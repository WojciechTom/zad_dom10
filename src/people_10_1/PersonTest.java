package people_10_1;

import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Proszę podać imię");
        String imie = scan.nextLine();
        System.out.println("Proszę podać nazwisko");
        String nazwisko = scan.nextLine();
        System.out.println("Proszę podać wiek");
        int wiek = scan.nextInt();
        System.out.println("Proszę podać pesel");
        String pesel = scan.nextLine();
        scan.nextLine();

        Person p1 = null;
        try {
            p1 = new Person(imie, nazwisko, wiek, pesel);
        } catch (NameUnderfinedException e) {
            e.printStackTrace();
            System.out.println("Złe imię bądź nazwisko");;
        } catch (IncorrectAgeException e) {
            e.printStackTrace();
            System.out.println("Wiek nie może być mniejszy niż 1");;
        }

        System.out.println("Utworzona osoba to: \n" + p1.getFirstName() + " " + p1.getLastName() + ", Wiek: " + p1.getAge() + ", Numer Pesel: " + p1.getPesel());
    }
}
