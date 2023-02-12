import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie1");
        // Utworzenie nowego obiektu klasy Sklep
        Sklep sklep = new Sklep();

        // Utworzenie obiektow klasy Komputer i Laptop
        Komputer komputer1 = new Komputer(2000, 16, 1000, 4000);
        Komputer komputer2 = new Komputer(2500, 24, 2000, 6000);

        Laptop laptop1 = new Laptop(1900, 20, 2000, 14, 2000);
        Laptop laptop2 = new Laptop(2000, 24, 2300, 15, 3000);

        // Dodanie utworzonych komputerow do listy w sklepie
        sklep.dodajKomputer(komputer1);
        sklep.dodajKomputer(komputer2);

        // Dodanie utworzonych laptopow do listy w sklepie
        sklep.dodajKomputer(laptop1);
        sklep.dodajKomputer(laptop2);
        // Wyswietlenie listy komputerow w sklepie
        sklep.wyswietlKomputery();

        System.out.println("Zadanie2");
        // Wczytanie listy komputerow z pliku
        sklep.wczytajListeKomputerowZPliku("src/baza.txt");
        sklep.wyswietlKomputery();
    }
}


