import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe1c
{
    @Test
    public void BestellNummernTest() {
        Bestellung a = new Bestellung("5");
        assertEquals("Kaffee", a.sorteGeben());
        
        //das alte Verhalten muss selbstverständlich auch noch Funktionieren.
        Bestellung b = new Bestellung("Kaffee");
        assertEquals("Kaffee", b.sorteGeben());

        Bestellung c = new Bestellung("23");
        assertEquals("Spezi", c.sorteGeben());
        
        Bestellung d = new Bestellung("42");
        assertEquals("Cola", d.sorteGeben());
    
    }
    
}