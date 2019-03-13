import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2c
{
    @Test
    public void neuerKnoten() {
        Knoten k1 = new Knoten(null);
        assertEquals(k1.knotenLinksGeben(), null);
        assertEquals(k1.knotenRechtsGeben(), null);
    }
    
    @Test
    public void andererKnoten() {
        Knoten k1 = new Knoten(null);
        Knoten kl = new Knoten(null);
        Knoten kr = new Knoten(null);
        
        k1.knotenLinksSetzen(kl);
        k1.knotenRechtsSetzen(kr);
        
        assertEquals(k1.knotenLinksGeben(), kl);
        assertEquals(k1.knotenRechtsGeben(), kr);
        
    }
}
