import java.util.Arrays;

public class Main {
    public static boolean dokladnosc(double x, double y, int k){
        if(Math.abs(x - y) <= Math.pow(10, -k)) {
            return true;
        } else {
            return false;
        }
    }

    public static int najblizszySasiad(int S) {
        int wynik;
        int odl;
        int idx=0;
        int gr = (int) S/2;
        int[] liczby = new int[S];
        for(int i=-gr;i<gr+1;i++){
            liczby[idx] = ((int)Math.pow(i,2) - S);
            idx++;
        }

        odl = Math.abs(liczby[0]);
        for(int i=1;i<liczby.length;i++){
            if(odl >= Math.abs(liczby[i])){
                odl = liczby[i];
            }

        }
        wynik = S + odl;
        return wynik;
    }

    public static boolean czyPalindrom(int n){
        // Obliczenie liczby cyfr liczby n
        int dzielnik = 1;
        int liczba_cyfr = 0;
        int q = 10;
        int licznik = 0;
        int suma = 0;

        while(n > (n % dzielnik)) {
            liczba_cyfr++;
            dzielnik*=10;
        }
        //Tworzenie tablicy (tablicaN) do przechowywania cyfr liczby n
        int[] tablicaN = new int[liczba_cyfr];
        int el_1 = 0;
        int el_2 = 0;
        for(int i=liczba_cyfr-1;i>=0;i--){
            licznik++;
            if(licznik < 2) {
                tablicaN[i] = (n % q);
                continue;
            }
            el_1 = n % q;
            q*=10;
            el_2 = n % q;
            tablicaN[i] = (el_2 - el_1) / (q / 10);
        }
        // Zapis odwróconej tablicy tablicaN do nowej tablicy
        int tablicaOdw[] = new int[liczba_cyfr];
        for(int i = 0;i < liczba_cyfr;i++){
            tablicaOdw[i] = tablicaN[liczba_cyfr - 1 - i];
        }
        for(int i = 0; i<liczba_cyfr;i++){
            System.out.print(tablicaN[i] + " ");
        }
        System.out.println(" ");
        for(int i = 0; i<liczba_cyfr;i++){
            System.out.print(tablicaOdw[i] + " ");
        }
        System.out.println(" ");

        // Obliczenie różnicy obu tablic: jeżeli wynosi zero, liczba p jest palindromem

        int[] roznica = new int[liczba_cyfr];
        for (int i = 0; i < liczba_cyfr; i++) {
            roznica[i] = Math.abs(tablicaN[i] - tablicaOdw[i]);
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

    public static double pierwiastek(double S, int n, int k) {
        double pierwiastek;
        double pierwiastek1;
        double pierwiastek2;
        double x1 = S/2;
        double x2 = S/3;
        pierwiastek1 = ((n-2)*x1+(S/Math.pow(x1,n-1))/n);
        pierwiastek2 = ((n-2)*x2+(S/Math.pow(x2,n-1))/n);
        double dokladnosc = Math.abs(pierwiastek1 - pierwiastek2);
        if(dokladnosc < Math.pow(10, -k)) {
           System.out.println(dokladnosc);
        }

        return pierwiastek = (pierwiastek1 + pierwiastek2)/2;
    }


    public static void main(String[] args) {
        double x = 23.009753;   // do zadania 1
        double y = 23.009786;   // do zadania 1
        int k = 3;              // do zadania 1
        boolean doklad;         // do zadania 1
        doklad = dokladnosc(x, y, k); // do zadania 1
        System.out.println(doklad);   // do zadania 1

        int S = 17;                         // do zadania 2
        int sasiad = najblizszySasiad(S);   // do zadania 2
        System.out.println(sasiad);         // do zadania 2

        int n = 12341;                        // do zadania 6
        boolean palindrom;                  // do zadania 6
        palindrom = czyPalindrom(n);        // do zadania 6
        System.out.println(palindrom);      // do zadania 6

        System.out.println(pierwiastek(20,4,3));
    }
}