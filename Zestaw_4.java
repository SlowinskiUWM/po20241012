public class Main {

    public static double[] generujTablice(int n, double minWartosc, double maxWartosc){
        double[] tab = new double[n];
        for(int i = 0; i < n; i++){
            tab[i] = Math.random()*(maxWartosc - minWartosc)+minWartosc;
        }

        return tab;
    }
    public static void wypiszTablice(double[] tab, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(((i*m)+j)<tab.length) {
                    System.out.printf("% 11.3f\t", tab[(i * m) + j]);
                } else {
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }

    }

    public static int ileNieparzystych(int[] tab){
       int ileNieparzystych = 0;
       for(int i = 0; i < tab.length; i++){
           if(tab[i] % 2 != 0){
               ileNieparzystych++;
           }
       }
       return ileNieparzystych;
    }

    public static int ileParzystych(int[] tab){
        int ileParzystych = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 0){
                ileParzystych++;
            }
        }
        return ileParzystych;
    }

    public static int ileDodatnich(int[] tab){
        int ileDodatnich = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                ileDodatnich++;
            }
        }
        return ileDodatnich;
    }

    public static int ileUjemnych(int[] tab){
        int ileUjemnych = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                ileUjemnych++;
            }
        }
        return ileUjemnych;
    }

    public static int ileZerowych(int[] tab){
        int ileZerowych = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == 0){
                ileZerowych++;
            }
        }
        return ileZerowych;
    }

    public static int ileMaxymalnych(int[] tab){
        int ileMaxymalnych = 0;
        int myMax = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > myMax){
                myMax = tab[i];
            }
        }
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == myMax){
                ileMaxymalnych++;
            }
        }
        return ileMaxymalnych;
    }

    public static int ileMinimalnych(int[] tab){
        int ileMinimalnych = 0;
        int myMin = tab[0];
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < myMin){
                myMin = tab[i];
            }
        }
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == myMin){
                ileMinimalnych++;
            }
        }
        return ileMinimalnych;
    }

    public static int ileUnikalnych(int[] tab){
        //int[] tmp = new int[tab.length];
        int myUnique;
        int ileUnikalnych = tab.length;
        for(int i = 0; i < tab.length; i++){
            myUnique = tab[i];
            for(int k = 0; (k < tab.length); k++){
                if((myUnique == tab[k]) && (k != i)){
                    ileUnikalnych--;
                    break;
                }
            }
        }


        return ileUnikalnych;
    }

    public static double sumaDodatnich(double[] tab){
        double sumaDodatnich = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                sumaDodatnich += tab[i];
            }
        }
        return sumaDodatnich;
    }

    public static double sumaUjemnych(double[] tab){
        double sumaUjemnych = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                sumaUjemnych += tab[i];
            }
        }
        return sumaUjemnych;
    }

    public static double sumaOdwrotnosci(double[] tab){
        double sumaOdwrotnosci = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == 0){
                continue;
            } else {
                sumaOdwrotnosci += (1/tab[i]);
            }
        }
        return sumaOdwrotnosci;
    }

    public static double sredniaArytmetyczna(double[] tab){
        double sredniaArytmetyczna = 0;
        double suma = 0;
        for(int i = 0; i < tab.length; i++){
            suma += tab[i];
        }
        sredniaArytmetyczna = (suma / tab.length);
        return sredniaArytmetyczna;
    }

    public static double sredniaGeometryczna(double[] tab){
        double sredniaGeometryczna = 0;
        double iloczyn = 1;
        for(int i = 0; i < tab.length; i++){
            iloczyn *= tab[i];
        }
        sredniaGeometryczna = Math.pow(iloczyn, Math.pow(tab.length,-1));
        return sredniaGeometryczna;
    }

    public static double sredniaHarmoniczna(double[] tab){
        double sredniaHarmoniczna = 0;
        double sumaodw = 0;
        for(int i = 0; i < tab.length; i++){
            sumaodw += Math.pow(tab[i],-1);
        }
        sredniaHarmoniczna =tab.length/sumaodw;
        return sredniaHarmoniczna;
    }
    
    public static double[] funkcjaLiniowa(double[] tab, int a, int b) {
    	double[] linear = new double[tab.length];
    	for(int i = 0; i < tab.length; i++) {
    		linear[i] = a * tab[i] + b;
    	}
    	return linear;
    }
    
    public static double[] funkcjaKwadratowa(double[] tab, int a, int b, int c) {
    	double[] quadratic = new double[tab.length];
    	for(int i = 0; i < tab.length; i++) {
    		quadratic[i] = (a * Math.pow(tab[i],2)) + (b * tab[i]) + c;
    	}
    	return quadratic;
    }
    
    public static double[] funkcjaWykladnicza(double[] tab, int a) {
    	double[] expt = new double[tab.length];
    	for(int i = 0; i < tab.length; i++) {
    		expt[i] = Math.pow(a,  tab[i]);
    	}
    	return expt;
    }
    
    public static double[] funkcjaSignum(double[] tab) {
    	double[] signum = new double[tab.length];
    	double epsilon = 0.1;
    	for(int i = 0; i < tab.length; i++) {
    		if(tab[i] < 0) {
    			signum[i] = -1;
    		}
    		else if(Math.abs(tab[i]) <= epsilon) {
    			signum[i] = 0;
    		}
    		else {signum[i] = 1;}
    	}
    	
    	return signum;
    }
    
    public static int najdluzszyCiagDodatnich(double[] tab) {
    	int max_new = 0;
    	int max_old = 0;
    	for(int i = 0; i < tab.length; i++) {
    		if(tab[i] > 0) {
    			max_new++;
    		}
    		else {
    			if(max_old > max_new) {
    				max_new = 0;
    			} else {
    				max_old = max_new;
    				max_new = 0;
    			}
    			
    		}
    	}
    	if(max_old > max_new) {
    		return max_old;
    	} else {
    		return max_new;	
    	}
    }
    
    public static int najdluzszyCiagUjemnych(double[] tab) {
    	int max_new = 0;
    	int max_old = 0;
    	for(int i = 0; i < tab.length; i++) {
    		if(tab[i] < 0) {
    			max_new++;
    		}
    		else {
    			if(max_old > max_new) {
    				max_new = 0;
    			} else {
    				max_old = max_new;
    				max_new = 0;
    			}
    			
    		}
    	}
    	if(max_old > max_new) {
    		return max_old;
    	} else {
    		return max_new;	
    	}
    }
    
    public static double[] odwrocTablice(double[] tab) {
    	double[] wynik = new double[tab.length];
    	for(int i = 0; i < tab.length; i++) {
    		wynik[tab.length - i -1] = tab[i];
    	}
    	return wynik;
    }
    
    public static double[] odwrocTablice(double[] tab, int indeksStart, int indeksStop) {
    	double[] nowa = new double[tab.length];
    	double tmp;
    	for(int i = 0; i < tab.length; i++) {
    		nowa[i] = tab[i];
    	}
    	int liczbaElem = indeksStop - indeksStart + 1;
    	int warStop = (liczbaElem / 2);
    	for(int i = indeksStart; i < (indeksStart + warStop); i++) {
    		tmp = nowa[i];
    		nowa[i] = nowa[indeksStop - (i - indeksStart)];
    		nowa[indeksStop - (i - indeksStart)] = tmp;
    	}
    	return nowa;
    }
    
    public static double[] generujZakres(int n, double minWartosc, double maxWartosc) {
    	double[] tab = new double[n];
    	tab[0] = minWartosc;
    	for(int i = 1; i < n; i++) {
    		tab[i] = tab[i-1] + ((maxWartosc - minWartosc)/(n-1));
    	}
    	return tab;
    }
    
    




    public static void main(String[] args) {
        System.out.println("Zadanie 1\n");
        int n = 9;
        double minWartosc = -10.0;
        double maxWartosc = 10.0;
        double[] tab;
        tab = generujTablice(n, minWartosc, maxWartosc);

        System.out.println("\nZadanie 2\n");
        wypiszTablice(tab, 5, 5);

        System.out.println("\nZadanie 3\n");
        int[] tab3 = new int[tab.length];
        int nieparzyste;
        int parzyste;
        int dodatnie;
        int ujemne;
        int zerowe;
        int maxymalne;
        int minimalne;
        int unikalne;
        for(int i = 0; i < tab3.length; i++){
            tab3[i] = (int) tab[i];
        }
        for(int i = 0; i < tab3.length; i++){
            System.out.printf("%d ", tab3[i]);
        }
        System.out.println();

        nieparzyste = ileNieparzystych(tab3);
        parzyste = ileParzystych(tab3);
        dodatnie = ileDodatnich(tab3);
        ujemne = ileUjemnych(tab3);
        zerowe = ileZerowych(tab3);
        maxymalne = ileMaxymalnych(tab3);
        minimalne = ileMinimalnych(tab3);
        unikalne = ileUnikalnych(tab3);
        System.out.println("Liczba nieparzystych = " + nieparzyste);
        System.out.println("Liczba parzystych = " + parzyste);
        System.out.println("Liczba dodatnich = " + dodatnie);
        System.out.println("Liczba ujemnych = " + ujemne);
        System.out.println("Liczba zerowych = " + zerowe);
        System.out.println("Liczba maxymalnych = " + maxymalne);
        System.out.println("Liczba minimalnych = " + minimalne);
        System.out.println("Liczba unikalnych = " + unikalne);

        System.out.println("\nZadanie 4\n");

        double sumadodatnich = 0;
        double sumaujemnych = 0;
        double sumaodwrotnosci = 0;
        double sredniaarytm = 0;
        double sredniageom = 0;
        double sredniaharm = 0;

        sumadodatnich = sumaDodatnich(tab);
        sumaujemnych = sumaUjemnych(tab);
        sumaodwrotnosci = sumaOdwrotnosci(tab);
        sredniaarytm = sredniaArytmetyczna(tab);
        sredniageom = sredniaGeometryczna(tab);
        sredniaharm = sredniaHarmoniczna(tab);

        System.out.printf("Suma dodatnich = %.3f\n",sumadodatnich);
        System.out.printf("Suma ujemnych = %.3f\n",sumaujemnych);
        System.out.printf("Suma odwtrotności = %.3f\n",sumaodwrotnosci);
        System.out.printf("Średnia arytmetyczna = %.3f\n",sredniaarytm);
        System.out.printf("Średnia geometryczna = %.3f\n",sredniageom);
        System.out.printf("Średnia harmoniczna = %.3f\n",sredniaharm);

        System.out.println("\nZadanie 5\n");
        
        double[] tab51 = new double[tab.length];
        double[] tab52 = new double[tab.length];
        double[] tab53 = new double[tab.length];
        double[] tab54 = new double[tab.length];
        
        int a = 2;
        int b = 1;
        int c = -2;
        tab51 = funkcjaLiniowa(tab, a, b);
        tab52 = funkcjaKwadratowa(tab, a, b, c);
        tab53 = funkcjaWykladnicza(tab, a);
        tab54 = funkcjaSignum(tab);
        
        
        System.out.println("Funkcja liniowa ax+b: \n");
        wypiszTablice(tab51,3,5);
        
        System.out.println("\nFunkcja kwadratowa ax^2 + bx + c: \n");
        wypiszTablice(tab52,3,5);
        
        System.out.println("\nFunkcja wykładnicza a^x: \n");
        wypiszTablice(tab53,3,5);
        
        System.out.println("\nFunkcja signum: \n");
        wypiszTablice(tab54,3,5);
        
        System.out.println("\nZadanie 6\n");
        
        System.out.println("Najdłuższy ciąg dodatnich = " + najdluzszyCiagDodatnich(tab));
        System.out.println("Najdłuższy ciąg ujemnych = " + najdluzszyCiagUjemnych(tab));
        
        double[] wynik6 = new double[tab.length];
        wynik6 = odwrocTablice(tab);
        
        System.out.println();
        for(int i = 0; i < tab.length; i++) {
        	System.out.printf("% 7.2f\t",tab[i]);
        }
        System.out.println();
        for(int i = 0; i < tab.length; i++) {
        	System.out.printf("% 7.2f\t",wynik6[i]);
        }
        System.out.println();
        int indeksStart = 2;
        int indeksStop = 6;
        double[] wynik61 = new double[tab.length];
        wynik61 = odwrocTablice(tab, indeksStart, indeksStop);
        
        System.out.println();
        for(int i = 0; i < tab.length; i++) {
        	System.out.printf("% 7.2f\t",tab[i]);
        }
        System.out.println();
        for(int i = 0; i < tab.length; i++) {
        	System.out.printf("% 7.2f\t",wynik61[i]);
        }
        System.out.println();
        
        System.out.println("\nZadanie 7\n");
        
        int n7 = 5;
        double minWartosc7 = 2.0;
        double maxWartosc7 = 12.0;
        double[] tab7 = generujZakres(n7, minWartosc7, maxWartosc7);
        for(int i = 0; i < tab7.length;i++) {
        	System.out.printf("% 7.3f\t", tab7[i]);
        }
        
        





    }
}