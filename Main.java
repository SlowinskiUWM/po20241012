import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    // FUNKCJA TRÓJKI PITAGOERJSKIE
    public static int trojkiPitagorejskie(int n){
        int a = 1;
        int b = 2;
        int c = 3;
        int licznik = 0;
        double epsilon = 0.001;
        while(a <= (n-2)){
            while(b <= (n-1)){
                while(c <= n){
                    if(Math.abs(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) <= epsilon) {
                        licznik++;
                        System.out.println(licznik + ". a = " + (a) + ", b = " + (b) + ", c = " + (c) + ", a*a + b*b = " + (int) (Math.pow(a, 2) + Math.pow(b, 2)) + ", c*c = " + (int) Math.pow(c, 2));
                    }
                    c++;
                }
                b++;
                c = b+1;
                }
            a++;
            b = a+1;
            c = b+1;
            }
        return 0;
    }
    // FUNKCJA CZY PALINDROM
    public static boolean czyPalindrom(int p) {
        // ETAP 1: Obliczenie liczby cyfr w podanej liczbie p
        int dzielnik = 1;
        int liczba_cyfr = 0;
        int q = 10;
        int licznik = 0;
        int suma = 0;
        while (p > (p % dzielnik)) {
            // System.out.println(p % dzielnik);
            liczba_cyfr++;
            dzielnik *= 10;

        }

        // ETAP 2: Tworzenie tablicy (tablicaP) do przechowywania cyfr liczby p
        int[] tablicaP = new int[liczba_cyfr];
        int el_1 = 0;
        int el_2 = 0;
        for (int i = liczba_cyfr - 1; i >= 0; i--) {
            licznik++;
            if (licznik < 2) {
                tablicaP[i] = (p % q);
                continue;
            }
            el_1 = p % q;
            q *= 10;
            el_2 = p % q;
            tablicaP[i] = (el_2 - el_1) / (q / 10);

        }
        // ETAP 3: Zapis odwróconej tablicy tablicaP do nowej tablicy tablicaN
        int[] tablicaN = new int[liczba_cyfr];
        for (int i = 0; i < liczba_cyfr; i++) {
            tablicaN[i] = tablicaP[liczba_cyfr - 1 - i];
        }
        for (int i = 0; i < liczba_cyfr; i++) {
            System.out.print(tablicaP[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < liczba_cyfr; i++) {
            System.out.print(tablicaN[i] + " ");
        }
        System.out.println(" ");

        // ETAP 4: Obliczenie różnicy obu tablic: jeżeli wynosi zero, liczba p jest palindromem

        int[] roznica = new int[liczba_cyfr];
        for (int i = 0; i < liczba_cyfr; i++) {
            roznica[i] = Math.abs(tablicaP[i] - tablicaN[i]);
        }

        for (int i = 0; i < liczba_cyfr; i++) {
            System.out.print(roznica[i] + " ");
        }
        System.out.println(" ");

        suma = Arrays.stream(roznica).sum();
        if(suma == 0) {
            return true;
        } else {
            return false;
        }
    }
    // FUNKCJA GENERUJ TABLICE
    @org.jetbrains.annotations.NotNull
    public static int[] generujTablice(int nn, int MinWartosc, int MaxWartosc){
        int[] tab = new int[nn];

        for(int i = 0; i < nn; i++){
            tab[i] = (int)((Math.random() * (MaxWartosc-MinWartosc) + MinWartosc));
        }
        for(int i = 0; i < nn; i++){
            System.out.print(tab[i] + " ");
        }
        return tab;
    }
    // FUNKCJA NAJDŁUŻSZY CIĄG DODATNICH (I UJEMNYCH)
    public static OptionalInt[] NajdluzszyCiagDodatnich(int[] tab){
        int[] dodatnie = new int[tab.length];
        int[] ujemne = new int[tab.length];
        OptionalInt[] wynik = new OptionalInt[2];
        int el_0 = 0;
        int el_1 = 0;
        int ile_dodatnich = 0;
        int ile_ujemnych = 0;
        int dodatnie_puste = 0;
        int ujemne_puste = 0;
        OptionalInt wynikMax_dod;
        OptionalInt wynikMax_uje;

        for(int i=0;i<tab.length;i++) {
            el_1 = tab[i];
            if ((el_0 == 0) && (el_1 >= 0)) {
                ile_dodatnich++;
            } else {
            if ((el_0 == 0) && (el_1 < 0)) {
                ile_ujemnych++;
            } else {
            if ((el_0 >= 0) && (el_1 >= 0)) {
                ile_dodatnich++;
                if(i+1 == tab.length) {
                    dodatnie[dodatnie_puste] = ile_dodatnich;
                    ile_dodatnich = 0;
                    dodatnie_puste++;
                }
            } else {
            if ((el_0 >= 0) && (el_1 < 0)) {
                dodatnie[dodatnie_puste] = ile_dodatnich;
                ile_dodatnich = 0;
                ile_ujemnych++;
                dodatnie_puste++;
                if(i+1 == tab.length) {
                    ujemne[ujemne_puste] = ile_ujemnych;
                    ile_ujemnych = 0;
                    ujemne_puste++;
                }
            } else {
            if ((el_0 < 0) && (el_1 < 0)) {
                ile_ujemnych++;
                if(i+1 == tab.length) {
                    ujemne[ujemne_puste] = ile_ujemnych;
                    ile_ujemnych = 0;
                    ujemne_puste++;
                }
            } else {
            if ((el_0 < 0) && (el_1 >= 0)) {
                ujemne[ujemne_puste] = ile_ujemnych;
                ile_ujemnych = 0;
                ile_dodatnich++;
                ujemne_puste++;
                if(i+1 == tab.length) {
                    dodatnie[dodatnie_puste] = ile_dodatnich;
                    ile_dodatnich = 0;
                    dodatnie_puste++;
                }
            }}}}}}

                    el_0 = el_1;
        }

        System.out.println(" ");
        for(int k=0;k<tab.length;k++){
            System.out.print(dodatnie[k] + " ");
            }
        System.out.println(" ");
        for(int m=0;m<tab.length;m++){
           System.out.print(ujemne[m] + " ");
                }

        wynikMax_dod = Arrays.stream(dodatnie).max();
        System.out.println(" ");
        System.out.println(wynikMax_dod.getAsInt());
        wynikMax_uje = Arrays.stream(ujemne).max();
        System.out.println(" ");
        System.out.println(wynikMax_uje.getAsInt());
        wynik[0] = wynikMax_dod;
        wynik[1] = wynikMax_uje;
                return  wynik;
    }
    public static void main(String[] args) {
        int n = 15;
        int p =1230321;
        int nn = 50;
        int min = -20;
        int maks = 100;
        int[] mojaTablica;
        OptionalInt[] max_dod_uje;

        trojkiPitagorejskie(n);
        System.out.println(czyPalindrom(p));
        mojaTablica = generujTablice(nn,min,maks);
        max_dod_uje = NajdluzszyCiagDodatnich(mojaTablica);
        System.out.println(" ");
        for(int i=0;i<max_dod_uje.length;i++){
            System.out.print(max_dod_uje[i].getAsInt() + " ");
        }

    }
}