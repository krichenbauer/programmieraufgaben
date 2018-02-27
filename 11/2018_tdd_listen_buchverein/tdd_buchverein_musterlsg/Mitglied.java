class Mitglied
{
    String vorname;
    String nachname;
    
    Mitglied(String v, String n)
    {
        vorname = v;
        nachname = n;
        
        /*Aufgabe 1c*/
        if (vorname == null || vorname.length() < 1) {
            vorname = "!!!FEHLER!!!";
            nachname = "!!!FEHLER!!!";
        } else if (nachname == null || nachname.length() < 1) {
            vorname = "!!!FEHLER!!!";
            nachname = "!!!FEHLER!!!";
        }
        
    }
    
    String vornameGeben() {
        return vorname;
    }
    
    String nachnameGeben() {
        return nachname;
    }
    
    /*Aufgabe1b*/
    
    void nachnameAendern(String n) {
        nachname = n;
    }
    
}
