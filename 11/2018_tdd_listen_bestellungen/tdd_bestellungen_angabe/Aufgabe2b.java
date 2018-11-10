import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2b
{
    
    
    @Test 
    public void knotenEinNachfolgerTest() {
        Bestellung b1 = new Bestellung("Cola");
        Knoten k1 = new Knoten(b1);

        assertEquals(false, k1.hatNachfolger());
        assertEquals(null, k1.nachfolgerGeben());
        
        Bestellung b2 = new Bestellung("Limonade");
        k1.bestellungHinzufuegen(b2);
        
        assertEquals(true, k1.hatNachfolger());
        
        //entnehmen des Nachfolgers:
        Knoten k2 = k1.nachfolgerGeben();
        assertEquals(false, k2.hatNachfolger());
        assertEquals(b2, k2.bestellungGeben());
    }
    
    @Test 
    public void knotenDreiNachfolgerTest() {
        Bestellung b1 = new Bestellung("Kaffee");
        Knoten k1 = new Knoten(b1);

        Bestellung b2 = new Bestellung("Mineralwasser");
        k1.bestellungHinzufuegen(b2);
        
        Bestellung b3 = new Bestellung("Zitronentee");
        k1.bestellungHinzufuegen(b3);
        
        Bestellung b4 = new Bestellung("Orangensaft");
        k1.bestellungHinzufuegen(b4);
        
        assertEquals(true, k1.hatNachfolger());
        
        //entnehmen des ersten Nachfolgers:
        Knoten k2 = k1.nachfolgerGeben();
        assertEquals(true, k2.hatNachfolger());
        assertEquals(b2, k2.bestellungGeben());
        
        //entnehmen des zweiten Nachfolgers:
        Knoten k3 = k2.nachfolgerGeben();
        assertEquals(true, k3.hatNachfolger());
        assertEquals(b3, k3.bestellungGeben());
        
        //entnehmen des dritten Nachfolgers:
        Knoten k4 = k3.nachfolgerGeben();
        assertEquals(false, k4.hatNachfolger());
        assertEquals(b4, k4.bestellungGeben());
    }
    
    @Test
    public void leerenNachfolgerEntnehmenTest() {
        Bestellung b = new Bestellung("Kischsaft");
        Knoten k = new Knoten(b);
        
        assertEquals(null, k.nachfolgerGeben());
    }
    
    
}
