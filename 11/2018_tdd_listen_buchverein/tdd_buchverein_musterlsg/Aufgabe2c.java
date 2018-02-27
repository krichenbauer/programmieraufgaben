import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2c
{
    @Test
    public void knotenZweiHerausnehmenTest() {
        Mitglied ma = new Mitglied("Vaa","Naa");
        Mitglied mb = new Mitglied("Vbb","Nbb");
        Mitglied mc = new Mitglied("Vcc","Ncc");

        Knoten ka = new Knoten(ma);
        Knoten kb = new Knoten(mb);
        Knoten kc = new Knoten(mc);

        ka.nachfolgerHinzufuegen(kb);
        kb.nachfolgerHinzufuegen(kc);

        assertEquals(true, ka.hatNachfolger());
        assertEquals(true, kb.hatNachfolger());
        assertEquals(false, kc.hatNachfolger());

        ka.knotenEntfernen(mb);
        assertEquals(true, ka.hatNachfolger());

        assertEquals(kc, ka.nachfolgerGeben());
        assertEquals(null, kc.nachfolgerGeben());
    }

    @Test
    public void knotenDreiHerausnehmenTest() {
        Mitglied ma = new Mitglied("Vaa","Naa");
        Mitglied mb = new Mitglied("Vbb","Nbb");
        Mitglied mc = new Mitglied("Vcc","Ncc");

        Knoten ka = new Knoten(ma);
        Knoten kb = new Knoten(mb);
        Knoten kc = new Knoten(mc);

        ka.nachfolgerHinzufuegen(kb);
        kb.nachfolgerHinzufuegen(kc);

        assertEquals(true, ka.hatNachfolger());
        assertEquals(true, kb.hatNachfolger());
        assertEquals(false, kc.hatNachfolger());

        ka.knotenEntfernen(mc);
        assertEquals(true, ka.hatNachfolger());
        assertEquals(false, kb.hatNachfolger());

        assertEquals(kb, ka.nachfolgerGeben());
        assertEquals(null, kb.nachfolgerGeben());

    }

}
