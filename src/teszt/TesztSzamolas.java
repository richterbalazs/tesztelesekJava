
package teszt;

import oraimunka0404.beugrok;


public class TesztSzamolas {
    
    public static void main(String[] args) {
        tesztesetek();
    }
    
    private static void tesztesetek() {
        osszeadas2PozitivTeszt();
        osszeadas1Negativ1PozitivTeszt();
        negativOsszegekOsszeadasaTeszt();
        legnagyobbPozitivOsszeadasTeszt();
        legkisebbPozitivOsszeadasTeszt();
        egyjegyuSzamokOsszeaadasaTeszt();
        negyzetgyokNegativTeszt();
    }
    
    private static void osszeadas2PozitivTeszt() {
        String tesztEset = "2 + szám";
        System.out.println(tesztEset);
        int kapott = beugrok.osszegzes(2, 3);
        int vart = 5;
        
        assert kapott == vart : "hiba: " + tesztEset;     
//        if(kapott == vart) {
//            System.out.println("jó teszt");
//        }else{
//            System.out.println("NEM jó teszt");
//        }
    }

   private static void osszeadas1Negativ1PozitivTeszt() {
       String tesztLeiras = "1-, 1+ szám:";
       System.out.println(tesztLeiras);
       int kapott = beugrok.osszegzes(-2, 3);
       int vart = 1;
      
       assert kapott == vart : "hiba: " + tesztLeiras; 
    }
   
   private static void negativOsszegekOsszeadasaTeszt(){
       String tesztLeiras = "2- szám összegének tesztelése:";
       System.out.println(tesztLeiras);
       int kapott = beugrok.osszegzes(-2, -5);
       int vart = -7;
               
       assert kapott == vart : "hiba: " + tesztLeiras;
   }
   
   private static void legnagyobbPozitivOsszeadasTeszt() {
//       String tesztLeiras = "Legnagyobb int összeg összeadása: ";
//       System.out.println(tesztLeiras);
//       int kapott = beugrok.osszegzes(2147483647, 2147483647);
//       int vart = 2147483647;
//       
//       assert kapott == vart: "hiba: " + tesztLeiras;
   }
   
   private static void legkisebbPozitivOsszeadasTeszt() {
       String tesztLeiras = "Két legkisebb int összeg összeadása";
       System.out.println(tesztLeiras);
       int kapott = beugrok.osszegzes(1, 1);
       int vart = 2;
       
       assert kapott == vart: "hiba: " + tesztLeiras;
   }
   
   private static void egyjegyuSzamokOsszeaadasaTeszt(){
       String tesztLeiras = "Két pozitív egyjegyű szám összeadása";
       System.out.println(tesztLeiras);
       int kapott = beugrok.osszegzes(5,4);
       int vart = 9;
       
       assert kapott == vart: "hiba: " + tesztLeiras;
   }
   
   private static void negyzetgyokNegativTeszt(){
       String sz = "nGyök: -";
       System.out.println(sz);
       double kapott = beugrok.gyokvonas(-5);
       
       assert Double.isNaN(kapott) : "hibás: " + sz;
   }
   
   
   
}
