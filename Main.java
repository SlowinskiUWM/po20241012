public class Main{

    public static void main(String[] args) {

        Produkt mojProdukt1 = new Produkt("QQRYQ",25.45, 10);
        Produkt.wyswietlInformacje(mojProdukt1);

        Produkt mojProdukt2 = new Produkt("AQQ", 30.00, 100);
        mojProdukt2.nazwa = "AQQ";
        mojProdukt2.cena = 50.75;
        mojProdukt2.iloscNaMagazynie = 25;
        Produkt.wyswietlInformacje(mojProdukt2);

        Produkt.dodajDoMagazynu(mojProdukt1, 10);
        Produkt.wyswietlInformacje(mojProdukt1);

        Produkt.dodajDoMagazynu(mojProdukt2, 10);
        Produkt.wyswietlInformacje(mojProdukt2);

        Produkt.usunZMagazynu(mojProdukt1,200);
        Produkt.wyswietlInformacje(mojProdukt1);

        Produkt mojProdukt3 = new Produkt("QrzaTwarz",100.25,47);
        Produkt.wyswietlInformacje(mojProdukt3);

        KoszykZakupowy koszyk1 = new KoszykZakupowy("QQRYQ", 10);



    }
}

