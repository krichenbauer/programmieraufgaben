

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe3c
{
    @Test
    public void vorderstesMitgliedEntfernenTest() {
        Mitglied ma = new Mitglied("Vaa","Naa");
        Mitglied mb = new Mitglied("Vbb","Nbb");
        Mitglied mc = new Mitglied("Vcc","Ncc");
        
        BuchListe l = new BuchListe();
        l.mitgliedAnstellen(ma);
        l.mitgliedAnstellen(mb);
        l.mitgliedAnstellen(mc);
        
        l.mitgliedEntfernen(ma);
        assertEquals(mb, l.naechstesMitgliedEntnehmen());
        assertEquals(mc, l.naechstesMitgliedEntnehmen());
        assertEquals(null, l.naechstesMitgliedEntnehmen());
    }
    @Test
    public void mittleresMitgliedEntfernenTest() {
        Mitglied ma = new Mitglied("Vaa","Naa");
        Mitglied mb = new Mitglied("Vbb","Nbb");
        Mitglied mc = new Mitglied("Vcc","Ncc");
        
        BuchListe l = new BuchListe();
        l.mitgliedAnstellen(ma);
        l.mitgliedAnstellen(mb);
        l.mitgliedAnstellen(mc);
        
        l.mitgliedEntfernen(mb);
        assertEquals(ma, l.naechstesMitgliedEntnehmen());
        assertEquals(mc, l.naechstesMitgliedEntnehmen());
        assertEquals(null, l.naechstesMitgliedEntnehmen());
    }
    @Test
    public void hinteresMitgliedEntfernenTest() {
        Mitglied ma = new Mitglied("Vaa","Naa");
        Mitglied mb = new Mitglied("Vbb","Nbb");
        Mitglied mc = new Mitglied("Vcc","Ncc");
        
        BuchListe l = new BuchListe();
        l.mitgliedAnstellen(ma);
        l.mitgliedAnstellen(mb);
        l.mitgliedAnstellen(mc);
        
        l.mitgliedEntfernen(mc);
        assertEquals(ma, l.naechstesMitgliedEntnehmen());
        assertEquals(mb, l.naechstesMitgliedEntnehmen());
        assertEquals(null, l.naechstesMitgliedEntnehmen());
    }
    
    
    
}
