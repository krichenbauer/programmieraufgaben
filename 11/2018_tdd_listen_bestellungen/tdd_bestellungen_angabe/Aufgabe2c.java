import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe2c
{
    @Test
    public void undoTest() {
        Bestellung b1 = new Bestellung("Kaffee");
        Knoten k1 = new Knoten(b1);

        Bestellung b2 = new Bestellung("Mineralwasser");
        k1.bestellungHinzufuegen(b2);
        
        Bestellung b3 = new Bestellung("Zitronentee");
        k1.bestellungHinzufuegen(b3);
        
        Bestellung b4 = new Bestellung("Orangensaft");
        k1.bestellungHinzufuegen(b4);
       
        Knoten k2 = k1.nachfolgerGeben();
        Knoten k3 = k2.nachfolgerGeben();
        assertEquals(true, k3.hatNachfolger());

        k1.undo(); //dies muss die letzte, vierte Bestellung wieder entfernen.
        
        assertEquals(false, k3.hatNachfolger());
    }
}
