//Klasa Komputer reprezentuje obiekt komputera.
//        Zawiera informacje takie jak: szybkość procesora, ilość pamięci RAM, pojemność dysku twardego oraz cenę.

public class Komputer {

    int szybkoosc_procesora_Mhz;
    int ilosc_pamieci_Gb;
    int pojemnosc_Gb;
    int cena;

    //konstruktor bezparametrowy
    public Komputer() {
    }

    //konstruktor z parametrami
    public Komputer(int szybkoosc_procesora_Mhz, int ilosc_pamieci_Gb, int pojemnosc_Gb, int cena) {
        this.szybkoosc_procesora_Mhz = szybkoosc_procesora_Mhz;
        this.ilosc_pamieci_Gb = ilosc_pamieci_Gb;
        this.pojemnosc_Gb = pojemnosc_Gb;
        this.cena = cena;
    }
    //gettery i settery
    public int getSzybkoosc_procesora_Mhz() {
        return szybkoosc_procesora_Mhz;
    }

    public void setSzybkoosc_procesora_Mhz(int szybkoosc_procesora_Mhz) {
        this.szybkoosc_procesora_Mhz = szybkoosc_procesora_Mhz;
    }

    public int getIlosc_pamieci_Gb() {
        return ilosc_pamieci_Gb;
    }

    public void setIlosc_pamieci_Gb(int ilosc_pamieci_Gb) {
        this.ilosc_pamieci_Gb = ilosc_pamieci_Gb;
    }

    public int getPojemnosc_Gb() {
        return pojemnosc_Gb;
    }

    public void setPojemnosc_Gb(int pojemnosc_Gb) {
        this.pojemnosc_Gb = pojemnosc_Gb;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "szybkoosc_procesora_Mhz=" + szybkoosc_procesora_Mhz +
                ", ilosc_pamieci_Gb=" + ilosc_pamieci_Gb +
                ", pojemnosc_Gb=" + pojemnosc_Gb +
                ", cena=" + cena +
                '}';
    }
}
