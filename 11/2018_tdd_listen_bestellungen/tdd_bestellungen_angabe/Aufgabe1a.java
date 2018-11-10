import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Aufgabe1a
{
    @Test
    public void SortenTest() {
        Bestellung a = new Bestellung("Limonade");
        Bestellung b = new Bestellung("Tee");
        Bestellung c = new Bestellung("Mineralwasser");

        assertEquals("Limonade", a.sorteGeben());
        assertEquals("Tee", b.sorteGeben());
        assertEquals("Mineralwasser", c.sorteGeben());
        
    }    
    
    
}
