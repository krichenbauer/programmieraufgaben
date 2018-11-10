class Knoten
{
    Bestellung bestellung;
    Knoten nachfolger;
    
    Knoten(Bestellung b)
    {
        bestellung = b;
    }
    
    Bestellung bestellungGeben() {
        return bestellung;
    }
    
    
    //zu Teilaufgabe b)
    void bestellungHinzufuegen(Bestellung b) {
        if (nachfolger != null) {
            nachfolger.bestellungHinzufuegen(b);
        } else {
            nachfolger = new Knoten(b);
        }
    }
    
    //zu Teilaufgabe b)
    boolean hatNachfolger() {
        return (nachfolger != null);
    }
    
    //zu Teilaufgabe b)
    Knoten nachfolgerGeben() {
        return nachfolger;
    }
    
    //zu Teilaufgabe c)
    void undo() {
        if (nachfolger != null) {
            if (nachfolger.nachfolgerGeben() != null) {
                nachfolger.undo();
            } else {
                nachfolger = null;
            }
        }
    }
    
    //zu Teilaufgabe 3b)
    int kleineGetraenkeZaehlen() {
        if (nachfolger != null) {
            if (bestellung.istGross()) {
                return nachfolger.kleineGetraenkeZaehlen();
            } else {
                return 1+nachfolger.kleineGetraenkeZaehlen();
            }
        
        } else {
            if (bestellung.istGross()) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
