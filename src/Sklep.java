import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sklep {

    // klasa Sklep służy do zarządzania listą komputerów w sklepie
    // posiada listę obiektów typu Komputer oraz metody do dodawania, wyświetlania i wczytywania listy komputerów z pliku

    //utworzenie listy komputerów
    List<Komputer> komputery = new ArrayList<>();

    // dodajKomputer - dodaje obiekt komputera do listy komputery
    public void dodajKomputer(Komputer komputer){
        komputery.add(komputer);
    }

    // wyswietlKomputery - wyświetla każdy element z listy komputery
    public void wyswietlKomputery() {
        for (Komputer komputer : komputery) {
            System.out.println(komputer.toString());
        }
    }


    // wczytajListeKomputerowZPliku - wczytuje listę komputerów z pliku
    public void wczytajListeKomputerowZPliku(String nazwaPliku) {
        try (BufferedReader br = new BufferedReader(new FileReader(nazwaPliku))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                String[] pola = linia.split(";");
                if (pola[0].equals("stacjonarny")) {
                    Komputer komputer = new Komputer(
                            Integer.parseInt(pola[1]),
                            Integer.parseInt(pola[2]),
                            Integer.parseInt(pola[3]),
                            Integer.parseInt(pola[4])

                    );
                    dodajKomputer(komputer);
                } else if (pola[0].equals("laptop")) {
                    Laptop laptop = new Laptop(
                            Integer.parseInt(pola[1]),
                            Integer.parseInt(pola[2]),
                            Integer.parseInt(pola[3]),
                            Double.parseDouble(pola[4]),
                            Integer.parseInt(pola[5])

                    );
                    dodajKomputer(laptop);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}




