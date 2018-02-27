class Knoten
{
    Produkt produkt;

    Knoten(Produkt neuesProdukt)
    {
        produkt = neuesProdukt;
    }

    Produkt produktGeben() {
        return produkt;
    }

    //Aufgabe 2b
    Knoten linkerNachfolger;
    Knoten rechterNachfolger;

    Knoten linkerNachfolgerGeben() {
        return linkerNachfolger;
    }
    Knoten rechterNachfolgerGeben() {
        return rechterNachfolger;
    }
    
    boolean hatLinkenNachfolger() {
        return (linkerNachfolger != null);
    }
    boolean hatRechtenNachfolger() {
        return (rechterNachfolger != null);
    }
    
    boolean mussRechtsEinsortiertWerden(Knoten andererKnoten) {
        return produkt.istKleinerAls(andererKnoten.produktGeben());
    }
    
    //Aufgabe 2c
    void knotenEinsortieren(Knoten neuerKnoten) {
        if (mussRechtsEinsortiertWerden(neuerKnoten)) {
            if (hatRechtenNachfolger()) {
                rechterNachfolgerGeben().knotenEinsortieren(neuerKnoten);
            } else {
                rechterNachfolger = neuerKnoten;
            }
        } else {
            if (hatLinkenNachfolger()) {
                linkerNachfolgerGeben().knotenEinsortieren(neuerKnoten);
            } else {
                linkerNachfolger = neuerKnoten;
            }
        }
    }
    
    //Aufgabe 3b
    Produkt suchen(int artikelNr) {
        if (artikelNr == produkt.artikelNrGeben()) {
            return produkt;
        } else {
            if (artikelNr < produkt.artikelNrGeben()) {
                if (hatLinkenNachfolger()) {
                    return linkerNachfolgerGeben().suchen(artikelNr);
                } else {
                    return null;
                }
            } else {
                if (hatRechtenNachfolger()) {
                    return rechterNachfolgerGeben().suchen(artikelNr);
                } else {
                    return null;
                }
            }
        }
    }

}
