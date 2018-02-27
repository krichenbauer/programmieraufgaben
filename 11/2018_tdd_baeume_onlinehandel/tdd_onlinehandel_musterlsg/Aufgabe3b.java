import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe3b
{
    @Test
    public void produktSuchenTest()
    {
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
        assertEquals(rl,baum.suchen(290));
        assertEquals(rrlr,baum.suchen(309));
        assertEquals(lr,baum.suchen(150));
        assertEquals(w,baum.suchen(200));
        
    }
}
