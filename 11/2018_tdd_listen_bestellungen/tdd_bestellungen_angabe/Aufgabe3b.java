import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe3b
{
    @Test
    public void kleineGetraenkeZaehlenWennNurKleineGetraenkeVorhandenSindTest()
    {
        Bestellung klein1 = new Bestellung("Cola");
        Bestellung klein2 = new Bestellung("Cola");
        Bestellung klein3 = new Bestellung("Cola");
        Bestellung klein4 = new Bestellung("Cola");
        
        
        BestellSystem bs = new BestellSystem();
        assertEquals(0, bs.kleineGetraenkeZaehlen());
        
        bs.bestellungHinzufuegen(klein1);
        assertEquals(1, bs.kleineGetraenkeZaehlen());
        
        bs.bestellungHinzufuegen(klein2);
        assertEquals(2, bs.kleineGetraenkeZaehlen());
        
        bs.bestellungHinzufuegen(klein3);
        assertEquals(3, bs.kleineGetraenkeZaehlen());
        
        bs.bestellungHinzufuegen(klein4);
        assertEquals(4, bs.kleineGetraenkeZaehlen());
    }
    
    
    @Test
    public void kleineGetraenkeZaehlenTest()
    {
        Bestellung klein1 = new Bestellung("Cola");
        Bestellung klein2 = new Bestellung("Cola");
        Bestellung klein3 = new Bestellung("Cola");
        Bestellung klein4 = new Bestellung("Cola");
        Bestellung klein5 = new Bestellung("Cola");
        Bestellung klein6 = new Bestellung("Cola");
        Bestellung klein7 = new Bestellung("Cola");
        Bestellung klein8 = new Bestellung("Cola");
        Bestellung klein9 = new Bestellung("Cola");
        
        Bestellung gross1 = new Bestellung("Cola");
        gross1.grossSetzen();
        Bestellung gross2 = new Bestellung("Cola");
        gross2.grossSetzen();
        Bestellung gross3 = new Bestellung("Cola");
        gross3.grossSetzen();
        
        BestellSystem bs = new BestellSystem();
        assertEquals(0, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(klein1);
        assertEquals(1, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(klein2);
        assertEquals(2, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(gross1);
        assertEquals(2, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(klein3);
        assertEquals(3, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(gross2);
        assertEquals(3, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(klein4);
        assertEquals(4, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(gross3);
        assertEquals(4, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(klein5);
        assertEquals(5, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(klein6);
        assertEquals(6, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(klein7);
        assertEquals(7, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(klein8);
        assertEquals(8, bs.kleineGetraenkeZaehlen());

        bs.bestellungHinzufuegen(klein9);
        assertEquals(9, bs.kleineGetraenkeZaehlen());
    }
    
}
