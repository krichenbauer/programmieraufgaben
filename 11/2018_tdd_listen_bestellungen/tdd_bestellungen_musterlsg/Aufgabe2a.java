import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2a
{
    @Test
    public void KnotenKonstruktorTest() {
        Bestellung b1 = new Bestellung("Milch");
        Knoten k1 = new Knoten(b1);
        assertEquals(b1, k1.bestellungGeben());
        
        Knoten k2 = new Knoten(null);
        assertEquals(null, k2.bestellungGeben());
    }

}

