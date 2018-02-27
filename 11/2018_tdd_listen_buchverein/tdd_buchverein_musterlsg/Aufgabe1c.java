import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe1c
{
    @Test
    public void MitgliedSinnvollTest() {
        Mitglied a = new Mitglied("Test", "Test");
        assertEquals("Test", a.vornameGeben());
        assertEquals("Test", a.nachnameGeben());
    }   
    
    @Test 
    public void MitgliedLeererStringTest() {
        Mitglied a = new Mitglied("","");
        assertEquals("!!!FEHLER!!!", a.vornameGeben());
        assertEquals("!!!FEHLER!!!", a.nachnameGeben());
        
        Mitglied b = new Mitglied("", "Test");
        assertEquals("!!!FEHLER!!!", b.vornameGeben());
        assertEquals("!!!FEHLER!!!", b.nachnameGeben());

        Mitglied c = new Mitglied("Test", "");
        assertEquals("!!!FEHLER!!!", c.vornameGeben());
        assertEquals("!!!FEHLER!!!", c.nachnameGeben());
    }
    
    @Test
    public void MitgliedNullTest() {
        Mitglied a = new Mitglied(null,null);
        assertEquals("!!!FEHLER!!!", a.vornameGeben());
        assertEquals("!!!FEHLER!!!", a.nachnameGeben());
        
        Mitglied b = new Mitglied(null, "Test");
        assertEquals("!!!FEHLER!!!", b.vornameGeben());
        assertEquals("!!!FEHLER!!!", b.nachnameGeben());

        Mitglied c = new Mitglied("Test", null);
        assertEquals("!!!FEHLER!!!", c.vornameGeben());
        assertEquals("!!!FEHLER!!!", c.nachnameGeben());
    }
    
}