import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe1b
{
    @Test 
    public void nichtIdentischeNummernSchilderTest() {
        Nummernschild n1 = new Nummernschild("M-AX 42");
        Nummernschild n2 = new Nummernschild("M-AX 23");
        
        assertEquals(n1.istGleich(n2), false);
    }

    @Test
    public void identischeNummernSchilderTest() {
        Nummernschild n1 = new Nummernschild("M-PU 99");
        Nummernschild n2 = new Nummernschild("M-PU 99");
        
        assertEquals(n1.istGleich(n2), true);
    }
    
    
}