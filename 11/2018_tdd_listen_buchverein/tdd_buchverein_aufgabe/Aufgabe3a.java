import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe3a
{
    @Test
    public void buchListeOhneMitgliederTest() {
        BuchListe l = new BuchListe();
        assertEquals(null, l.naechstesMitgliedEntnehmen());
    }

    @Test
    public void buchListeEinMitgliedTest() {
        Mitglied ma = new Mitglied("Vaa","Naa");
        
        BuchListe l = new BuchListe();
        l.mitgliedAnstellen(ma);

        assertEquals(ma, l.naechstesMitgliedEntnehmen());
        assertEquals(null, l.naechstesMitgliedEntnehmen());
    }
    
    @Test
    public void buchListeDreiMitgliederTest() {
        Mitglied ma = new Mitglied("Vaa","Naa");
        Mitglied mb = new Mitglied("Vbb","Nbb");
        Mitglied mc = new Mitglied("Vcc","Ncc");
        
        BuchListe l = new BuchListe();
        l.mitgliedAnstellen(ma);
        l.mitgliedAnstellen(mb);
        l.mitgliedAnstellen(mc);
        
        assertEquals(ma, l.naechstesMitgliedEntnehmen());
        assertEquals(mb, l.naechstesMitgliedEntnehmen());
        assertEquals(mc, l.naechstesMitgliedEntnehmen());
        assertEquals(null, l.naechstesMitgliedEntnehmen());
    }

}
