import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe1a
{
    @Test
    public void WebAdresseTest() {
        WebAdresse a = new WebAdresse("inf.gym-hksb.de");

        assertEquals("inf.gym-hksb.de", a.adresseGeben());
    }    
}
