import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2a
{
    @Test
    public void einLeererKnotenTest() {
        Knoten k = new Knoten(null);
        
        assertEquals(null, k.datenElementGeben());
    }
    
    @Test
    public void knotenMitWebAdresseTest() {
        WebAdresse a = new WebAdresse("www.gym-hksb.de");
        
        Knoten k = new Knoten(a);
        
        assertEquals(a, k.datenElementGeben());
    }
    
    
    
    
    
    



}
