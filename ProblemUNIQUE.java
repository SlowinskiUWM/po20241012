import java.util.ArrayList;
public class Main {
	
	public static ArrayList<String> toArrayList(String napis){
		ArrayList<String> tab = new ArrayList<String>();
		for(int i = 0; i < napis.length(); i++) {
			tab.add(napis.substring(i,i+1).trim());
		}
		//tab.sort(null);
		return tab;
	}
	
	public static ArrayList<ArrayList<String>> uniqueTest(ArrayList<String> tab){
		ArrayList<String> rob0 = new ArrayList<String>();
		ArrayList<String> rob1 = new ArrayList<String>();
		ArrayList<ArrayList<String>> wynik = new ArrayList<ArrayList<String>>();
		String tmp;
		rob0.addAll(tab);
		int baza = rob0.size();
		int iii = 0;
		
		while(baza > 0) {
			tmp = rob0.get(0);
			wynik.add(new ArrayList<String>());
			wynik.get(iii).add(0,tmp);
			wynik.get(iii).add(1,"0");
			for(int i = 0; i < rob0.size(); i++) {
				if(rob0.get(i) != tmp) {
					rob1.addLast(rob0.get(i));
				} else {baza--;}
			}
			rob0.clear();
			rob0.addAll(rob1);
			rob1.clear();
			iii++;
		}
		// wynik.sort(null);
		return wynik;
	}

	public static void main(String[] args) {
		System.out.println("Testowanie UNIQUE\n");
		
		ArrayList<String> tabQ = new ArrayList<String>();
		ArrayList<String> tabR = new ArrayList<String>();
		ArrayList<ArrayList<String>> uniqueQ = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> uniqueR = new ArrayList<ArrayList<String>>();
		
		tabQ.add("X");
		tabQ.add("A");
		tabQ.add("A");
		tabQ.add("B");
		tabQ.add("A");
		tabQ.add("B");
		tabQ.add("C");
		tabQ.add("B");
		tabQ.add("X");
		
		// String napis = "Konstantynopolitańczykowianeczka";
		String napis = "XAABABCBX";
		tabR = toArrayList(napis);
		
		for(int i = 0; i < tabQ.size();i++){
			System.out.print(tabQ.get(i).charAt(0) + " ");
		}
		System.out.println("\nDługość tablicy 'tabQ' ze wszystkimi elementami = " + tabQ.size() + "\n");
		
		uniqueQ = uniqueTest(tabQ);
		for(int i = 0; i < uniqueQ.size();i++){
			System.out.print("[ " + uniqueQ.get(i).get(0).charAt(0) + ", " + uniqueQ.get(i).get(1).charAt(0) + " ]" );
		}
		System.out.println("\nDługość tablicy 'uniqueQ' z unikalnymi elementami = " + uniqueQ.size() + "\n");
		
		for(int i = 0; i < tabR.size();i++){
			System.out.print(tabR.get(i).charAt(0) + " ");
		}
		System.out.println("\nDługość tablicy 'tabR' ze wszystkimi elementami = " + tabR.size() + "\n");
	
		uniqueR = uniqueTest(tabR);
		for(int i = 0; i < uniqueR.size();i++){
			System.out.print("[ " + uniqueR.get(i).get(0).charAt(0) + ", " + uniqueR.get(i).get(1).charAt(0) + " ]" );
		}
		System.out.println("\nDługość tablicy 'uniqueR' z unikalnymi elementami = " + uniqueR.size());
	

	}

}
