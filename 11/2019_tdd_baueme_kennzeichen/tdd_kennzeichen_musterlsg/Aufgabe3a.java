import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe3a
{
    @Test 
    public void weitereFahrzeugeEinordnenTest() {
        Nummernschild nw = new Nummernschild("L-Y 56");
        Nummernschild nl = new Nummernschild("C-EV 3");
        Nummernschild nr = new Nummernschild("M-KU 106");
        Nummernschild nll = new Nummernschild("AA-QT 12");
        Nummernschild nlr = new Nummernschild("D-T 99");
        Nummernschild nllr = new Nummernschild("AA-Z 7");

        Fahrzeugregister f1 = new Fahrzeugregister();

        f1.einfuegen(nw);
       
        Knoten wurzel = f1.wurzelGeben();
        assertEquals(wurzel.nummernschildGeben(), nw);
        
        
        f1.einfuegen(nl);
        f1.einfuegen(nr);
        f1.einfuegen(nll);
        f1.einfuegen(nlr);
        f1.einfuegen(nllr);

        assertEquals(wurzel.knotenLinksGeben().nummernschildGeben().kennzeichenGeben(), nl.kennzeichenGeben());
        assertEquals(wurzel.knotenRechtsGeben().nummernschildGeben().kennzeichenGeben(), nr.kennzeichenGeben());
        assertEquals(wurzel.knotenLinksGeben().knotenLinksGeben().nummernschildGeben().kennzeichenGeben(), nll.kennzeichenGeben());
        assertEquals(wurzel.knotenLinksGeben().knotenRechtsGeben().nummernschildGeben().kennzeichenGeben(), nlr.kennzeichenGeben());
        assertEquals(wurzel.knotenLinksGeben().knotenLinksGeben().knotenRechtsGeben().nummernschildGeben().kennzeichenGeben(), nllr.kennzeichenGeben());

    
    }
}
