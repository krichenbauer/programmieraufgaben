class ProduktSuchBaum
{
    Knoten wurzel;
    
    ProduktSuchBaum()
    {}

    Knoten wurzelGeben()
    {
        return wurzel;
    }
    
    void produktEinsortieren(Produkt neuesProdukt) {
        Knoten k = new Knoten(neuesProdukt);
        
        if (wurzel != null) {
            wurzel.knotenEinsortieren(k);
        } else {
            wurzel = k;
        }
    }
    
    //Aufgabe 3b
    Produkt suchen(int artikelNr) {
        if (wurzel == null) {
            return null;
        } else {
            return wurzel.suchen(artikelNr);
        }
    }
}
