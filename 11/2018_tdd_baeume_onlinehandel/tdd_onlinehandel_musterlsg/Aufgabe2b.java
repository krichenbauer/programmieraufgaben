import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2b
{
    
    
    @Test 
    public void knotenOhneNachfolgerTest() {
        Knoten a = new Knoten(null);

        assertEquals(false, a.hatLinkenNachfolger());
        assertEquals(false, a.hatRechtenNachfolger());
        assertEquals(null, a.linkerNachfolgerGeben());
        assertEquals(null, a.rechterNachfolgerGeben());
    }
    
    @Test
    public void mussRechtsEinsortiertWerdenTest() {
        Produkt a = new Produkt ("Bernis Bratensosse", 212, 149);
        Produkt b = new Produkt ("Kartoffelsalat B-Ware", 321, 499);
        
        Knoten ka = new Knoten(a);
        Knoten kb = new Knoten(b);

        assertEquals(true, ka.mussRechtsEinsortiertWerden(kb));
        assertEquals(false,kb.mussRechtsEinsortiertWerden(ka));

        /*
        assertEquals(false, ka.hatLinkenNachfolger());
        assertEquals(false, ka.hatRechtenNachfolger());
        assertEquals(null, ka.linkerNachfolgerGeben());
        assertEquals(null, ka.rechterNachfolgerGeben());

        ka.knotenEinsortieren(kb);
        assertEquals(false, ka.hatLinkenNachfolger());
        assertEquals(true, ka.hatRechtenNachfolger());
        assertEquals(null, ka.linkerNachfolgerGeben());
        assertEquals(kb, ka.rechterNachfolgerGeben());
        */
    }
    
}
