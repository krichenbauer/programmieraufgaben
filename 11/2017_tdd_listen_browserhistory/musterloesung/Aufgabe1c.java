import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe1c
{
    @Test
    public void WebAdresseAlsDatenelementTest() {
        DatenElement d = new WebAdresse("www.google.de");
    
        assertEquals("www.google.de", d.textGeben());
        
    }

}