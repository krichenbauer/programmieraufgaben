import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe1a
{
    @Test
    public void halterTest() {
        Nummernschild n1 = new Nummernschild("A-SM 291");
        n1.halterEintragen("Mario Baluschke");
        assertEquals(n1.halterGeben(), "Mario Baluschke");
        
        Nummernschild n2 = new Nummernschild("N-QT 11");
        n2.halterEintragen("Carmen Kösemann");
        assertEquals(n2.halterGeben(), "Carmen Kösemann");
        
    }

}
