class BuchListe
{
    Knoten erster;
    
    BuchListe()
    { }
    
    void mitgliedAnstellen(Mitglied m) {
        Knoten k = new Knoten(m);
        if (erster == null) {
            erster = k;
        } else {
            erster.nachfolgerHinzufuegen(k);
        }
    }
    
    Mitglied naechstesMitgliedEntnehmen() {
        if (erster == null) {
            return null;
        } else {
            Mitglied result = erster.mitgliedGeben();
            erster = erster.nachfolgerGeben();
            return result;
        }
    }
    
    //Aufgabe 3b
    Mitglied letztesMitgliedGeben() {
        if (erster == null) {
            return null;
        } else {
            return erster.letztesMitgliedGeben();
        }
    }
    
    //Aufgabe 3c
    void mitgliedEntfernen(Mitglied m) {
        if (erster == null) {
            return;
        } else {
            if (erster.mitgliedGeben().equals(m)) {
                naechstesMitgliedEntnehmen();
            } else {
                erster.knotenEntfernen(m); 
            }
        }
    }


}
