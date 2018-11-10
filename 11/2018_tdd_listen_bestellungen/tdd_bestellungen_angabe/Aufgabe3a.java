import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe3a
{
    @Test 
    public void listeOhneElementeTesten() {
        BestellSystem bs = new BestellSystem();
        assertEquals(null, bs.bestellungEntnehmen());
    }
    
    @Test
    public void listeMitEinemElementTesten() {
        BestellSystem bs = new BestellSystem();
        assertEquals(null, bs.bestellungEntnehmen()); //die Liste ist am Anfang leer.

        Bestellung b1 = new Bestellung("Himbeersaftschorle");
        bs.bestellungHinzufuegen(b1);
        
        assertEquals(b1, bs.bestellungEntnehmen());
        assertEquals(null, bs.bestellungEntnehmen()); //nach der Entnahme von b1 muss die Liste wieder leer sein.
    }
    
    @Test
    public void listeMitVierElementTesten() {
        BestellSystem bs = new BestellSystem();
        assertEquals(null, bs.bestellungEntnehmen()); //die Liste ist am Anfang leer.

        Bestellung b1 = new Bestellung("Himbeersaftschorle");
        bs.bestellungHinzufuegen(b1);
        Bestellung b2 = new Bestellung("Johannissaftschorle");
        bs.bestellungHinzufuegen(b2);
        Bestellung b3 = new Bestellung("Apfelsaftschorle");
        bs.bestellungHinzufuegen(b3);
        Bestellung b4 = new Bestellung("Kischsaftschorle");
        bs.bestellungHinzufuegen(b4);
        
        assertEquals(b1, bs.bestellungEntnehmen());
        assertEquals(b2, bs.bestellungEntnehmen());
        assertEquals(b3, bs.bestellungEntnehmen());
        assertEquals(b4, bs.bestellungEntnehmen());
        assertEquals(null, bs.bestellungEntnehmen()); //nach der Entnahme von b1 muss die Liste wieder leer sein.
    }

}
