import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Aufgabe1a
{
    @Test
    public void ProduktTest() {
        
        Produkt a = new Produkt("Seife Superfixx", 305, 299);

        assertEquals("Seife Superfixx", a.bezeichnungGeben());
        assertEquals(305, a.artikelNrGeben());
        assertEquals(299, a.preisGeben());
    }
    
    
}
