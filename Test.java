class Superklasa{
	
	private String skPole;
	private String pole2;
	
	public Superklasa(String skp, String p2) {
		skPole = skp;
		pole2 = p2;
	}
	public Superklasa() {
	}
	
	public Integer myHashCode() {
		return skPole.concat(pole2).hashCode();
	}
	
	public String getPole2() {
		return pole2;
	}
	
	public String getSkPole() {
		return skPole;
	}
	
	public void setSkPole(String skp) {
		skPole = skp;
	}
	
	
	
	public void superMetoda() {
		System.out.println("Jestem superklasą!!!");
	}

}

class Podklasa1{
	
	private String pk1Pole;
	private String test;
	
	public Podklasa1(String s) {
		pk1Pole = s;
	}
	
	public Podklasa1() {
	}
	
	public void setTest(String s) {
		if(s.equals("Dariusz")) {
			throw new IllegalArgumentException("SPADAJ, DARUŚ");
		}
		test = s;
	}
	
	public String getTest() {
		return test;
	}
	
	public int hashCode() {
		return test.hashCode();
		}
	
	
	
	public Integer myHashCode() {
		return pk1Pole.hashCode();
	}
	
	public String getPk1Pole() {
		return pk1Pole;
	}
	
	public void setPk1Pole(String s) {
		pk1Pole = s;
	}
	
	public void superMetoda() {
		System.out.println("Jestem Podklasą nr 1");
	}
}

class Podklasa2{
	
	private String imie;
	private String nazwisko;
	private Integer wiek;
	
	public Podklasa2(String i, String n, Integer w) {
		imie = i;
		nazwisko = n;
		wiek = w;
	}
	
	public String getImie() {
		return imie;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	
	public Integer getWiek() {
		return wiek;
	}
	
	public int hashCode() {
		return imie.concat(nazwisko).concat(String.valueOf(wiek)).hashCode();	}
	
	public void superMetoda() {
		System.out.println("Jestem Podklasą nr 2");
	} 
	
}
public class Test {
	
	public static String info(String s) {
		String qq = "Cześć! Jestem " + s.getClass();
		return qq;
	}
	public static String info(Class s) {
		String qq = "Cześć! Jestem <" + s.getName() + ">";
		return qq;
	}

	public static void main(String[] args) {
		Superklasa sk = new Superklasa("Ahoj tam, na tratwie!!!", "Topole");
		Podklasa1 pk1 = new Podklasa1(sk.getSkPole().concat(sk.getPole2()));
		Podklasa2 pk2 = new Podklasa2("Dariusz", "Słowiński", 61);
		
		sk.superMetoda();
		pk1.superMetoda();
		pk2.superMetoda();
		
		//sk.setSkPole("QQRYQ");
		//pk1.setPk1Pole(sk.getSkPole());
		//System.out.println(sk.getSkPole());
		//System.out.println(pk1.getPk1Pole());
		//System.out.println(info(pk1.getClass()));
		
		System.out.println(sk.getSkPole().concat(sk.getPole2()));
		System.out.println(sk.myHashCode());
		System.out.println(pk1.getPk1Pole());
		System.out.println(pk1.myHashCode());
		System.out.println(sk.getPole2());
		
		
		if(sk.myHashCode().equals(pk1.myHashCode())==true) {
			System.out.println("OK");
		} else {
			System.out.println("DUPA");
		}
		
		Podklasa1 pk11 = new Podklasa1(pk2.getImie().concat(pk2.getNazwisko().concat(String.valueOf(pk2.getWiek()))));
		
		pk11.setTest(pk2.getImie().concat(pk2.getNazwisko().concat(String.valueOf(pk2.getWiek()))));
		
		Integer pk2hc = Integer.valueOf(pk2.hashCode());
		Integer pk11hc = Integer.valueOf(pk11.hashCode());
		
		if(pk2hc.equals(pk11hc)==true) {
			System.out.println("OKOK");
		} else {
			System.out.println("DUPADUPA");
		}
		
		System.out.println(pk2.getImie().concat(pk2.getNazwisko().
				concat(pk2.toString().valueOf(pk2.getWiek()))));
		System.out.println(pk11.getTest());
		
		pk11.setTest("Dariusz");
		System.out.println(pk11.getTest());
		
		
		

	}
}
