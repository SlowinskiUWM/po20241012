import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        System.out.println("\nZadanie 1\n");

        Double o1 = 23.0 + 76;
        System.out.println("Zmienna o1: " + o1 + ", typ zmiennej: " + o1.getClass());

        Double o2 = 41 * 2.0 + 3;
        System.out.println("Zmienna o2: " + o2 + ", typ zmiennej: " + o2.getClass());

        Integer o3 = 5 - 33;
        System.out.println("Zmienna o3: " + o3 + ", typ zmiennej: " + o3.getClass());

        Integer o4 = 109 % 3;
        System.out.println("Zmienna o4: " + o4 + ", typ zmiennej: " + o4.getClass());

        Integer o5 = 50 / 2;
        System.out.println("Zmienna o5: " + o5 + ", typ zmiennej: " + o5.getClass());

        Integer o6 = 4 | 2; // operator alternatywy bitowej
        System.out.println("Zmienna o6: " + o6 + ", typ zmiennej: " + o6.getClass());

        Integer o7 = 3 ^ 5; // operator XOR bitowy
        System.out.println("Zmienna o7: " + o7 + ", typ zmiennej: " + o7.getClass());

        Integer o8 = 7 & 9; // operator koniunkcji bitowej
        System.out.println("Zmienna o8: " + o8 + ", typ zmiennej: " + o8.getClass());
        //
        System.out.println("\nZadanie 2\n");

        double wynik21 = ((Math.sqrt(7)-1)/2)+(Math.pow(3,3) % 2);
        int wynik22 = (int) wynik21;
        System.out.println("Wynik: " + wynik21 + "\n" + "Wynik rzutowany na (int): " + wynik22 +"\n");

        double rokUrodzenia = "1963".length();
        double dzienUrodzenia = "25".length();
        double miesiacUrodzenia = "styczeń".length();
        double wynik23 = rokUrodzenia/(dzienUrodzenia * miesiacUrodzenia);
        int wynik24 = (int) wynik23;
        System.out.println("Wynik: " + wynik23 + "\n" + "Wynik rzutowany na (int): " + wynik24 + "\n");

        double wynik25  = ((3 + Math.sqrt(3))/((Math.sqrt(5)/2)/3))+1;
        int wynik26 = (int) wynik25;
        System.out.println("Wynik: " + wynik25 + "\n" + "Wynik rzutowany na (int): " + wynik26 + "\n");

        double wynik27 = 176 % 14 % 3;
        int wynik28 = (int) wynik27;
        System.out.println("Wynik: " + wynik27 + "\n" + "Wynik rzutowany na (int): " + wynik28 + "\n");

        int dlNazwisko = "Słowiński".length();
        int dlImie = "Dariusz".length();

        double wynik29 = ((dlNazwisko % dlImie) + 1)/Math.sqrt(Math.sqrt(2));
        int wynik30 = (int) wynik29;
        System.out.println("Wynik: " + wynik29 + "\n" + "Wynik rzutowany na (int): " + wynik30 + "\n");
        //
        System.out.println("\nZadanie 3\n");

        Scanner mojeDane = new Scanner(System.in);
        System.out.println("Podaj imię i nazwisko: ");

        String imieNazwisko = mojeDane.nextLine();
        System.out.println("Nazywasz się: " + imieNazwisko);
        //
        System.out.println("\nZadanie 4\n");

        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj dwie liczby rzeczywiste: ");

        double liczba41 = dane.nextDouble();
        double liczba42 = dane.nextDouble();

        System.out.println("Wprowadziłeś liczbę: " + liczba41 + "\n" + "oraz liczbę: " + liczba42);
        System.out.println("Suma tych liczb to " + (liczba41 + liczba42));
        System.out.println("Różnica tych liczb to " + (liczba41 - liczba42));
        System.out.println("Iloraz tych liczb to " + (liczba41 * liczba42));
        System.out.println("Iloczyn tych liczb to " + (liczba41 / liczba42));
        //
        System.out.println("\nZadanie 5\n");

        Scanner mojaLiczba = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int liczba = mojaLiczba.nextInt();

        System.out.println("Twoja liczba (" + liczba + ") powiększona o 140: " + (liczba + 140) + '.');
        System.out.println("Twoja liczba (" + liczba + ") pomniejszona o 31: " + (liczba - 31) + '.');
        System.out.println("Twoja liczba (" + liczba + ") powiększona 7 razy: " + (liczba * 7) + '.');
        System.out.println("Twoja liczba (" + liczba + ") pomniejszona 13 razy: " + ((double)liczba / 13) + '.');
        System.out.println("Twoja liczba (" + liczba + ") modulo 7: " + (liczba % 7) + '.');
        System.out.println("Twoja liczba (" + liczba + ") - część całkowita z dzielenia przez 4: " + (liczba / 4) + '.');
        System.out.println("Twoja liczba (" + liczba + ") Podniesiona do potęgi 45: " + (Math.pow(liczba, 45)) + '.');
        System.out.println("Twoja liczba (" + liczba + ") - iloczyn bitowy z 67: " + (liczba & 67) + '.');
        System.out.println("Twoja liczba (" + liczba + ") - suma bitowa z 59: " + (liczba | 59) + '.');
        System.out.println("Twoja liczba (" + liczba + ") - XOR z 23: " + (liczba ^ 23) + '.');
        System.out.println("Twoja liczba (" + liczba + ") - przesunięcie bitowe o 5 pozycji w lewo: " + (liczba << 5) + '.');
        System.out.println("Twoja liczba (" + liczba + ") - przesunięcie bitowe o 6 pozycji w prawo: " + (liczba >> 6) + '.');












    }
}