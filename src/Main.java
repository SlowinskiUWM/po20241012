import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

// Zestaw 1. Zadanie 1

        System.out.printf("Dariusz Słowiński\n");

// Zestaw 1. Zadanie 2

        String str = "Dariusz Słowiński";
        int len = str.length();
        System.out.println(len);

// Zestaw 1. Zadanie 3

        System.out.println("Ala" + " " + "ma" + " " + "kota\n");

// Zestaw 1. Zadanie 4

        System.out.printf("          *\n");
        System.out.printf("          **\n");
        System.out.printf("          ***\n");
        System.out.printf("**************\n");
        System.out.printf("***************\n");
        System.out.printf("**************\n");
        System.out.printf("          ***\n");
        System.out.printf("          **\n");
        System.out.printf("          *\n");
        System.out.printf("\n");
        System.out.printf("     *\n");
        System.out.printf("    * *\n");
        System.out.printf("   * * *\n");
        System.out.printf("  * * * *\n");
        System.out.printf(" * * * * *\n");
        System.out.printf("* * * * * *\n");
        System.out.printf(" * * * * *\n");
        System.out.printf("  * * * *\n");
        System.out.printf("   * * *\n");
        System.out.printf("    * *\n");
        System.out.printf("     *\n");

// Zestaw 1. Zadanie 5

        String zdanie = "Ala ma kota";
        String reg = "(?i)A";
        System.out.println(zdanie.replaceAll(reg,"e"));

// Zestaw 1. Zadanie 6

        String zdanie2 = "Ala ma kota";
        String zdanie3 = zdanie2.toUpperCase();
        System.out.println(zdanie3);
        System.out.printf(zdanie3.substring(0,1) + zdanie3.substring(1, zdanie3.length()).toLowerCase());
        System.out.printf("\n");

// Zestaw 1. Zadanie 7

        // Znak         ASCII
        //  A               65
        //  !               33
        //  @               64
        //  >               62
        //  ~               126
        //  \n              10
        //  \b              8
        String aski[] = {"A","!","@",">","~","\n","\b"};
        for (int i =  0; i < aski.length; i++) {
            System.out.println((int) aski[i].charAt(0));
        }


 // Zestaw 1. Zadanie 8

        // małe litery  -   97 - 122
        // duże litery  -   65 - 90
        // cyfry    -   48 - 57

// Zestaw 1. Zadanie 9

        String zdanie4 = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mimo, że jego ... na to nie wskazuje";
        String strKropki = "...";
        String aaa[] = {"JEDEN", "DWA", "TRZY"};

        int lastIndex = 0;
        int zlicz = 0;

        while (lastIndex != -1) {

            lastIndex = zdanie4.indexOf(strKropki, lastIndex);

            if (lastIndex != -1) {
                zlicz++;
                lastIndex += strKropki.length();
            }
        }
        System.out.println(zdanie4);
        for (int k=0;k<zlicz;k++) {
            zdanie4 = zdanie4.replaceFirst("(\\.{3})",aaa[k]);

        }
        System.out.println(zdanie4);

// Zestaw 1. Zadanie 10


        String zdanie5 = "... to najlepsza książka napisana przez ...";
        String kropki = "...";
        String tytulAutor[] = {"Ciotka Julia i skryba","Mario Vargas Llosa"};

        int lastIndex2 = 0;
        int zlicz2 = 0;

        while (lastIndex2 != -1) {

            lastIndex2 = zdanie5.indexOf(kropki, lastIndex2);

            if (lastIndex2 != -1) {
                zlicz2++;
                lastIndex2 += kropki.length();
            }
        }
        System.out.println(zdanie5);
        for (int kk=0; kk<zlicz2; kk++) {
            zdanie5 = zdanie5.replaceFirst("(\\.{3})",tytulAutor[kk]);

        }
        System.out.println(zdanie5);

// Zestaw1. Zadanie 11

        String wyraz = "wodrze";
        System.out.println(wyraz.repeat(5));

//Zestaw 1. Zadanie 12

        // String wyraz12 = "Dzisiaj jest ("+java.time.Clock.systemUTC().instant()+") godzina(hh:mm:ss)";
        // System.out.println(wyraz12);

        DateTimeFormatter dataformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter czasformat = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime teraz = LocalDateTime.now();

        System.out.println("Dzisiaj jest "+dataformat.format(teraz)+" godzina "+ czasformat.format(teraz));

// Zestaw 1. Zadanie 13

        //Sprawdź jakie znaki kryją się pod numerami: 54, 103, 241, 67, 9999, [długość Twojego imienia i nazwiska], [numer albumu].
        int dlugosc = "Dariusz Słowiński".length();
        int album = 175189;
        int numery[] = {54, 103, 241, 67, 9999, dlugosc, album};

        for (int i=0;i<numery.length;i++) {
            System.out.println((char) numery[i]);
        }

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            // System.out.println("i = " + i);
        }
    }
// }