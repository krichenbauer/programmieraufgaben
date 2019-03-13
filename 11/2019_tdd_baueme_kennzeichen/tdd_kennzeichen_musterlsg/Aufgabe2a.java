import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2a
{
    @Test
    public void neuerKnotenTest() {
        Nummernschild n1 = new Nummernschild("OAL-Q 191");
        Knoten k1 = new Knoten(n1);
        assertEquals(k1.nummernschildGeben(), n1);

        Nummernschild n2 = new Nummernschild("RO-M 83");
        Knoten k2 = new Knoten(n2);
        assertEquals(k2.nummernschildGeben(), n2);
    
    }
}
