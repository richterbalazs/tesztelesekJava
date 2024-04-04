package oraimunka0404;

public class beugrok {

    public static void main(String[] args) {
        nehanySzamOsszegenekGyoke();
    }

    private static void nehanySzamOsszegenekGyoke() {
        haromSzamGyokeKonzolon();
        otSzamGyokeKonzolon();
    }

    private static void haromSzamGyokeKonzolon() {
        /* 1.a: 3 szĂˇm gyĂ¶kĂ©nek megjelenĂ­tĂ©se: */
        int osszeg = osszegzes(2, osszegzes(3,4));
        double gyok = gyokvonas(osszeg);
        String kimenet = String.format("%d gyöke: %.4f\n", osszeg, gyok);
        
        /* a kiĂ­rĂł logika KĂ“DDUPLIKĂ�LĂ�SA: */
        //System.out.println(kimenet);
        konzolraIr(kimenet);
    }
    
    private static void otSzamGyokeKonzolon() {
        /* 1.b: 5 szĂˇm gyĂ¶kĂ©nek megjelenĂ­tĂ©se: */
        /* tĂ¶bb sorban: */
        //int[] szamok = {3,5,12,2,3};
        //osszeg = osszegzes(szamok);
        /* egy sorban: */
        int osszeg = osszegzes(new int[]{3,5,12,2,3});
        double gyok = gyokvonas(osszeg);
        // String kimenet = "%d gyĂ¶ke: %.4f\n".formatted(osszeg, gyok);
        String kimenet = String.format("%d gyöke: %.4f\n", osszeg, gyok);
        
        /* a kiĂ­rĂł logika KĂ“DDUPLIKĂ�LĂ�SA: */
        //System.out.println(kimenet);
        konzolraIr(kimenet);
    }
    
    /* az osszegzes(...) tĂşlterhelĂ©se: 
     - azonos nĂ©v
     - eltĂ©rĹ‘ paramĂ©terezĂ©s
    */
    public static int osszegzes(int[] tomb) {
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
        return osszeg;
    }
    
    public static int osszegzes(int a, int b) {
        /* kĂłdduplikĂˇlĂˇs: */
        //return a+b;
        
        /* tĂ¶bb sorban: */
        //int[] tomb = {a, b};
        //return osszegzes(tomb);
        
        /* egy sorban: */
        return osszegzes(new int[]{a, b});
    }
    
    public static double gyokvonas(int osszeg) {
        return Math.sqrt(osszeg);
    }

     /* nincs sortĂ¶rĂ©s, a KEVESEBB AZ TĂ–BB elv miatt:
    ha kiĂ­rtuk, mĂˇr nem lehet leszedni, 
    ahol kell, ott az uzenet ĂˇtadĂˇsĂˇnĂˇl belerakunk szĂłkĂ¶zt
    */
    private static void konzolraIr(String uzenet) {
        System.out.print(uzenet);
    }

   
    
}

