import java.util.ArrayList;

class Elf{
    private String imie;
    Integer wiek;
    String stanowisko;

    public Elf(String imie, Integer wiek, String stanowisko){
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }
    public Elf(){
    }

    @Override
    public String toString() {
        return "To ja: " + getImie() + ", pracuję jako " + getStanowisko() + ", choć mam już " + getWiek().toString();
    }

    public String getImie(){
        return imie;
    }
    public Integer getWiek(){
        return wiek;
    }
    public String getStanowisko(){
        return stanowisko;
    }
    public void setImie(String i){
        if(i.length() < 1){
            throw new IllegalArgumentException("Podaj imię Elfa");
        }
        this.imie = i;
    }
    public void setWiek(Integer w){
        if(w <= 0){
            throw new IllegalArgumentException("Elf jest za młody - musi być starszy niż 18 lat.");
        }
        this.wiek = w;
    }
    public void setStanowisko(String s){
        if(s.length()<1){
            throw new IllegalArgumentException("Podaj nazwę stanowiska");
        }
        this.stanowisko = s;
    }
    public void przedstawSie(){
        System.out.println("Cześć, nazywam się " + getImie() + ", mam " + getWiek() + " lat, a moje stanowisko to " + getStanowisko() + ".");
    }

}

class Fabryka{
    private ArrayList<Elf> listaPracownikow = new ArrayList<Elf>();
    private Double dlGeo;
    private Double szGeo;

    public Fabryka(Elf e, Double dl, Double sz){
        this.listaPracownikow.add(e);
        this.dlGeo = dl;
        this.szGeo = sz;
    }

    public Double getDlGeo(){
        return dlGeo;
    }

    public Double getSzGeo(){
        return szGeo;
    }

    @Override
    public String toString() {
        return "dlGeo=" + dlGeo + ", szGeo=" + szGeo + ".";
    }

    public void setDlGeo(Double dl){
        if((dl <= -180) || (dl >= 180)){
            throw new IllegalArgumentException("Wprowadź odpowiednią wartość");
        }
        this.dlGeo = dl;
    }

    public void setSzGeo(Double sz){
        if((sz <= -180) || (sz >= 180)){
            throw new IllegalArgumentException("Wprowadź odpowiednią wartość");
        }
        this.szGeo = sz;
    }


    public void najstarszyPracownik(){
        System.out.println(this.getListaPracownikow().size());
    }

    public ArrayList<Elf> getListaPracownikow() {
        return listaPracownikow;
    }
}
class Renifer{
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc){
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public Renifer(){}

    public String getImie(){
        return imie;
    }

    public int getPredkosc(){
        return predkosc;

    }
    public void nakarmRenifera(int i){
        this.predkosc += i;
    }


}

class Sanie{
    private ArrayList<Renifer> lr = new ArrayList<Renifer>();

    public Sanie(ArrayList<Renifer> lr){
        lr.addAll(lr);
    }


}



public class Main {
    public static void main(String[] args) {
        Elf e = new Elf("Jaromir", 61, "woźnica");
        e.przedstawSie();
        Fabryka f= new Fabryka(e,21.45,21.45);
        Renifer r = new Renifer("Karol", 10);
        System.out.println(r.getImie());
        System.out.println(r.getPredkosc());
        r.nakarmRenifera(5);
        System.out.println(r.getPredkosc());
        System.out.println(e.toString());
        System.out.println(f.toString());
        f.setDlGeo(43527.98);

    }
}