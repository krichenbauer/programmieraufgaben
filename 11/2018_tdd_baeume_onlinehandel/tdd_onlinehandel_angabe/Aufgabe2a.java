import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Aufgabe2a
{
    @Test
    public void KnotenErzeugenTest() {
        Produkt a = new Produkt("Waschmittel Waschplus", 23, 795);
        Knoten k1 = new Knoten(a);
        
        assertEquals(a, k1.produktGeben());
    }
    
    
}