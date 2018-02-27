import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe3
{
    @Test
    public void leererStapelTest() {
        Stapel s = new Stapel();
        
        assertEquals(null, s.letztenKnotenEntnehmen());
        
    }
    
    @Test 
    public void einenKnotenImStapelTest() {
        Stapel s = new Stapel();
        Knoten k = new Knoten(null);
        
        s.knotenHinzufuegen(k);
        
        assertEquals(k, s.letztenKnotenEntnehmen());
        assertEquals(null, s.letztenKnotenEntnehmen());
    }
    
    @Test
    public void vieleKnotenImStapelAnstellenUndEntnehmenTest() {
        Stapel s = new Stapel();

        Knoten k1 = new Knoten(null);
        Knoten k2 = new Knoten(null);
        Knoten k3 = new Knoten(null);
        Knoten k4 = new Knoten(null);
    
        Knoten letzter = null; //für später...
        
        
        //k2 bis k4 hinzufügen.
        s.knotenHinzufuegen(k1);
        s.knotenHinzufuegen(k2);
        s.knotenHinzufuegen(k3);
        s.knotenHinzufuegen(k4);

        
        //k4 ist der letzte Knoten.
        letzter = s.letztenKnotenEntnehmen();
        assertEquals(letzter, k4);
        
        //k3 ist der letzte Knoten
        letzter = s.letztenKnotenEntnehmen();
        assertEquals(letzter, k3);

        //k2 ist der letzte Knoten
        letzter = s.letztenKnotenEntnehmen();
        assertEquals(letzter, k2);
        
        //k1 ist der letzte Knoten
        letzter = s.letztenKnotenEntnehmen();
        assertEquals(letzter, k1);
        
        //Stapel ist leer:
        letzter = s.letztenKnotenEntnehmen();
        assertEquals(letzter, null);
    }




}
