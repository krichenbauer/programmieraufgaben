

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Aufgabe1a
{
    @Test
    public void MitgliedTest() {
        Mitglied a = new Mitglied("Heinz", "Moser");

        assertEquals("Heinz", a.vornameGeben());
        assertEquals("Moser", a.nachnameGeben());
        
    }    
    
    
}
