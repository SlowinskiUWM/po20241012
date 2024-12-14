import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

class KoszykZakupowy{
	
	private ArrayList<ArrayList<String>> koszyk = new ArrayList<ArrayList<String>>();
	
	public KoszykZakupowy(ArrayList<ArrayList<String>> k) {
		koszyk.addAll(k);
	}
	public KoszykZakupowy() {
	}
	
	public void zwrocProdukt(String n, Integer i) {
		System.out.println(wyswietlZawartoscKoszyka());
	}

	public Boolean dodajProdukt(ArrayList<ArrayList<String>> produktySklepowe, String n,Integer i) {;		
	Integer idx = 0;
	Integer liczba = 0;
	Boolean flaga = false;
	ArrayList<ArrayList<String>> prod = new ArrayList<ArrayList<String>>();
	prod.addAll(produktySklepowe);
	for(int ii = 0; ii < prod.size(); ii++) {
		if(prod.get(ii).get(0).equals(n) == true) {
			idx = ii;
			if(Integer.valueOf(prod.get(idx).get(2))>=Integer.valueOf(i)) {
				liczba = Integer.valueOf(prod.get(idx).get(2));
				prod.get(idx).set(2, String.valueOf(liczba - i));
				koszyk.add(new ArrayList<String>());
				int a = getKoszykSize();
				koszyk.get(a-1).add(0,n);
				koszyk.get(a-1).add(1,String.valueOf(prod.get(idx).get(1)));
				koszyk.get(a-1).add(2,String.valueOf(i));
				return flaga = true;
				}	
		}
	} return flaga;
	
	}
	public String wyswietlZawartoscKoszyka() {
		StringBuilder strKoszyk = new StringBuilder();
		strKoszyk.append("\nZawartość koszyka:\n");
		for(int i = 0; i < koszyk.size(); i++) {
			strKoszyk.append((i+1) + ". " + koszyk.get(i).get(0) + ", sztuk " + koszyk.get(i).get(2) + "\n");
			}
		String zawKoszyka = strKoszyk.toString();
		return zawKoszyka;
	}
	public int getKoszykSize() {
		return koszyk.size();
	}
	public ArrayList<ArrayList<String>> getKoszyk() {
		return koszyk;
	}
	
	public Double wyswietlCalkowitaWartosc() {
		Double wartosc = 0.00;
		int a = getKoszykSize();
		for(int i = 0; i < a; i++) {
			wartosc += (Double.valueOf(koszyk.get(i).get(1)) * Integer.valueOf(koszyk.get(i).get(2)));	
		}
		return wartosc;	
	}
}
class Zamowienie{

	private String StatusZamowienia;
	private String koszykZakupowy;
	private String Platnosc;
	
	public Zamowienie(String sz, String kz, String p) {
		StatusZamowienia = sz;
		koszykZakupowy =kz;
		Platnosc = p;
	}
	public Zamowienie() {
	}
	
	public void zmienStatusPlatnosci(String s) {
		Platnosc = s;
	}
	public void finalizujZamowienia(){
		if(Platnosc.equals("Opłacone")==true) {
			ustawStatusZamowienia("Gotowe do wysyłki");
		}	
	}
	
	public String getKoszykZakupowy() {
		return koszykZakupowy;
	}

	public void setKoszykZakupowy(String koszykZakupowy) {
		this.koszykZakupowy = koszykZakupowy;
	}

	public void ustawStatusZamowienia(String status) {
		StatusZamowienia = status;
	}
	
	public String getStatusZamowienia() {
		return StatusZamowienia;
	}
	public String getStatusPlatnosci() {
		return Platnosc;
	}
	public String wyswietlZamowienie() {
		StringBuilder zam = new StringBuilder();
		zam.append("Status  zamówienia: \n" + StatusZamowienia + "\n");
		zam.append(getKoszykZakupowy());
		String strZam = zam.toString();
		System.out.println(strZam);
		return strZam;
	}
}
class Klient{
	private String imie;
	private String nazwisko;
	private ArrayList<ArrayList<String>> listaZamowien = new ArrayList<ArrayList<String>>();
	
	public Klient(String i, String n) {
		imie = i;
		nazwisko = n;
	}
	public Klient() {
	}
	public ArrayList<ArrayList<String>> dodajZamowienie(String osoba, String nrZam, String prod, String liczba, String cena) {
		//System.out.println(osoba + " " + nrZam + " " + prod + " " + liczba + " " + cena);
		
		//ArrayList<ArrayList<String>> listaZamowien = new ArrayList<ArrayList<String>>();
		listaZamowien.add(new ArrayList<String>());
		if(listaZamowien.size() <1 ) {
			listaZamowien.get(0).add(0, osoba);
			listaZamowien.get(0).add(1,nrZam);
			listaZamowien.get(0).add(2,prod);
			listaZamowien.get(0).add(3,liczba);
			listaZamowien.get(0).add(4,cena);
		} else {
			listaZamowien.get(listaZamowien.size()-1).add(0, osoba);
			listaZamowien.get(listaZamowien.size()-1).add(1,nrZam);
			listaZamowien.get(listaZamowien.size()-1).add(2,prod);
			listaZamowien.get(listaZamowien.size()-1).add(3,liczba);
			listaZamowien.get(listaZamowien.size()-1).add(4,cena);
		}
		return listaZamowien;
	}
	public void wyswietlHistorieZamowien(ArrayList<ArrayList<String>> lzam) {
		int rozmiar = lzam.size();
		String hist = "";
		for(int i = 0; i < rozmiar; i++) {
			StringBuilder lz = new StringBuilder();
			lz.append(lzam.get(i).get(0) + "\n");
			lz.append(lzam.get(i).get(1) + "\n");
			lz.append(lzam.get(i).get(2) + "\n");
			lz.append(lzam.get(i).get(3) + "\n");
			lz.append(lzam.get(i).get(4) + "\n");
			System.out.println(lz.toString());
		}
	}
	public Double obliczLacznyKosztZamowien(ArrayList<ArrayList<String>> lzam) {
		Double wynik = 0.00;
		for(int i = 0; i < lzam.size(); i++) {
			wynik += Double.valueOf(lzam.get(i).get(4))*Integer.valueOf(lzam.get(i).get(3));
			
		}
		
		return wynik;
	}
	public String getImieNazwisko() {
		return this.imie + " " + this.nazwisko;
	}
	public ArrayList<ArrayList<String>> getListaZamowien(){
		return listaZamowien;
	}
}
class Sklep{
	private ArrayList<ArrayList<String>> produkty = new ArrayList<ArrayList<String>>();
			
	public Sklep() {
	}
	
	public void dodajProdukt(String n, Double c, Integer i){
		produkty.add(new ArrayList<String>());
		int rozmiar = getProduktySize();
		if(rozmiar < 1) {
			produkty.get(0).add(0,n);
			produkty.get(0).add(1,String.valueOf(c));
			produkty.get(0).add(2,String.valueOf(i));
		} else {
			produkty.get(rozmiar - 1).add(0,n);
			produkty.get(rozmiar - 1).add(1,String.valueOf(c));
			produkty.get(rozmiar - 1).add(2,String.valueOf(i));
		}
	}
	public Integer getProduktySize() {
		return produkty.size();
	}
	public ArrayList<ArrayList<String>> getProdukty(){
		return produkty;
	}
	
	public void wyswietlOferty() {
		for(int i = 0; i < produkty.size(); i++) {
			StringBuilder of = new StringBuilder();
			of.append(produkty.get(i).get(0) + ", cena = ");
			of.append(produkty.get(i).get(1) + ", ilość = ");
			of.append(produkty.get(i).get(2));
			System.out.println(of.toString());
		}
	}
	
	public Integer wyszukajProduktu(String n, Boolean tf) {
		Integer idx;
		Boolean flaga = false;
		for(int i = 0; i < produkty.size(); i++){
			if(produkty.get(i).get(0).equals(n)) {
				if(tf == true)
					System.out.println("\nSzukany produkt:\n" + produkty.get(i).get(0) + ", " + produkty.get(i).get(1) + ", " + produkty.get(i).get(2));
				flaga = true;
				return idx = i;
				} 
			}
		if(flaga == false)
			if(tf == true)
				System.out.println("\nSzukanego produktu nie ma w sklepie\n");
			return idx = -1;
	}

	public ArrayList<ArrayList<String>> zakupy(ArrayList<ArrayList<String>> produkty, String n, Integer i, ArrayList<ArrayList<String>> koszyk) {
		Integer idx = Integer.valueOf(wyszukajProduktu(n, false));
		Integer liczba;
		koszyk.add(new ArrayList<String>());
		if((idx >= 0) && (Integer.valueOf(produkty.get(idx).get(2)) >= i)){
			liczba = Integer.valueOf(produkty.get(idx).get(2)) - i;
			produkty.get(idx).set(2, String.valueOf(liczba));
			if(koszyk.size()<1) {
				koszyk.get(0).add(0,produkty.get(idx).get(0));
				koszyk.get(0).add(1,produkty.get(idx).get(1));
				koszyk.get(0).add(2,String.valueOf(i));
			} else {
				koszyk.get(koszyk.size() - 1).add(0,produkty.get(idx).get(0));
				koszyk.get(koszyk.size() - 1).add(1,produkty.get(idx).get(1));
				koszyk.get(koszyk.size() - 1).add(2,String.valueOf(i));
			}
			}
		return koszyk;
	}	
}
class Platnosc{
	private Double kwota;
	private String statusPlatnosci;
	
	public Platnosc(Double k, String sp){
		kwota = k;
		statusPlatnosci = sp;
	}
	public Platnosc() {}
	
	public void zaplac() {
		statusPlatnosci = "Opłacone";
		kwota = 0.00;
	}
	//public void zakupy(Double k) {
	//	kwota = k;
	//}
	public Double getKwota() {
		return kwota;
	}
	public String getStatusPlatnosci() {
		return statusPlatnosci;
	}
	
}


public class Zestaw_6 {

	public static void main(String[] args) {
		
		System.out.println("\nTestowanie klasy KoszykZakupowy\n");
		
		//ZAKUPY
		
		Sklep sk0 = new Sklep();
		sk0.dodajProdukt("Chleb", 8.00, 25);
		sk0.dodajProdukt("Mleko", 4.00, 50);
		sk0.dodajProdukt("Piwo", 5.00, 100);
		sk0.dodajProdukt("Kawa", 100.00, 10);
		sk0.dodajProdukt("Woda mineralna", 3.00, 100);
		sk0.dodajProdukt("Winogrona", 8.45, 20);
		sk0.dodajProdukt("Olej", 14.55, 20);
		
		
		Klient k0 = new Klient("Dariusz","Słowiński");
		KoszykZakupowy kz0 = new KoszykZakupowy();
		
		sk0.wyswietlOferty();
		
		sk0.zakupy(sk0.getProdukty(), "Chleb", 2, kz0.getKoszyk());
		sk0.zakupy(sk0.getProdukty(), "Mleko", 2, kz0.getKoszyk());
		
		System.out.println(kz0.wyswietlZawartoscKoszyka());
		System.out.println("Koszt = " + kz0.wyswietlCalkowitaWartosc());
		
		Platnosc pl0 = new Platnosc(kz0.wyswietlCalkowitaWartosc(),"Nieopłacone");
		
		System.out.println(pl0.getKwota());
		System.out.println(pl0.getStatusPlatnosci());
		
		Zamowienie zam0 = new Zamowienie("W przygotowaniu",kz0.wyswietlZawartoscKoszyka(),"Nieopłacona");
		System.out.println(zam0.wyswietlZamowienie());
		pl0.zaplac();
		zam0.zmienStatusPlatnosci("Opłacone");
		zam0.finalizujZamowienia();
		System.out.println(zam0.getStatusPlatnosci());
		System.out.println(zam0.getStatusZamowienia());
		kz0.zwrocProdukt("Chleb", 1);
		
		
		
		
		
		/*
		KoszykZakupowy kz0 = new KoszykZakupowy();
		kz0.dodajProdukt(sk0.getProdukty(), "Chleb", 2);
		kz0.dodajProdukt(sk0.getProdukty(), "Mleko", 5);
		kz0.dodajProdukt(sk0.getProdukty(), "Piwo",  4);
		kz0.dodajProdukt(sk0.getProdukty(), "Winogrona", 2);
		kz0.dodajProdukt(sk0.getProdukty(), "Kawa", 1);
		
		//System.out.println(kz0.wyswietlZawartoscKoszyka());
		//System.out.println(kz0.wyswietlCalkowitaWartosc());
		
		//sk0.wyswietlOferty();
		
		//========================================================================
		System.out.println("\nTestowanie klasy Zamowienie\n");
		
		KoszykZakupowy kz01 = new KoszykZakupowy(kz0.getKoszyk());
		Zamowienie zam0 = new Zamowienie();
		
		zam0.setKoszykZakupowy(kz01.wyswietlZawartoscKoszyka());
		//System.out.println(zam0.getKoszykZakupowy());
		zam0.ustawStatusZamowienia("W przygotowaniu");
		zam0.wyswietlZamowienie();
		
		KoszykZakupowy kz02 = new KoszykZakupowy();
		kz02.dodajProdukt(sk0.getProdukty(), "Chleb", 2);
		kz02.dodajProdukt(sk0.getProdukty(), "Mleko", 5);
		kz02.dodajProdukt(sk0.getProdukty(), "Piwo",  4);
		
		//System.out.println(kz02.wyswietlZawartoscKoszyka());
		//System.out.println(kz02.wyswietlCalkowitaWartosc());
		
		//sk0.wyswietlOferty();
		Zamowienie zam2 = new Zamowienie();
		zam2.setKoszykZakupowy(kz02.wyswietlZawartoscKoszyka());
		zam2.ustawStatusZamowienia("Również w przygotowaniu");
		zam2.wyswietlZamowienie();
		
		
		//========================================================================
		System.out.println("\nTestowanie klasy Klient\n");
		
		String osoba;
		Klient k0 = new Klient("Dariusz", "Słowiński");
		osoba = k0.getImieNazwisko();
		
		//System.out.println(kz01.getKoszyk().size());

		for(int i = 0; i < kz01.getKoszyk().size(); i++) {
			k0.dodajZamowienie(osoba, "1", kz01.getKoszyk().get(i).get(0),kz01.getKoszyk().get(i).get(2) , kz01.getKoszyk().get(i).get(1));
			//System.out.println(k0.getListaZamowien().size());
		}
		for(int i = 0; i < kz02.getKoszyk().size(); i++) {
			k0.dodajZamowienie(osoba, "2", kz02.getKoszyk().get(i).get(0),kz02.getKoszyk().get(i).get(2) , kz02.getKoszyk().get(i).get(1));
			//System.out.println(k0.getListaZamowien().size());
		}
		
		k0.wyswietlHistorieZamowien(k0.getListaZamowien());
		System.out.println(k0.obliczLacznyKosztZamowien(k0.getListaZamowien()));
		
		//========================================================================
		System.out.println("\nTestowanie klasy Sklep\n");
		
		sk0.dodajProdukt("Olej", 14.55, 20);
		
		
		sk0.wyszukajProduktu("Olej", true);
		System.out.println(sk0.wyszukajProduktu("Olej", false));
		sk0.wyszukajProduktu("Nafta", true);
		System.out.println(sk0.wyszukajProduktu("Nafta", false));
		
		KoszykZakupowy kz03 = new KoszykZakupowy();
		
		sk0.wyswietlOferty();
		sk0.zakupy(sk0.getProdukty(), "Olej", 2, kz03.getKoszyk());
		sk0.zakupy(sk0.getProdukty(), "Chleb", 2, kz03.getKoszyk());
		sk0.zakupy(sk0.getProdukty(), "Woda mineralna", 5, kz03.getKoszyk());
		
		System.out.println(kz03.getKoszykSize());
		
		
		for(int i = 0; i < kz03.getKoszyk().size(); i++) {
			k0.dodajZamowienie(osoba, "3", kz03.getKoszyk().get(i).get(0),kz03.getKoszyk().get(i).get(2) , kz03.getKoszyk().get(i).get(1));
		}
		k0.wyswietlHistorieZamowien(k0.getListaZamowien());
		System.out.println(k0.obliczLacznyKosztZamowien(k0.getListaZamowien()));
		
		//==========================================================================
		System.out.println("\nTestowanie klasy Platnosc\n");
		
		Zamowienie zam04 = new Zamowienie("Nieopłacone", "", "Nieopłacone");
		KoszykZakupowy kz04 = new KoszykZakupowy();
		

		sk0.zakupy(sk0.getProdukty(), "Olej", 4, kz04.getKoszyk());
		sk0.zakupy(sk0.getProdukty(), "Chleb", 2, kz04.getKoszyk());
		sk0.zakupy(sk0.getProdukty(), "Woda mineralna", 1, kz04.getKoszyk());
	
		
		
		for(int i = 0; i < kz04.getKoszyk().size(); i++) {
			k0.dodajZamowienie(osoba, "4", kz04.getKoszyk().get(i).get(0),kz04.getKoszyk().get(i).get(2) , kz04.getKoszyk().get(i).get(1));
		}
		
		Platnosc p0 = new Platnosc(kz04.wyswietlCalkowitaWartosc(),"Nieopłacone");
		System.out.println(p0.getKwota());
		System.out.println(p0.getStatusPlatnosci());
		
		
		p0.zaplac();
		System.out.println(p0.getKwota());
		System.out.println(p0.getStatusPlatnosci());
		
		
		
		
		
		
		
		
		
		
		
	

		Zamowienie zam = new Zamowienie();
		zam.setKoszykZakupowy(kz.wyswietlZawartoscKoszyka());
		zam.ustawStatusZamowienia("Gotowe do wysyłki");
		zam.wyswietlZamowienie();
		
		System.out.println("\nTworzenie zamówienia dla klienta:\n");
				// 1. Dodanie klienta
				// 2. Dodanie wymaganych produktów
				// 3. Dodanie produktów do koszyka
				// 4. Ustawienie statusu zamówienia "Gotowe do wysyłki"
				// 5. Dodanie zamówienia do listy zamówień klienta
		Klient k = new Klient("Dariusz", "Słowiński");	// Dodanie klienta
		System.out.println(k.getImieNazwisko());
		
		Sklep sk0 = new Sklep();
		sk0.dodajProdukt("Chleb", 8.00, 25);
		sk0.dodajProdukt("Mleko", 4.00, 50);
		sk0.dodajProdukt("Piwo", 5.00, 100);
		sk0.dodajProdukt("Kawa", 100.00, 10);
		sk0.dodajProdukt("Woda mineralna", 3.00, 100);
		sk0.dodajProdukt("Winogrona", 8.45, 20);
		
		KoszykZakupowy kz = new KoszykZakupowy();		// Dodanie produktów do koszyka
		kz.dodajProdukt(sk0.getProdukty(), "Chleb", 4);
		kz.dodajProdukt(sk0.getProdukty(), "Woda mineralna", 6);
		kz.dodajProdukt(sk0.getProdukty(), "Piwo", 10);
		kz.dodajProdukt(sk0.getProdukty(), "Kawa", 1);

		Zamowienie zam = new Zamowienie("","","");
		zam.setKoszykZakupowy(kz.wyswietlZawartoscKoszyka());
		zam.ustawStatusZamowienia("Zamówienie 1 - gotowe do wysyłki");

		ArrayList<ArrayList<String>> historia = new ArrayList<ArrayList<String>>();
		historia.add(new ArrayList<String>());
		ArrayList<ArrayList<String>> zamow;
		zamow = k.dodajZamowienie("1",zam.getStatusZamowienia(),kz.wyswietlZawartoscKoszyka(),String.valueOf(kz.wyswietlCalkowitaWartosc()) );
		historia.get(0).add(0,String.valueOf(zamow.get(0).get(0)));
		historia.get(0).add(1,String.valueOf(zamow.get(0).get(1)));
		historia.get(0).add(2,String.valueOf(zamow.get(0).get(2)));
		historia.get(0).add(3,String.valueOf(zamow.get(0).get(3)));
		
		KoszykZakupowy kz2 = new KoszykZakupowy();		// Dodanie produktów do 2 koszyka
		kz2.dodajProdukt(x, 1);
		kz2.dodajProdukt(c, 5);
		kz2.dodajProdukt(b, 1);

		Zamowienie zam2 = new Zamowienie("","","");
		zam2.setKoszykZakupowy(kz2.wyswietlZawartoscKoszyka());
		zam2.ustawStatusZamowienia("Zamówienie 2 - gotowe do wysyłki");
				
		historia.add(new ArrayList<String>());
		zamow = null;
		zamow = k.dodajZamowienie("2",zam2.getZamowienie(),kz2.wyswietlZawartoscKoszyka(),String.valueOf(kz2.wyswietlCalkowitaWartosc()) );
		historia.get(1).add(0,String.valueOf(zamow.get(0).get(0)));
		historia.get(1).add(1,String.valueOf(zamow.get(0).get(1)));
		historia.get(1).add(2,String.valueOf(zamow.get(0).get(2)));
		historia.get(1).add(3,String.valueOf(zamow.get(0).get(3)));

		KoszykZakupowy kz3 = new KoszykZakupowy();		// Dodanie produktów do 2 koszyka
		kz3.dodajProdukt(a, 1);
		kz3.dodajProdukt(x, 1);
		kz3.dodajProdukt(y, 3);
		kz3.dodajProdukt(z, 3);
		kz3.dodajProdukt(b, 3);
		
		Zamowienie zam3= new Zamowienie("","","");
		zam3.setKoszykZakupowy(kz3.wyswietlZawartoscKoszyka());
		zam3.ustawStatusZamowienia("Zamówienie 3 - gotowe do wysyłki");
				
		historia.add(new ArrayList<String>());
		zamow = null;
		zamow = k.dodajZamowienie("3",zam3.getStatusZamowienia(),kz3.wyswietlZawartoscKoszyka(),String.valueOf(kz3.wyswietlCalkowitaWartosc()) );
		historia.get(2).add(0,String.valueOf(zamow.get(0).get(0)));
		historia.get(2).add(1,String.valueOf(zamow.get(0).get(1)));
		historia.get(2).add(2,String.valueOf(zamow.get(0).get(2)));
		historia.get(2).add(3,String.valueOf(zamow.get(0).get(3)));

		
		k.wyswietlHistorieZamowien(historia);
		System.out.println("Suma wydatków = " + k.obliczLacznyKosztZamowien(historia));
		
		System.out.println("\nTestowanie klasy Sklep i klasy Platnosc:\n");
		
		Sklep sk = new Sklep();
		KoszykZakupowy kzs = new KoszykZakupowy();
		Platnosc pl = new Platnosc();
		
		sk.dodajProdukt("Chleb", 8.00, 25);
		sk.dodajProdukt("Mleko", 4.00, 50);
		sk.dodajProdukt("Piwo", 5.00, 100);
		sk.dodajProdukt("Kawa", 100.00, 10);
		sk.dodajProdukt("Woda mineralna", 3.00, 100);
		sk.dodajProdukt("Winogrona", 8.45, 20);
		
		ArrayList<ArrayList<String>> koszSklepowy = new ArrayList<ArrayList<String>>();
		
		kzs = sk.zakupy(sk.getProdukty(),"Piwo", 10, kzs);
		kzs = sk.zakupy(sk.getProdukty(),"Mleko", 10, kzs);
		kzs = sk.zakupy(sk.getProdukty(),"Winogrona", 5, kzs);
		
		koszSklepowy.addAll(kzs.getKoszyk());
		
		KoszykZakupowy kk = new KoszykZakupowy(koszSklepowy);
		System.out.println("Koszyk = " + kk.wyswietlZawartoscKoszyka());
		System.out.println("Wartość koszyka = " + kk.wyswietlCalkowitaWartosc());
		System.out.println("Kwota przed zakupami = " + pl.getKwota());
		//System.out.println(kzs.wyswietlZawartoscKoszyka2(kzs.getKoszyk()));
		//System.out.println("Wartość koszyka = " + kzs.wyswietlCalkowitaWartosc2(kzs.getKoszyk()));
		pl.zakupy(kk.wyswietlCalkowitaWartosc());
		System.out.println("Kwota po zakupach = " + pl.getKwota());
		System.out.println(pl.getStatusPlatnosci());
		pl.zaplac();
		System.out.println("Kwota po zapłaceniu = " + pl.getKwota());
		System.out.println("Platnosc.statusPlatnosci: " + pl.getStatusPlatnosci());
		//zamo.zmienStatusPlatnosci("Opłacone");
		//System.out.println("Zamowienie.Platnosc = " + zamo.getStatusPlatnosci());
		//System.out.println("Zamowienie.statusZamowienia = " + zamo.getZamowienie());
*/
	}
}
