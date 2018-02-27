class Knoten
{
    Mitglied mitglied;
    
    Knoten(Mitglied m)
    {
        mitglied = m;
    }

    Mitglied mitgliedGeben() {
        return mitglied;
    }

    //Aufgabe 2b
    Knoten nachfolger;
    void nachfolgerHinzufuegen(Knoten k) {
        if (nachfolger == null) {
            nachfolger = k;
        } else {
            nachfolger.nachfolgerHinzufuegen(k);
        }
    }
    
    boolean hatNachfolger() {
        return (nachfolger!=null);
    }
    
    Knoten nachfolgerGeben() {
        return nachfolger;
    }
    
    //Aufgabe 2c
    void knotenEntfernen(Mitglied m) {
        if (nachfolger == null) {
            return;
        } else if (nachfolger.mitgliedGeben().equals(m)) {
            nachfolger=nachfolger.nachfolgerGeben();
        } else {
            nachfolger.knotenEntfernen(m);
        }
    }
    
    //Aufgabe 3b
    Mitglied letztesMitgliedGeben() {
        if (nachfolger == null) {
            return mitglied;
        } else {
            return nachfolger.letztesMitgliedGeben();
        }
    }
}
