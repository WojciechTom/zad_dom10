package computer_10_4;



public class KomputerTest {
    public static void main(String[] args) {
        Ram ram1 = new Ram("Kingsotne", "DDR3", "wzr234", 8000,1600,40,60 );
        Procesor proc1 = new Procesor("Intel", "Core i7", "gmshbn341234", 4000,45,80);
        DyskTwardy dysk1 = new DyskTwardy("Kingsotne", "HDD", "w40Z43", 500);

        Komputer komp1 = new Komputer("Komputer1", proc1, ram1,dysk1);
        System.out.println("Komputer został utworzony");
        komp1.uruchom();


    }
}
