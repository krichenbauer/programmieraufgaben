import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe3b
{
    @Test 
    public void gleicheFahrzeugeEinordnenTest() {
        Nummernschild nw = new Nummernschild("L-Y 56");
        Nummernschild nfalsch1 = new Nummernschild("L-Y 56");
        Nummernschild nl = new Nummernschild("C-EV 3");
        Nummernschild nr = new Nummernschild("M-KU 106");
        Nummernschild nll = new Nummernschild("AA-QT 12");
        Nummernschild nfalsch2 = new Nummernschild("AA-QT 12");
        Nummernschild nlr = new Nummernschild("D-T 99");
        Nummernschild nllr = new Nummernschild("AA-Z 7");
        Nummernschild nfalsch3 = new Nummernschild("AA-Z 7");

        Fahrzeugregister f1 = new Fahrzeugregister();

        f1.einfuegen(nw);

        Knoten wurzel = f1.wurzelGeben();
        assertEquals(wurzel.nummernschildGeben(), nw);

        f1.einfuegen(nl);

        assertEquals(wurzel.knotenLinksGeben().nummernschildGeben().kennzeichenGeben(), nl.kennzeichenGeben());
        
        f1.einfuegen(nfalsch1);

        /* muss verworfen werden, darf also nirgendwo dranhängen */
        assertEquals(wurzel.knotenRechtsGeben(), null);
        assertEquals(wurzel.knotenLinksGeben().knotenLinksGeben(), null);
        assertEquals(wurzel.knotenLinksGeben().knotenRechtsGeben(), null);
        
        
        /* weitere knoten einfuegen */
        f1.einfuegen(nr);
        f1.einfuegen(nll);
        f1.einfuegen(nfalsch2);
        f1.einfuegen(nlr);
        f1.einfuegen(nllr);


        assertEquals(wurzel.knotenRechtsGeben().nummernschildGeben().kennzeichenGeben(), nr.kennzeichenGeben());
        assertEquals(wurzel.knotenLinksGeben().knotenLinksGeben().nummernschildGeben().kennzeichenGeben(), nll.kennzeichenGeben());
        assertEquals(wurzel.knotenLinksGeben().knotenRechtsGeben().nummernschildGeben().kennzeichenGeben(), nlr.kennzeichenGeben());
        assertEquals(wurzel.knotenLinksGeben().knotenLinksGeben().knotenRechtsGeben().nummernschildGeben().kennzeichenGeben(), nllr.kennzeichenGeben());

        f1.einfuegen(nfalsch3);

        assertEquals(wurzel.knotenLinksGeben().knotenLinksGeben().knotenRechtsGeben().knotenLinksGeben(), null);
        assertEquals(wurzel.knotenLinksGeben().knotenLinksGeben().knotenRechtsGeben().knotenRechtsGeben(), null);

    }
}
