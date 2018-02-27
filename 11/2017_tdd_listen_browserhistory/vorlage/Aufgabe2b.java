import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2b
{
    @Test
    public void istLetzerKnotenTest() {
        Knoten k1 = new Knoten(null);
        
        assertEquals(true, k1.istLetzterKnoten());

        Knoten k2 = new Knoten(null);
        k1.nachfolgerHinzufuegen(k1);
        assertEquals(false, k1.istLetzterKnoten());
    }

    
    @Test
    public void einenKnotenHintenAnstellenUndEntnehmenTest() {
        Knoten k1 = new Knoten(null);
        Knoten k2 = new Knoten(null);
        Knoten letzter = null; //für später...
        
        
        k1.nachfolgerHinzufuegen(k2);

        //k2 ist der letzte Knoten
        assertEquals(false, k1.istLetzterKnoten());
        assertEquals(true, k2.istLetzterKnoten());
       
        letzter = k1.letztenKnotenEntnehmen();
        assertEquals(letzter, k2);
        
        //k1 ist der letzte Knoten
        assertEquals(true, k1.istLetzterKnoten());
    }
    
    
    @Test
    public void vieleKnotenHintenAnstellenUndEntnehmenTest() {
        Knoten k1 = new Knoten(null);
        Knoten k2 = new Knoten(null);
        Knoten k3 = new Knoten(null);
        Knoten k4 = new Knoten(null);
    
        Knoten letzter = null; //für später...
        
        
        //k2 bis k4 hinzufügen.
        k1.nachfolgerHinzufuegen(k2);
        k1.nachfolgerHinzufuegen(k3);
        k1.nachfolgerHinzufuegen(k4);

        
        //k4 ist der letzte Knoten.
        assertEquals(false, k1.istLetzterKnoten());
        assertEquals(false, k2.istLetzterKnoten());
        assertEquals(false, k3.istLetzterKnoten());
        assertEquals(true, k4.istLetzterKnoten());
        
        letzter = k1.letztenKnotenEntnehmen();
        assertEquals(letzter, k4);
        
        //k3 ist der letzte Knoten
        assertEquals(false, k1.istLetzterKnoten());
        assertEquals(false, k2.istLetzterKnoten());
        assertEquals(true, k3.istLetzterKnoten());

        letzter = k1.letztenKnotenEntnehmen();
        assertEquals(letzter, k3);

        //k2 ist der letzte Knoten
        assertEquals(false, k1.istLetzterKnoten());
        assertEquals(true, k2.istLetzterKnoten());
       
        letzter = k1.letztenKnotenEntnehmen();
        assertEquals(letzter, k2);
        
        //k1 ist der letzte Knoten
        assertEquals(true, k1.istLetzterKnoten());
    }
    
    
    
    
    
    



}
