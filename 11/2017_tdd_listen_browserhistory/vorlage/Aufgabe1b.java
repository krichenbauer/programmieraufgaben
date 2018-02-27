import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe1b
{
    @Test
    public void WebAdresseAlsDatenelementTest() {
        DatenElement d = new WebAdresse("www.google.de");

        //wandelt den Datentyp zu WebAdresse um... 
        WebAdresse a = (WebAdresse) d;
        
        assertEquals("www.google.de", a.adresseGeben());
    }

}
