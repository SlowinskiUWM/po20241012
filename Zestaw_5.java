import java.util.ArrayList;
import java.util.Collection;
public class Main {
	
	public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
		tab1.addAll(tab2);
		return tab1;
	}
	
	public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
		int dlTab1 = tab1.size();
		int dlTab2 = tab2.size();
		for(int i = 0; i < dlTab1; i++) {
			tab1.add(2*i+1, tab2.get(i));
		}
		for(int i = (dlTab2-dlTab1); i < dlTab2; i++) {
			tab1.addLast(tab2.get(i));
		}
		return tab1;
	}
	
	public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
		tab1.addAll(tab2);
		tab1.sort(null);
		return tab1;
	}
	
	public static ArrayList<String> toArrayList(String napis){
		ArrayList<String> tab = new ArrayList<String>();
		
		for(int i = 0; i < napis.length(); i++) {
			tab.add(napis.substring(i,i+1));
		}
		tab.sort(null);
		return tab;
	}
	
	public static ArrayList<Integer> toArrayList(int liczba){
		ArrayList<Integer> tab = new ArrayList<Integer>();
		int wykl = 0;
		int w = 1;
		int cyfry = 0;
		while(w != 0) {
			w = liczba/(int) Math.pow(10, wykl);
			wykl++;	
		}
		cyfry = wykl-1;
		for(int i = 0; i < cyfry; i++ ) {
			tab.add(i, ((liczba % (int) Math.pow(10,cyfry-i) - liczba % (int) Math.pow(10, cyfry - i - 1)) / (int)(Math.pow(10, cyfry - i - 1))));
		}
		tab.sort(null);
		return tab;
	}
	
	public static Boolean checkChar(ArrayList<String> tab, char znak) {
		Boolean wynik = false;
		for(int i = 0; i < tab.size(); i++) {
			if(tab.get(i).charAt(0) == znak) {
				wynik = true;
				return wynik;
			}
		}
		return wynik;
	}
	
	public static Boolean checkDigit(ArrayList<Integer> tab, int liczba) {
		Boolean wynik = false;
		for(int i = 0; i < tab.size(); i++) {
			if(tab.get(i) == liczba) {
				wynik = true;
				return wynik;
			}
		}
		return wynik;
	}
	
	public static int countChar(ArrayList<String> tab, char znak) {
		int wynik = 0;
		for(int i = 0; i < tab.size(); i++) {
			if(tab.get(i).charAt(0) == znak) {
				wynik++;
			}
		}
		
		return wynik;
	}
	
	public static int countDigit(ArrayList<Integer> tab, int liczba) {
		int wynik = 0;
		for(int i = 0; i < tab.size(); i++) {
			if(tab.get(i) == liczba) {
				wynik++;
			}
		}
		
		return wynik;
	}
	
	public static ArrayList<ArrayList<String>> uniqueArrayList(ArrayList<String> tab){
		ArrayList<String> rob0 = new ArrayList<String>();
		ArrayList<String> rob1 = new ArrayList<String>();
		ArrayList<ArrayList<String>> wynik = new ArrayList<ArrayList<String>>();
		String tmp;
		int baza;
		int iii = 0;
		rob0.addAll(tab);
		baza = rob0.size();
		while(baza > 0) {
			tmp = rob0.get(0);
			wynik.add(new ArrayList<String>());
			wynik.get(iii).add(0,tmp);
			wynik.get(iii).add(1,"0");
			for(int i = 0; i < rob0.size(); i++) {
				if(!rob0.get(i).equals(tmp)) {
					rob1.addLast(rob0.get(i));
				} else {baza--;}
			}
			rob0.clear();
			rob0.addAll(rob1);
			rob1.clear();
			iii++;
		}
		tab.sort(null);
		return wynik;
	}
	
	public static ArrayList<ArrayList<Integer>> uniqueArrayListInt(ArrayList<Integer> tabint){
		ArrayList<Integer> rob0 = new ArrayList<Integer>();
		ArrayList<Integer> rob1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> wynik = new ArrayList<ArrayList<Integer>>();
		Integer tmp;
		int baza;
		int iii = 0;
		rob0.addAll(tabint);
		baza = rob0.size();
		while(baza > 0) {
			tmp = rob0.get(0);
			wynik.add(new ArrayList<Integer>());
			wynik.get(iii).add(0,tmp);
			wynik.get(iii).add(1,0);
			for(int i = 0; i < rob0.size(); i++) {
				if(!rob0.get(i).equals(tmp)) {
					rob1.addLast(rob0.get(i));
				} else {baza--;}
			}
			rob0.clear();
			rob0.addAll(rob1);
			rob1.clear();
			iii++;
		}
		tabint.sort(null);
		return wynik;
	}
	
	public static ArrayList<ArrayList<String>> countArrayList(ArrayList<String> tab){
		ArrayList<String> rob0 = new ArrayList<String>();
		ArrayList<String> rob1 = new ArrayList<String>();
		ArrayList<ArrayList<String>> wynik = new ArrayList<ArrayList<String>>();
		String tmp;
		int baza;
		int iii = 0;
		int licznik = 0;
		rob0.addAll(tab);
		baza = rob0.size();
		while(baza > 0) {
			tmp = rob0.get(0);
			wynik.add(new ArrayList<String>());
			wynik.get(iii).add(0,tmp);
			for(int i = 0; i < rob0.size(); i++) {
				if(!rob0.get(i).equals(tmp)) {
					rob1.addLast(rob0.get(i));
				} else 
				{
					baza--;
					licznik++;
				}
			}
			String licznikStr = Integer.toString(licznik); 
			wynik.get(iii).add(1,licznikStr);
			licznik = 0;
			rob0.clear();
			rob0.addAll(rob1);
			rob1.clear();
			iii++;
		}
		tab.sort(null);
		return wynik;
	}
	
	public static ArrayList<ArrayList<Integer>> countArrayListInt(ArrayList<Integer> tabint){
		ArrayList<Integer> rob0 = new ArrayList<Integer>();
		ArrayList<Integer> rob1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> wynik = new ArrayList<ArrayList<Integer>>();
		Integer tmp;
		int baza;
		int iii = 0;
		int licznik = 0;
		rob0.addAll(tabint);
		baza = rob0.size();
		while(baza > 0) {
			tmp = rob0.get(0);
			wynik.add(new ArrayList<Integer>());
			wynik.get(iii).add(0,tmp);
			for(int i = 0; i < rob0.size(); i++) {
				if(!rob0.get(i).equals(tmp)) {
					rob1.addLast(rob0.get(i));
				} else {
					baza--;
					licznik++;
					}
			}
			wynik.get(iii).add(1,licznik);
			licznik = 0;
			rob0.clear();
			rob0.addAll(rob1);
			rob1.clear();
			iii++;
		}
		tabint.sort(null);
		return wynik;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Zadanie 1\n");
		
		ArrayList<Integer> tab1 = new ArrayList<Integer>();
		ArrayList<Integer> tab2 = new ArrayList<Integer>();
		ArrayList<Integer> tab3 = new ArrayList<Integer>();
		
		for(int i = 0; i < 6; i++) {
			tab1.add(i,i);
			tab2.add(i,i+10);
		}
		for(int i = 0;i < tab1.size(); i++) {
			System.out.print(tab1.get(i) + " ");
		}
		System.out.println();
		for(int i = 0;i < tab2.size(); i++) {
			System.out.print(tab2.get(i) + " ");
		}
		System.out.println();
		
		tab3 = append(tab1, tab2);
		for(int i = 0;i < tab3.size(); i++) {
			System.out.print(tab3.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("\nZadanie 2\n");
		
		ArrayList<Integer> tab21 = new ArrayList<Integer>();
		ArrayList<Integer> tab22 = new ArrayList<Integer>();
		ArrayList<Integer> tab23 = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			tab21.add(i,i);
		}
		for(int i = 0;i < tab21.size(); i++) {
			System.out.print(tab21.get(i) + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			tab22.add(i,i);
		}
		for(int i = 0;i < tab22.size(); i++) {
			System.out.print(tab22.get(i) + " ");
		}
		System.out.println();
		
		tab23 = merge(tab21, tab22);
		for(int i = 0;i < tab23.size(); i++) {
			System.out.print(tab23.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("\nZadanie 3\n");
		
		ArrayList<Integer> tab31 = new ArrayList<Integer>();
		ArrayList<Integer> tab32 = new ArrayList<Integer>();
		ArrayList<Integer> tab33 = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			tab31.add(i,i);
		}
		for(int i = 0;i < tab31.size(); i++) {
			System.out.print(tab31.get(i) + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			tab32.add(i,2+i);
		}
		for(int i = 0;i < tab32.size(); i++) {
			System.out.print(tab32.get(i) + " ");
		}
		System.out.println();
		
		tab33 = mergeSorted(tab31, tab32);
		for(int i = 0;i < tab33.size(); i++) {
			System.out.print(tab33.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("\nZadanie 4\n");
		
		String napis = "Konstantynopolitańczykowianeczka";
		System.out.println(napis);
		ArrayList<String> tab41 = new ArrayList<String>();
		tab41 = toArrayList(napis);
		
		for(int i = 0; i < tab41.size(); i++) {
			System.out.print(tab41.get(i) + " ");
		}
		System.out.println();
		
		int liczba = 27439;
		ArrayList<Integer> tab42 = new ArrayList<Integer>();
		tab42 = toArrayList(liczba);
		System.out.println(liczba);
		for(int i = 0; i < tab42.size(); i++) {
			System.out.print(tab42.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("\nZadanie 5\n");
		
		char znak = 'o';
		boolean wynik51;
		wynik51 = checkChar(tab41, znak); 
		System.out.println(wynik51);
		
		int liczba52 = 1;
		boolean wynik52;
		wynik52 = checkDigit(tab42, liczba52); 
		System.out.println(wynik52);
		
		System.out.println("\nZadanie 6\n");
		
		char znak6 = 'K';
		int wynik61;
		wynik61 = countChar(tab41, znak6);
		System.out.println(wynik61);
		
		int liczba6 = 0;
		int wynik62;
		wynik62 = countDigit(tab42, liczba6);
		System.out.println(wynik62);
		
		System.out.println("\nZadanie 7\n");
		
		String napis71 = "Kurza dupa";
		ArrayList<String> tab71 = new ArrayList<String>();
		tab71 = toArrayList(napis71);
		ArrayList<ArrayList<String>> wynik71 = new ArrayList<ArrayList<String>>();
		wynik71 = uniqueArrayList(tab71);
		
		for(int i = 0; i < tab71.size();i++) {
			System.out.print(tab71.get(i) + " ");
		}
		System.out.println();
		
		System.out.print("[");
		for(int i = 0; i < wynik71.size();i++) {
			System.out.print("[ " + wynik71.get(i).get(0).charAt(0) + ", " + wynik71.get(i).get(1).charAt(0) + " ]");
		}
		System.out.print("]");
		System.out.println();
		
		int liczba72 = 777777;
		ArrayList<Integer> tab72 = new ArrayList<Integer>();
		tab72 = toArrayList(liczba72);
		ArrayList<ArrayList<Integer>> wynik72 = new ArrayList<ArrayList<Integer>>();
		wynik72 = uniqueArrayListInt(tab72);
		
		for(int i = 0; i < tab72.size();i++) {
			System.out.print(tab72.get(i) + " ");
		}
		System.out.println();
		
		System.out.print("[");
		for(int i = 0; i < wynik72.size();i++) {
			System.out.print("[ " + wynik72.get(i).get(0) + ", " + wynik72.get(i).get(1) + " ]");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.println("\nZadanie 8\n");
		
		String napis81 = "Kurza dupa kurza";
		ArrayList<String> tab81 = new ArrayList<String>();
		tab81 = toArrayList(napis81);
		ArrayList<ArrayList<String>> wynik81 = new ArrayList<ArrayList<String>>();
		wynik81 = countArrayList(tab81);
		
		for(int i = 0; i < tab81.size();i++) {
			System.out.print(tab81.get(i) + " ");
		}
		System.out.println();
		
		System.out.print("[");
		for(int i = 0; i < wynik81.size();i++) {
			System.out.print("[ " + wynik81.get(i).get(0).charAt(0) + ", " + wynik81.get(i).get(1).charAt(0) + " ]");
		}
		System.out.print("]");
		System.out.println();
		
		int liczba82 = 777666805;
		ArrayList<Integer> tab82 = new ArrayList<Integer>();
		tab82 = toArrayList(liczba82);
		ArrayList<ArrayList<Integer>> wynik82 = new ArrayList<ArrayList<Integer>>();
		wynik82 = countArrayListInt(tab82);
		
		for(int i = 0; i < tab82.size();i++) {
			System.out.print(tab82.get(i) + " ");
		}
		System.out.println();
		
		System.out.print("[");
		for(int i = 0; i < wynik82.size();i++) {
			System.out.print("[ " + wynik82.get(i).get(0) + ", " + wynik82.get(i).get(1) + " ]");
		}
		System.out.print("]");
		System.out.println();
		
		
		
	}
	
	
	
	
	
}


