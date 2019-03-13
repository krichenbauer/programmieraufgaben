import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2b
{
    @Test
    public void leeresFahrzeugRegisterTest() {
        Fahrzeugregister f1 = new Fahrzeugregister();
        assertEquals(f1.wurzelGeben(), null);
    }

    @Test
    public void erstesFahrzeugEinfuegenTest(){
        Nummernschild n1 = new Nummernschild("L-Y 56");

        Fahrzeugregister f1 = new Fahrzeugregister();

        f1.einfuegen(n1);
        
        assertEquals(f1.wurzelGeben().nummernschildGeben().kennzeichenGeben(), n1.kennzeichenGeben());
    }
    

}
