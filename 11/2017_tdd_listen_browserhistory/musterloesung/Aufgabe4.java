

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Aufgabe4
{
    History meineHistory;
    
    @Test
    public void LeereHistoryAnlegen() {
        meineHistory = new History();
        
        String result;

        //Falls die eigentlich zu testende Methode einen Fehler "nullPointerException" liefert, ist das hier auch ok, daher das try/catch...
        try {
            result = meineHistory.webAdresseEntnehmen();
        } catch (Exception e) {
            result = null;
        }
        
        assertEquals(null,result);
    }
    
    @Test
    public void einElementInHistoryLegenUndEntnehmen() {
        meineHistory = new History();
        meineHistory.webAdresseHinzufuegen("www.google.de");
        
        assertEquals("www.google.de", meineHistory.webAdresseEntnehmen());
        
        
        //Falls die eigentlich zu testende Methode einen Fehler liefert, ist das hier richtig, daher das try/catch...
        String result;
        try {
            result = meineHistory.webAdresseEntnehmen();
        } catch (Exception e) {
            result = null;
        }
        
        
        assertEquals(null,result );
        
        
        
    }
    
     @Test
    public void mehrereElementeInHistoryLegenUndEntnehmen() {
        meineHistory = new History();
        meineHistory.webAdresseHinzufuegen("www.google.de");
        meineHistory.webAdresseHinzufuegen("www.gym-hksb.de");
        meineHistory.webAdresseHinzufuegen("de.wikipedia.org");
        
        
        assertEquals("de.wikipedia.org", meineHistory.webAdresseEntnehmen());
        assertEquals("www.gym-hksb.de", meineHistory.webAdresseEntnehmen());
        assertEquals("www.google.de", meineHistory.webAdresseEntnehmen());
        
        
        //Falls die eigentlich zu testende Methode einen Fehler liefert, ist das hier richtig, daher das try/catch...
        String result;
        try {
            result = meineHistory.webAdresseEntnehmen();
        } catch (Exception e) {
            result = null;
        }
        
        
        assertEquals(null,result );
        
        
        
    }
    
}

