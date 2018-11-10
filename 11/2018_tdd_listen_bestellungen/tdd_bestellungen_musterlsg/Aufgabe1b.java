import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Aufgabe1b
{
    @Test
    public void groesseTest() {
        Bestellung a = new Bestellung("Limonade");
        assertEquals("klein", a.groesseGeben());
        assertEquals(false, a.istGross());

        
        Bestellung b = new Bestellung("Tee");
        assertEquals("klein", b.groesseGeben());
        assertEquals(false, b.istGross());
        
        b.grossSetzen();
        assertEquals("gross", b.groesseGeben());
        assertEquals(true, b.istGross());
    }
    
}