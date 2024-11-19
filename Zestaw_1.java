import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void rysujZnaki(int[] ileSpacji, char[] znak, int[] ileZnakow) {
        int iteracje = ileSpacji.length;
        String[] znakStr = new String[iteracje];
        for (int i = 0; i < iteracje; i++) {
            znakStr[i] = String.valueOf(znak[i]).concat(" ");
        }
        for (int i = 0; i < iteracje; i++) {
            System.out.print(" ".repeat(ileSpacji[i]));
            System.out.println(znakStr[i].repeat(ileZnakow[i]));
        }

    }

    public static void main(String[] args) {
        //
        System.out.println("Zadanie 1");

        System.out.println("\nDariusz Słowiński");
        //
        System.out.println("\nZadanie 2\n");

        String osoba = "Dariusz Słowiński";
        System.out.println(osoba + ": długość imienia i nazwiska to " + osoba.length() + " znaków.");
        //
        System.out.println("\nZadanie 3\n");

        String wyraz1 = "Ala";
        String wyraz2 = "ma";
        String wyraz3 = "kota";
        String zdanie = "";
        System.out.println(zdanie.concat(wyraz1).concat(" ").concat(wyraz2).concat(" ").concat(wyraz3));
        //
        System.out.println("\nZadanie 4.1\n");

        int[] ileSpacji = {20, 20, 20, 0, 0, 0, 20, 20, 20};
        char[] znak = {'*', '*', '*', '*', '*', '*', '*', '*', '*'};
        int[] ileZnakow = {1, 2, 3, 14, 15, 14, 3, 2, 1};
        rysujZnaki(ileSpacji, znak, ileZnakow);
        //
        System.out.println("\nZadanie 4.2\n");

        int[] ileSpacji2 = {5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5};
        char[] znak2 = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'};
        int[] ileZnakow2 = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        rysujZnaki(ileSpacji2, znak2, ileZnakow2);
        //
        System.out.println("\nZadanie 5\n");

        String zdanie1 = "Ala ma kota";
        String zdanie2 = zdanie1.replace('a', 'e');
        System.out.println(zdanie1.concat("\n").concat(zdanie2));
        //
        System.out.println("\nZadanie 6\n");

        String zdanie16 = "Ala ma kota";
        String zdanie26 = zdanie16.toUpperCase();
        String zdanie36 = zdanie26.substring(0, 1).toUpperCase().concat(zdanie26.substring(1).toLowerCase());
        System.out.println(zdanie16.concat("\n").concat(zdanie26).concat("\n").concat(zdanie36));
        //
        System.out.println("\nZadanie 7\n");

        char[] znaki = {'A', '!', '@', '>', '~', '\n', '\b'};
        for (int i = 0; i < znaki.length; i++) {
            if (znaki[i] == '\n') {
                System.out.println("Kod ASCII znaku 'LF' to " + (int) znaki[i]);
                continue;
            }
            if (znaki[i] == '\b') {
                System.out.println("Kod ASCII znaku 'BS' to " + (int) znaki[i]);
                continue;
            }
            System.out.println("Kod ASCII znaku " + znaki[i] + " to " + (int) znaki[i]);
        }
        //
        System.out.println("\nZadanie 8\n");

        char[] duzeLitery = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] maleLitery = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] cyfry = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[] dlASCII = new int[duzeLitery.length];
        int[] mlASCII = new int[maleLitery.length];
        int[] cyfryASCII = new int[cyfry.length];

        System.out.println("\nDUŻE LITERY:\n");

        for (int i = 0; i < duzeLitery.length; i++) {
            System.out.print(duzeLitery[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < duzeLitery.length; i++) {
            dlASCII[i] = (int) duzeLitery[i];
            System.out.print(dlASCII[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Przedział kodów ASCII dla dużych liter to " + dlASCII[0] + " : " + dlASCII[dlASCII.length - 1]);

        System.out.println("\nmałe litery:\n");

        for (int i = 0; i < maleLitery.length; i++) {
            System.out.print(maleLitery[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < maleLitery.length; i++) {
            mlASCII[i] = (int) maleLitery[i];
            System.out.print(mlASCII[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Przedział kodów ASCII dla małych liter to " + mlASCII[0] + " : " + mlASCII[mlASCII.length - 1]);

        System.out.println("\nCYFRY:\n");

        for (int i = 0; i < cyfry.length; i++) {
            System.out.print(cyfry[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < cyfryASCII.length; i++) {
            cyfryASCII[i] = (int) cyfry[i];
            System.out.print(cyfryASCII[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Przedział kodów ASCII dla cyfr to " + cyfryASCII[0] + " : " + cyfryASCII[cyfryASCII.length - 1]);
        //
        System.out.println("\nZadanie 9\n");

        String zdanie91 = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mimo, że jego ... na to nie wskazuje.";
        String zdanie92 = "";
        String tmp = "";
        System.out.println(zdanie91);
        int licznik = 0;
        int idx = 0;
        int idx2 = 0;

        while(true){
            idx = zdanie91.indexOf("...", idx2);
            idx2 = idx+4;
            if (idx == -1){
                break;
            }
            licznik++;
        }
        String[] doZamiany = {"JEDEN", "DWA", "TRZY", ""};
        int[] indeksy = new int[licznik+2];
        indeksy[0] = -3;
        indeksy[licznik+1] = zdanie91.length();

        for (int i=1;i < indeksy.length-1;i++){
            if (i == 1){
                indeksy[i] = zdanie91.indexOf("...", 0);
            } else {
                indeksy[i] = zdanie91.indexOf("...", indeksy[i-1]+4);
            }
        }

        for (int i=0;i < indeksy.length-1;i++) {
            tmp = tmp.concat(zdanie91.substring(indeksy[i]+3, indeksy[i+1] ).concat(doZamiany[i]));
            zdanie92 =zdanie92.concat(tmp);
            tmp="";
        }
        System.out.println(zdanie92);
        //
        System.out.println("\nZadanie 10\n");

        String zdanie11 = "... to najlepsza książka napisana przez ...";
        String zdanie12 = "";
        zdanie12 = zdanie12.concat("'Ciotka Julia i skryba'").concat(zdanie11.substring(3,zdanie11.length()-3)).concat("Mario Vargas Llosa.");
        System.out.println(zdanie11 + "\n" + zdanie12);
        //
        System.out.println("\nZadanie 11\n");

        String wyraz = "wodrze".repeat(5);
        System.out.println(wyraz);
        //
        System.out.println("\nZadanie 12\n");

        String mojaData;
        String mojaGodzina;

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObjData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter myFormatObjGodzina = DateTimeFormatter.ofPattern("HH:mm:ss");

        mojaData = myDateObj.format(myFormatObjData);
        mojaGodzina = myDateObj.format(myFormatObjGodzina);
        System.out.println("Dzisiaj jest (" + mojaData + ") godzina (" + mojaGodzina + ")");
        //
        System.out.println("\nZadanie 13\n");

        int dlugosc = "Dariusz Słowiński".length();
        int album = 175189;
        int[] tab = {54, 103, 241, 67, 9999, dlugosc, album};
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Liczba: " + tab[i] + ", znak: " + (char) tab[i]);
        }


    }

}