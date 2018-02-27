import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2c
{
    @Test
    public void einenKnotenRechtsEinsortierenTest() {
        Produkt a = new Produkt ("Bernis Bratensosse", 212, 149);
        Produkt b = new Produkt ("Kartoffelsalat B-Ware", 321, 499);
        
        Knoten ka = new Knoten(a);
        Knoten kb = new Knoten(b);

        assertEquals(false, ka.hatLinkenNachfolger());
        assertEquals(false, ka.hatRechtenNachfolger());
        assertEquals(null, ka.linkerNachfolgerGeben());
        assertEquals(null, ka.rechterNachfolgerGeben());

        ka.knotenEinsortieren(kb);
        assertEquals(false, ka.hatLinkenNachfolger());
        assertEquals(true, ka.hatRechtenNachfolger());
        assertEquals(null, ka.linkerNachfolgerGeben());
        assertEquals(kb, ka.rechterNachfolgerGeben());
    }
    
    @Test
    public void einenKnotenLinksEinsortierenTest() {
        Produkt a = new Produkt ("Weinkorkenset", 912, 1249);
        Produkt b = new Produkt ("Rohrzange", 31, 499);
        
        Knoten ka = new Knoten(a);
        Knoten kb = new Knoten(b);

        assertEquals(false, ka.hatLinkenNachfolger());
        assertEquals(false, ka.hatRechtenNachfolger());
        assertEquals(null, ka.linkerNachfolgerGeben());
        assertEquals(null, ka.rechterNachfolgerGeben());

        ka.knotenEinsortieren(kb);
        assertEquals(true, ka.hatLinkenNachfolger());
        assertEquals(false, ka.hatRechtenNachfolger());
        assertEquals(kb, ka.linkerNachfolgerGeben());
        assertEquals(null, ka.rechterNachfolgerGeben());
    }
    
    @Test
    public void mehrereKnotenEinsortierenTest() {
        Produkt w   = new Produkt ("Dings", 200, 199);
        Produkt l   = new Produkt ("Dangs", 100, 199);
        Produkt lr  = new Produkt ("Dungs", 150, 199);
        Produkt ll  = new Produkt ("Dyngs",  50, 199);
        Produkt r   = new Produkt ("Dongs", 300, 199);
        Produkt rl  = new Produkt ("Düngs", 290, 199);
        Produkt rr  = new Produkt ("Djngx", 310, 199);
        Produkt rrl = new Produkt ("Dkngx", 308, 199);
        Produkt rrlr= new Produkt ("Da&%s", 309, 199);
        
        Knoten kw    = new Knoten(w);
        Knoten kl    = new Knoten(l);
        Knoten klr   = new Knoten(lr);
        Knoten kll   = new Knoten(ll);
        Knoten kr    = new Knoten(r);
        Knoten krl   = new Knoten(rl);
        Knoten krr   = new Knoten(rr);
        Knoten krrl  = new Knoten(rrl);
        Knoten krrlr = new Knoten(rrlr);
        
        kw.knotenEinsortieren(kl);
        kw.knotenEinsortieren(klr);
        kw.knotenEinsortieren(kll);
        kw.knotenEinsortieren(kr);
        kw.knotenEinsortieren(krr);
        kw.knotenEinsortieren(krl);
        kw.knotenEinsortieren(krrl);
        kw.knotenEinsortieren(krrlr);

        assertEquals(kl     , kw.linkerNachfolgerGeben());
        assertEquals(kr     , kw.rechterNachfolgerGeben());
        assertEquals(kll    , kl.linkerNachfolgerGeben());
        assertEquals(null   , kll.linkerNachfolgerGeben());
        assertEquals(null   , kll.rechterNachfolgerGeben());
        assertEquals(klr    , kl.rechterNachfolgerGeben());
        assertEquals(null   , klr.linkerNachfolgerGeben());
        assertEquals(null   , klr.rechterNachfolgerGeben());

        assertEquals(krl    , kr.linkerNachfolgerGeben());
        assertEquals(krr    , kr.rechterNachfolgerGeben());
        assertEquals(krrl   , krr.linkerNachfolgerGeben());
        assertEquals(krrlr  , krrl.rechterNachfolgerGeben());
        assertEquals(null   , krrlr.linkerNachfolgerGeben());
        assertEquals(null   , krrlr.rechterNachfolgerGeben());
        
        
        
    }
    
    

}
