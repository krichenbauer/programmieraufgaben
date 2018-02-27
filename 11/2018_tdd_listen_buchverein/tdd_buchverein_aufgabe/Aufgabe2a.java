

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Aufgabe2a
{
    @Test
    public void KnotenErzeugenTest() {
        Mitglied a = new Mitglied("Mario", "Basler");
        Knoten k1 = new Knoten(a);
        
        assertEquals(a, k1.mitgliedGeben());
    }
    
}