import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2b
{
    
    
    @Test 
    public void knotenEinNachfolgerTest() {
        Knoten a = new Knoten(null);
        Knoten b = new Knoten(null);

        assertEquals(false, a.hatNachfolger());
        assertEquals(false, b.hatNachfolger());
        assertEquals(null, a.nachfolgerGeben());
        assertEquals(null, b.nachfolgerGeben());
        
        a.nachfolgerHinzufuegen(b);
        
        assertEquals(true, a.hatNachfolger());
        assertEquals(false, b.hatNachfolger());
        assertEquals(b, a.nachfolgerGeben());
        assertEquals(null, b.nachfolgerGeben());
    }
    

    @Test 
    public void knotenZweiNachfolgerTest() {
        Knoten a = new Knoten(null);
        Knoten b = new Knoten(null);
        Knoten c = new Knoten(null);

        assertEquals(false, a.hatNachfolger());
        assertEquals(false, b.hatNachfolger());
        assertEquals(false, c.hatNachfolger());
        assertEquals(null, a.nachfolgerGeben());
        assertEquals(null, b.nachfolgerGeben());
        assertEquals(null, c.nachfolgerGeben());
        
        a.nachfolgerHinzufuegen(b);
        
        assertEquals(true, a.hatNachfolger());
        assertEquals(false, b.hatNachfolger());
        assertEquals(false, c.hatNachfolger());
        assertEquals(b, a.nachfolgerGeben());
        assertEquals(null, b.nachfolgerGeben());
        assertEquals(null, c.nachfolgerGeben());
        
        b.nachfolgerHinzufuegen(c);

        assertEquals(true, a.hatNachfolger());
        assertEquals(true, b.hatNachfolger());
        assertEquals(false, c.hatNachfolger());
        assertEquals(b, a.nachfolgerGeben());
        assertEquals(c, b.nachfolgerGeben());
        assertEquals(null, c.nachfolgerGeben());

    }
    
    
    
    
}
