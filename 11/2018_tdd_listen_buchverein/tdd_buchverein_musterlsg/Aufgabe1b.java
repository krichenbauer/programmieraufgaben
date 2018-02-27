import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe1b
{
    @Test
    public void MitgliedTest() {
        Mitglied a = new Mitglied("Maria", "Kunals");

        assertEquals("Maria", a.vornameGeben());

        a.nachnameAendern("Moser");
        assertEquals("Moser", a.nachnameGeben());
        
    }    
    

}
