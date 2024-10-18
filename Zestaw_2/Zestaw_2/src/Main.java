import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



// Zestaw 2. Zadanie 1

        double x = 23.0;
        int y = 76;
        double w1 = x+y;
        System.out.println(w1);
        // double

        int x2 = 41;
        double y2 = 2.0;
        int z2 = 3;
        double w2 = x2*y2+z2;
        System.out.println(w2);
        // double

        int x3 = 5;
        int y3 = 33;
        int w3 = x3 - y3;
        System.out.println(w3);
        // int

        int x4 = 109;
        int y4 = 3;
        int w4 = x4 % y4;
        System.out.println(w4);
        // int

        int x5 = 50;
        int y5 = 2;
        int w5 = x5 / y5;
        System.out.println(w5);
        // int

        int x6 = 4;
        int y6 = 2;
        int w6 = x6 | y6;
        System.out.println(w6);
        // int

        int x7 = 3;
        int y7 = 5;
        int w7 = x7 ^ y7;
        System.out.println(w7);
        // int

        int x8 = 7;
        int y8 = 9;
        int w8 = x8 & y8;
        System.out.println(w8);
        // int

//Zestaw 2. Zadanie 2

        double w21 = ((Math.sqrt(7)-1)/(2)) + (Math.pow(3,5) % 2);
        System.out.println(w21);
        System.out.println((int) w21);

        double w22 = 1963/(25*1);
        System.out.println(w22);
        System.out.println((int) w22);

        double w23 = ((3+Math.sqrt(3))/((Math.sqrt(5)/2)/(3)))+1;
        System.out.println(w23);
        System.out.println((int) w23);

        double w24 = 23.5 % 4 % 2;
        System.out.println(w24);
        System.out.println((int) w24);

        int x25 = "Słowiński".length();
        int y25 = "Dariusz".length();
        double w25 = ((x25 % y25) + 1)/(Math.sqrt(Math.sqrt(2)));
        System.out.println(w25);
        System.out.println((int) w25);

// Zestaw 2. Zadanie 3

        Scanner scanner = new Scanner(System.in);

        for (int i23 = 0; i23 < 2; i23++) {
            System.out.println("Wprowadź słowo z klawiatury: ");
            String slowo = scanner. nextLine();
            System.out.println("Wprowadziłeś słowo: " + slowo);
        }

// Zestaw 2. Zadanie 4

        double liczba1 = 0.0;
        double liczba2 = 0.0;

        Scanner scannerDouble = new Scanner(System.in);

        for (int i24 = 0; i24 < 2; i24++) {
            System.out.println("Wprowadź z klawiatury liczbę rzeczywistą: ");
            if (i24 == 0) {
                liczba1 = scannerDouble.nextDouble();
            }
            if (i24 == 1) {
                liczba2 = scannerDouble.nextDouble();
            }
        }
        System.out.printf("Liczba nr 1: "); System.out.println(liczba1);
        System.out.printf("Liczba nr 2: "); System.out.println(liczba2);
        System.out.printf("Suma obu liczb: "); System.out.println(liczba1 + liczba2);
        System.out.printf("Różnica obu liczb: "); System.out.println(liczba1 - liczba2);
        System.out.printf("Iloczyn obu liczb: "); System.out.println(liczba1 * liczba2);
        System.out.printf("Iloraz obu liczb: "); System.out.println(liczba1/liczba2);


// Zestaw2. Zadanie 5

        double liczba51 = 0.0;

        Scanner scanner51 = new Scanner(System.in);

        System.out.println("Wprowadź z klawiatury liczbę rzeczywistą: ");
        liczba51 = scannerDouble.nextDouble();

        System.out.printf("Liczba powiększona o 140: "); System.out.println(liczba51 + 140);
        System.out.printf("Liczba pomniejszona o 31: "); System.out.println(liczba51 - 31);
        System.out.printf("Liczba powiększona 7 razy: "); System.out.println(liczba51 * 7);
        System.out.printf("Liczba pomniejszona 13 razy: "); System.out.println(liczba51 / 13);
        System.out.printf("Liczba - modulo 7: "); System.out.println(liczba51 % 7);
        System.out.printf("Liczba - część całkowita z dzielenia przez 4: "); System.out.println((int) liczba51 / 4);
        System.out.printf("Liczba podniesiona do potęgi 45: "); System.out.println(Math.pow(liczba51,45));
        System.out.printf("Liczba - iloraz bitowy z 67: "); System.out.println((int) liczba51 & 67);
        System.out.printf("Liczba - suma bitowa z 59: "); System.out.println((int) liczba51 | 59);
        System.out.printf("Liczba - XOR z 23: "); System.out.println((int) liczba51 ^ 23);
        System.out.printf("Liczba - przesunięcie o 5 bitów w lewo: "); System.out.println((int) liczba51 << 5);
        System.out.printf("Liczba - przesunięcie o 6 bitów w prawo: "); System.out.println((int) liczba51 >> 6);





























    }
}