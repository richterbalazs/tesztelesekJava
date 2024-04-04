
package teszt;

public class StaticHasznalat {
    public static void main(String[] args) {
        m1();
        m2();
        /* nem hívható, mivel static csak staticot tud hívni. */
        // m3();
        // m4();
        
        StaticHasznalat.m1(); // <-- inkáb így 
    }
    
    private static void m1(){
        m2();
    }
    
    static void m2() {
        
    }
    
    void m3() {
       StaticHasznalat.m1(); 
       m4();
    }
    
    private void m4() {
        
    }
}
