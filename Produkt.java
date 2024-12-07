public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public static void wyswietlInformacje(Produkt produkt) {
        System.out.println(produkt.nazwa);
        System.out.println(produkt.cena);
        System.out.println(produkt.iloscNaMagazynie);
    }

    public static void dodajDoMagazynu(Produkt produkt, int liczba){
        produkt.iloscNaMagazynie += liczba;
    }

    public static void usunZMagazynu(Produkt produkt, int liczba){
        if(produkt.iloscNaMagazynie >= liczba){
            produkt.iloscNaMagazynie -= liczba;
        }
        else{
            System.out.println("W magazynie jest obecnie zbyt mała liczba towaru " + produkt.nazwa + " : "+ produkt.iloscNaMagazynie + "\nOPERACJA NIEMOŻLIWA DO WYKONANIA!");
        }

    }

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public static void main(String[] args) {


    }
}
