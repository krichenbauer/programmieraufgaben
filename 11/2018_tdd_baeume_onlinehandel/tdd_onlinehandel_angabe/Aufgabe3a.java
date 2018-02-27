import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe3a
{
    @Test
    public void leererBaum() {
        ProduktSuchBaum baum = new ProduktSuchBaum();
        assertEquals(null, baum.wurzelGeben());
    }

    @Test
    public void BaumMitEinemProduktWurzelTest() {
        Produkt a = new Produkt("Stuhl", 102, 4950);
        ProduktSuchBaum baum = new ProduktSuchBaum();

        baum.produktEinsortieren(a);
        assertEquals("Stuhl", baum.wurzelGeben().produktGeben().bezeichnungGeben());

    }

    @Test
    public void großerBaumTest() {
        Produkt w   = new Produkt ("Dings", 200, 199);
        Produkt l   = new Produkt ("Dangs", 100, 199);
        Produkt lr  = new Produkt ("Dungs", 150, 199);
        Produkt ll  = new Produkt ("Dyngs",  50, 199);
        Produkt r   = new Produkt ("Dongs", 300, 199);
        Produkt rl  = new Produkt ("Düngs", 290, 199);
        Produkt rr  = new Produkt ("Djngx", 310, 199);
        Produkt rrl = new Produkt ("Dkngx", 308, 199);
        Produkt rrlr= new Produkt ("Da&%s", 309, 199);

        ProduktSuchBaum baum = new ProduktSuchBaum();
        baum.produktEinsortieren(w);
        baum.produktEinsortieren(l);
        baum.produktEinsortieren(lr);
        baum.produktEinsortieren(ll);
        baum.produktEinsortieren(r);
        baum.produktEinsortieren(rl);
        baum.produktEinsortieren(rr);
        baum.produktEinsortieren(rrl);
        baum.produktEinsortieren(rrlr);

        //stichproben....
        assertEquals("Dyngs", baum.wurzelGeben().linkerNachfolgerGeben().linkerNachfolgerGeben().produktGeben().bezeichnungGeben());
        assertEquals("Da&%s", baum.wurzelGeben().rechterNachfolgerGeben().rechterNachfolgerGeben().linkerNachfolgerGeben().rechterNachfolgerGeben().produktGeben().bezeichnungGeben());
        
    }

}
