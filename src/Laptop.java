public class Laptop extends Komputer{


    //utworzenie zmiennej typu double
    double wielkosc_matrycy;

    //konstruktor domyślyny

    public Laptop(double wielkosc_matrycy) {
        this.wielkosc_matrycy = wielkosc_matrycy;
    }

    //konstruktor z parametrami, przechowujący informacje o laptopie
    public Laptop(int szybkoosc_procesora_Mhz, int ilosc_pamieci_Gb, int pojemnosc_Gb,  double wielkosc_matrycy, int cena) {
        super(szybkoosc_procesora_Mhz, ilosc_pamieci_Gb, pojemnosc_Gb, cena);
        this.wielkosc_matrycy = wielkosc_matrycy;
    }

    //setter dla wielkości matrycy
    public void setWielkosc_matrycy(double wielkosc_matrycy) {
        this.wielkosc_matrycy = wielkosc_matrycy;
    }

    //nadpisanie metody toString, aby umożliwić wyświetlenie informacji o laptopie
    @Override
    public String toString() {
        return "Laptop{" +
                "wielkosc_matrycy=" + wielkosc_matrycy +
                ", szybkoosc_procesora_Mhz=" + szybkoosc_procesora_Mhz +
                ", ilosc_pamieci_Gb=" + ilosc_pamieci_Gb +
                ", pojemnosc_Gb=" + pojemnosc_Gb +
                ", cena=" + cena +
                '}';
    }
}
