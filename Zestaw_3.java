import java.util.Scanner;

public class Main {
    public static void trojkiPitagorejskie(int n){
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
                        System.out.println(licznik + ". a = " + (a) + ", b = " + (b) + ", c = " + (c) + ", " + (a*a) + " + " + (b*b) + " = " + (int) (Math.pow(a, 2) + Math.pow(b, 2)) + ", c*c = " + (int) Math.pow(c, 2));
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
        // return 0;
    }
    public static void funKwaRozwiazania(int n){
        int a = 1;
        int b = 0;
        int c = 0;
        int delta;
        int licznik = 0;
        while(a <= n){
            while (b <= n){
                while(c <= n){
                    delta = b*b - 4*a*c;
                    if(delta >= 0){
                        licznik++;
                        System.out.println(licznik + ". Delta = " + delta + ", a = " + a + ", b = " + b + ", c = " + c);
                    }
                    c++;
                }
                b++;
                c = 0;
            }
            a++;
            b = 0;
            c = 0;
        }
    }
    public static void funKwaDelta(int n){
        int a = 1;
        int b = 0;
        int c = 0;
        double pDelta;
        int licznik = 0;
        while(a <= n){
            while (b <= n){
                while(c <= n){
                    pDelta = Math.sqrt(Math.sqrt(b*b - 4*a*c));

                    if((pDelta - (int)pDelta == 0) && (pDelta > 0)){
                        licznik++;
                        System.out.println(licznik + ". Liczba naturalna: " + pDelta + ", pierw. z delty: " + Math.pow(pDelta, 2) + ", Delta: " + Math.pow(pDelta, 4) + ",a = " + a + ", b = " + b + ", c = " + c);
                    }
                    c++;
                }
                b++;
                c = 0;
            }
            a++;
            b = 0;
            c = 0;
        }
    }
    public static void liczbyPierwsze(int n){
        int a = 2;
        int licznik = 0;
        while(a <= n){
            for(int i = 1; i < a+1; i++){
                if(a % i == 0){
                    licznik++;
                }

            }
            if(licznik <= 2){
                System.out.println("Liczba pierwsza: " + a);
            }
            a++;
            licznik = 0;
        }
    }
    public static void liczbyPodzielne(int m, int n){
       int poczatek = (int) Math.pow(10,m-1);
       int koniec = (int) Math.pow(10,m);
       int licznik = 0;
       for(int i = poczatek; i < koniec; i++){
           if(i % n == 0){
               licznik++;
               System.out.println(licznik + ". " + i + " % " + n + " = " + (i % n) + ": liczba podzielna przez " + n + ".");
           }
       }
    }
    public static int piramida(int n, int variant){
        int i = 0;
        if(variant == 1){
            while(i <= n){
                System.out.println(" ".repeat( n-i) + "* ".repeat(i)) ;
                i++;
            }

        } else if (variant == 2) {
            int i2 = n;
            while(i2 > 0){
                System.out.println(" ".repeat( n-i2) + "* ".repeat(i2)) ;
                i2--;
            }
        } else {
            System.out.println("Wariant może wynosić tylko '1' lub '2'. Wprowadź prawidłową wartość parametru");
            return 1;
        }
        return 0;

    }
    public static long silnia(int n){
        long wynik = 1;
        for (int i = 2; i <= n; i++){
            wynik *= i;
        }
        return wynik;
    }
    public static int silniaPodwojna(int n){
        //        1          dla n = 0 lub n = 1
        // n!! =
        //        n*(n - 2)! dla n >= 2
        int wynik;
        if((n == 0) || (n == 1)) {
            wynik = 1;
        } else {
            wynik = n * silniaPodwojna(n-2);
        }

        return wynik;
    }
    public static int silnia(int m, int n){
        int wynik;
        if((n == 0)) {
            wynik = 1;
        } else if ((n > 0) && (n <= m)) {
            wynik = n;
        } else {
            wynik = n * silnia(m,n-m);
        }

        return wynik;
    }
    public static int dwumianNewtona(int n, int k){
        long wynik;
        wynik = (silnia(n))/(silnia(k)*silnia(n-k));

        return (int) wynik;
    }
    public static void ciagFibonacciego(int n){
        int i = 0;
        int cf0 = 0;
        int cf1 = 1;
        int cf;
        while(i <= n){
            cf = cf0 + cf1;
            cf0 = cf1;
            cf1 = cf;
            System.out.println(cf);
            i++;
        }

    }
    public static int sumaNaturalnych(int n) {
        int wynik = 0;
        int i = 0;
        while(i <= n){
            wynik +=i;
            i++;
        }
        return wynik;
    }
    public static int sumaParzystych(int n) {
        int wynik = 0;
        int i = 0;
        while(i <= n){
            if(i % 2 == 0){
                wynik += i;
            }
            i++;
        }
        return wynik;
    }

    public static int sumaNieparzystych(int n) {
        int wynik = 0;
        int i = 0;
        while(i <= n){
            if(i % 2 != 0){
                wynik += i;
            }
            i++;
        }
        return wynik;
    }

    public static int sumaKwaNaturalnych(int n) {
        int wynik = 0;
        int i = 0;
        while(i <= n){
            wynik +=(i*i);
            i++;
        }
        return wynik;
    }

    public static int sumaSzeNaturalnych(int n) {
        int wynik = 0;
        int i = 0;
        while(i <= n){
            wynik +=(int)Math.pow(i,3);
            i++;
        }
        return wynik;
    }

    public static double sumaOdwNaturalnych(int n) {
        double wynik = 0;
        int i = 1;
        while(i <= n){
            wynik +=Math.pow(i,-1);
            i++;
        }
        return wynik;
    }
    public static boolean czyPalindrom(String wyraz){
        char[] tab = new char[wyraz.length()];
        char[] bat = new char[wyraz.length()];
        tab = wyraz.toCharArray();
        for (int i = 0; i < tab.length; i++){
            bat[tab.length - i - 1] = tab[i];
        }
        for (int ii = 0; ii < bat.length; ii++){
            if(bat[ii] != tab[ii]){
                return false;
            }
        }
        return true;
    }


    public static void trojkatPascala(int n){
        int i = 0;
        while(i <= n){
            System.out.print(" ".repeat(n-i));
            for(int j = 0;j <=i;j++){
                System.out.print(dwumianNewtona(i, j) + " ");
            }
            System.out.println();
            i++;
        }

    }
    public static boolean czyPalindrom(int n){
        boolean wynik = true;
        int i = 0;
        int tmp = 0;
        int dlugosc_n = 0;
        int pot10 = 0;
        while(n != tmp){
            i++;
            pot10 = (int)Math.pow(10,i);
            tmp = n % pot10;
            dlugosc_n++;
        }
        pot10 = 1;
        int[] tab = new int[dlugosc_n];
        int[] bat = new int[dlugosc_n];
        int[] roz = new int[dlugosc_n];

        int el0 = 0;
        int el1 = 0;

        for(int ii=1;ii<dlugosc_n+1;ii++){
            el0 = n % pot10;
            pot10 = (int) Math.pow(10,ii);
            el1 = n % pot10;
            tab[tab.length - ii] = (el1 - el0)/(pot10/10);
        }

        for(int ii = 0; ii < tab.length; ii++) {
            bat[tab.length - ii -1] = tab[ii];
        }
        for(int ii = 0; ii < bat.length; ii++) {
            roz[ii] = Math.abs(tab[ii] - bat[ii]);
            if(roz[ii] != 0){
                return wynik = false;
            }
        }
        return wynik;
    }
    public static boolean czyDoskonala(int n){
        boolean wynik = false;
        int suma = 0;
        for(int i = 1; i < n; i++){
            if((n % i) == 0){
                suma += i;
            }
        }
        if(suma == n){
            return wynik = true;
        }
        return wynik;
    }
    public static boolean czyPierwsza(int n){
        int licznik = 0;
        int i = 1;
        while(i <= n){
            if((n % i) == 0){
                licznik++;
                if(licznik > 2){
                    return false;
                }
            }
            i++;
        }
        return true;
    }
    public static int NWD(int a, int b){
        int i = 1;
        int myMax = a;
        int nwd = 0;
        if(myMax < b){
            myMax = b;
        }
        while(i <= myMax){
            if(((a % i) == 0) && ((b % i) == 0)){
                nwd = i;
            }
            i++;
        }
        return nwd;
    }
    public static double[] wczytajTablice(int n){
        double[] tab = new double[n];
        for(int i = 0; i < n; i++){
            Scanner mojaLiczba = new Scanner(System.in);
            System.out.print("Wprowadź " + (i+1) +"-tą liczbę: ");
            tab[i] = mojaLiczba.nextDouble();
            System.out.println();
        }
        return tab;
    }

    public static int[] dec2bin(int n, int dlTab){
        int[] bin = new int[dlTab];
        if(n >= (int) Math.pow(2, dlTab)){
            System.out.println("Maksymalna wprowadzona liczba musi być mniejsza od " + (int) Math.pow(2, dlTab) + "\nBRAK OBLICZEŃ");
            return bin;
        }
        for(int i = dlTab-1; i >= 0; i--){
            bin[i] = n % 2;
            n /= 2;
        }
        return bin;
    }


    public static void podzbiory(int[] tab) {
        int dlugosc_tab = tab.length;
        int[] bin = new int[dlugosc_tab];
        int licznik = 0;

        for(int i = 0;i < (int) Math.pow(2,dlugosc_tab);i++){
            bin = dec2bin(i, dlugosc_tab);
            System.out.print((licznik + 1) + ". { ");
            for(int j = 0;j < dlugosc_tab;j++){
                if(bin[j] != 0){
                    System.out.print(tab[j] + " ");
                }
            }
            System.out.println("}");
            licznik++;

        }
    }

    public static void main(String[] args) {
        System.out.println("\nZadanie 1\n");
        trojkiPitagorejskie(20);

        System.out.println("\nZadanie 2\n");
        funKwaRozwiazania(5);

        System.out.println("\nZadanie 3\n");
        funKwaDelta(5);

        System.out.println("\nZadanie 4\n");
        liczbyPierwsze(20);

        System.out.println("\nZadanie 5\n");
        liczbyPodzielne(2,5);

        System.out.println("\nZadanie 6\n");
        System.out.println("\n- wariant 1:\n");
        piramida(15, 1);
        System.out.println("\n- wariant 2:\n");
        piramida(15, 2);

        System.out.println("\nZadanie 7\n");
        int n = 11;
        System.out.println(n + "! = " + silnia(n));

        System.out.println("\nZadanie 8\n");
        int n8 = 11;
        System.out.println(n + "!! = " + silniaPodwojna(n8));

        System.out.println("\nZadanie 9\n");
        int n9 = 11;
        int m9 = 4;
        System.out.println(n + "!".repeat(m9) + " = " + silnia(m9, n9));

        System.out.println("\nZadanie 10\n");
        int nn = 5;
        int kk = 5;
        System.out.println(dwumianNewtona(nn, kk));

        System.out.println("\nZadanie 11\n");
        int n11 = 7;
        ciagFibonacciego(n11);

        System.out.println("\nZadanie 12\n");
        int nnn = 10;
        System.out.println(sumaNaturalnych(nnn));
        System.out.println(sumaParzystych(nnn));
        System.out.println(sumaNieparzystych(nnn));
        System.out.println(sumaKwaNaturalnych(nnn));
        System.out.println(sumaSzeNaturalnych(nnn));
        System.out.println(sumaOdwNaturalnych(nnn));

        System.out.println("\nZadanie 13\n");
        String wyraz = "kajak";
        System.out.println(czyPalindrom(wyraz));

        System.out.println("\nZadanie 14\n");
        int en = 7;
        trojkatPascala(en);

        System.out.println("\nZadanie 15\n");
        int liczba = 1212121;
        System.out.println(czyPalindrom(liczba));

        System.out.println("\nZadanie 16\n");
        int liczba16 = 496;
        System.out.println(czyDoskonala(liczba16));

        System.out.println("\nZadanie 17\n");
        int liczba17 = 8;
        System.out.println(czyPierwsza(liczba17));

        System.out.println("\nZadanie 18\n");
        int liczba181 = 10;
        int liczba182 = 10;
        System.out.println(NWD(liczba181,liczba182));

        System.out.println("\nZadanie 19\n");
        int liczba19 = 3;
        double[] tab = new double[liczba19];
        tab = wczytajTablice(liczba19);
        for(int i = 0;i < tab.length;i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        System.out.println("\nZadanie 20\n");
        int[] tab20 = {1, 2, 3, 4, 5};
        podzbiory(tab20);







    }
}