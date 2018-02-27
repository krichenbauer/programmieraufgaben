import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe3b
{
    @Test
    public void letztesMitgliedAusgebenTest() {
        Mitglied ma = new Mitglied("Vaa","Naa");
        Mitglied mb = new Mitglied("Vbb","Nbb");
        Mitglied mc = new Mitglied("Vcc","Ncc");
        
        BuchListe l = new BuchListe();
        assertEquals(null, l.letztesMitgliedGeben());
        
        l.mitgliedAnstellen(ma);
        assertEquals(ma, l.letztesMitgliedGeben());

        l.mitgliedAnstellen(mb);
        assertEquals(mb, l.letztesMitgliedGeben());

        l.mitgliedAnstellen(mc);
        assertEquals(mc, l.letztesMitgliedGeben());
        
    }
}
