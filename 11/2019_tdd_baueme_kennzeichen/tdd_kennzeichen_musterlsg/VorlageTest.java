import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VorlageTest
{
    
    public VorlageTest()
    {

    }
    
    @Test
    public void kennzeichenTest() {
        Nummernschild n1 = new Nummernschild("M-IT 1337");
        Nummernschild n2 = new Nummernschild("STA-X 52");
        Nummernschild n3 = new Nummernschild("STA-X 53");
        
        assertEquals(n1.kennzeichenGeben(),"M-IT 1337");
        assertEquals(n2.kennzeichenGeben(),"STA-X 52");
        assertEquals(n3.kennzeichenGeben(),"STA-X 53");
    }
    
    @Test
    public void reihenfolgeTest() {
        Nummernschild n1 = new Nummernschild("M-IT 1337");
        Nummernschild n2 = new Nummernschild("STA-X 52");
        Nummernschild n3 = new Nummernschild("STA-X 53");
        Nummernschild n4 = new Nummernschild("B-US 23");
        
        assertEquals(n1.istVor(n2),true);
        assertEquals(n2.istVor(n3),true);
        assertEquals(n3.istVor(n4),false);
        assertEquals(n4.istVor(n1),true);
        assertEquals(n1.istVor(n3),true);
    }


}
