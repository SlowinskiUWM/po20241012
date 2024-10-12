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

// Zestaw 1. Zadanie 7

        // Znak         ASCII
        //  A               65
        //  !               33
        //  @               64
        //  >               62
        //  ~               126
        //  \n              10
        //  \b              8

        System.out.println((int)'A');

        // Zestaw 1. Zadanie 8







        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            // System.out.println("i = " + i);
        }
    }
// }