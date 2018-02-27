import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe1b
{
    @Test
    public void ProduktVergleichTest() {
        
        Produkt a = new Produkt("Horroribo Bleibären", 42, 199);
        Produkt b = new Produkt("Lautwienix! Schlagzeugset", 9910, 19900);
        Produkt c = new Produkt("Tasmanischer Käse", 77192, 449);

        assertEquals(true,  a.istKleinerAls(b));
        
        assertEquals(true,  a.istKleinerAls(c));
        
        assertEquals(false, b.istKleinerAls(a));
        
        assertEquals(true,  b.istKleinerAls(c));
        
        assertEquals(false, c.istKleinerAls(a));
        
        assertEquals(false, c.istKleinerAls(b));
        
    }
    

}
